package com.hermes.log.aop;


import com.hermes.json.JSONUtil;
import com.hermes.log.FeignLog;
import com.hermes.log.feign.LogInterfaceFeignClient;
import com.hermes.log.msg.UserOperationLogVO;
import com.hermes.network.IPUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 自定义日志输出AOP切面，定义以添加了MyLog注解的所有方法作为连接点，
 * 这些连接点触发时定义对应正常方法返回时通知以及异常发生时通知
 */
@Aspect
@Component
public class FeignLogStarterAOP {

    Logger logger = LoggerFactory.getLogger(FeignLogStarterAOP.class);

    @Resource
    private LogInterfaceFeignClient logInterfaceFeignClient;

    /**
     * 切点连接点：在BXCXFeignLog注解的位置切入
     */
    @Pointcut("@annotation(com.sinoiov.bxcx.feign.log.BXCXFeignLog)")
    public void logInsert() {
    }
    /**
     * 异常发生时的通知
     * @param joinPoint
     * @param e
     */
    @AfterThrowing(pointcut = "logInsert()", throwing = "e")
    public void doExceptionMyLog(JoinPoint joinPoint, Throwable e) {

    }

    @Around(value = "logInsert()")
    public Object around(ProceedingJoinPoint point) {
        Object result = null;
        long start, end, time;
        try {
            start = System.currentTimeMillis();
            result = point.proceed();
            UserOperationLogVO userOperationLogVO = this.getMyLog(point, result, null);
            end = System.currentTimeMillis();
            time = end - start;
            userOperationLogVO.setResponseTime((int) time);
            logger.info("日志操作记录入库....................:{}", JSONUtil.objct2Json(userOperationLogVO));
            logInterfaceFeignClient.insertLog(userOperationLogVO);
        } catch (Exception e) {
            logger.error("异常信息:{}", e);
        } catch (Throwable throwable) {
            logger.error("异常信息:{}", throwable.getMessage());
        }
        return result;
    }


    /**
     * 获取输出日志实体
     *
     * @param joinPoint 触发的连接点
     * @param keys      返回值
     * @param e         异常对象
     * @return UserOperationLogVO
     */
    private UserOperationLogVO getMyLog(JoinPoint joinPoint, Object keys, Throwable e) {

        // 获取RequestAttributes
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        // 从获取RequestAttributes中获取HttpServletRequest的信息
        HttpServletRequest request = (HttpServletRequest) requestAttributes
                .resolveReference(RequestAttributes.REFERENCE_REQUEST);
        // 输出日志VO
        UserOperationLogVO userOperationLogVO = new UserOperationLogVO();
        try {
            // 从切面织入点处通过反射机制获取织入点处的方法
            MethodSignature signature = (MethodSignature) joinPoint.getSignature();
            // 获取切入点所在的方法
            Method method = signature.getMethod();
            // 获取操作
            FeignLog bxcxLog = method.getAnnotation(FeignLog.class);
            if (!ObjectUtils.isEmpty(bxcxLog)) {
                userOperationLogVO.setModel(bxcxLog.model());
                userOperationLogVO.setOptType(bxcxLog.optType().getType());
                userOperationLogVO.setSystemName(bxcxLog.systemName().getType());
                userOperationLogVO.setDesc(bxcxLog.desc());
            }
            userOperationLogVO.setIp(IPUtils.getCliectIp(request));
            // 获取请求的类名
            String className = joinPoint.getTarget().getClass().getName();
            userOperationLogVO.setClassName(className);
            // 获取请求的方法名
            String methodName = method.getName();
            userOperationLogVO.setMethodName(methodName);

            userOperationLogVO.setRequestUrl(request.getRequestURI());

            //异常名称+异常信息
            if (null != e) {
                userOperationLogVO.setExcName(e.getClass().getName());
                userOperationLogVO.setExcInfo(stackTraceToString(e.getClass().getName(), e.getMessage(), e.getStackTrace()));
            }

            //请求的参数，参数所在的数组转换成json
            Map<String, String> rtnMap = converMap(request.getParameterMap());

            if(joinPoint.getArgs().length>0){
                userOperationLogVO.setRequestParams(JSONUtil.beanToJsonStr(joinPoint.getArgs()[0]));
            }

            userOperationLogVO.setUserName(request.getAttribute("USER_ID").toString());

        } catch (Exception ex) {
            logger.error("BXCXFeignLog 异常信息:{}", ex);
        }
        return userOperationLogVO;
    }


    /**
     * 转换request 请求参数
     *
     * @param paramMap
     * @return
     */
    private Map<String, String> converMap(Map<String, String[]> paramMap) {
        Map<String, String> rtnMap = new HashMap<>();
        for (String key : paramMap.keySet()) {
            rtnMap.put(key, paramMap.get(key)[0]);
        }
        return rtnMap;
    }

    /**
     * 转换异常信息为字符串
     *
     * @param exceptionName
     * @param exceptionMessage
     * @param elements
     * @return
     */
    private String stackTraceToString(String exceptionName, String exceptionMessage, StackTraceElement[] elements) {
        StringBuffer strbuff = new StringBuffer();
        for (StackTraceElement stet : elements) {
            strbuff.append(stet + "\n");
        }
        String message = exceptionName + ":" + exceptionMessage + "\n\t" + strbuff.toString();
        return message;
    }

}
