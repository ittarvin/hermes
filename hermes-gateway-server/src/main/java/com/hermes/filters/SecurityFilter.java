package com.hermes.filters;

import com.hermes.conf.WhitePathConfig;
import com.hermes.json.JSONUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.support.ServerWebExchangeUtils;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;


/**
 * 自定义全局过滤器
 * @date 20210322
 * @author 王鹏飞
 *
 */
@Component
public class SecurityFilter implements GatewayFilter, Ordered {


    Logger logger = LoggerFactory.getLogger(SecurityFilter.class);


    @Autowired
    WhitePathConfig whitePathConfig;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        LinkedHashSet<URI> urls = exchange.getRequiredAttribute(ServerWebExchangeUtils.GATEWAY_ORIGINAL_REQUEST_URL_ATTR);

        URI originUri = urls.stream().findFirst().get();

        logger.info("安全校验-处理线程 {} 请求路径 PATH {} " ,Thread.currentThread().getId(), originUri.getPath());

        List<String> USER_ID = exchange.getRequest().getHeaders().get("USER_ID");

        List<String> ACCESS_TOKEN = exchange.getRequest().getHeaders().get("ACCESS_TOKEN");

        logger.info(" USER_ID {} accessToken 权限校验 {}",USER_ID,ACCESS_TOKEN);

        if(whitePathConfig.getList().contains(originUri.getPath())){
            return chain.filter(exchange);
        }

        if(CollectionUtils.isEmpty(USER_ID) || CollectionUtils.isEmpty(ACCESS_TOKEN)){
            ServerHttpResponse response = exchange.getResponse();
            HashMap<String,Object> message = new HashMap<>();
            message.put("flag", false);
            message.put("message", "鉴权失败");
            byte[] bits = JSONUtil.beanToJsonObj(message).toJSONString().getBytes(StandardCharsets.UTF_8);
            DataBuffer buffer = response.bufferFactory().wrap(bits);
            response.setStatusCode(HttpStatus.UNAUTHORIZED);
            //指定编码，否则在浏览器中会中文乱码
            response.getHeaders().add("Content-Type", "application/json;charset=utf-8");
            return response.writeWith(Mono.just(buffer));
        }


        return chain.filter(exchange);
    }


    @Override
    public int getOrder() {
        return 1;
    }



}
