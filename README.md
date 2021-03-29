公共平台 v1.0.0 

设计文档地址 ：https://xie.infoq.cn/article/f77e07fd645f8a8bc1979fa09


## 2021-03-29
 新增 hermes-aop-log-starter 日志拦截器模块
第一步：声明注解扫描
```java
@EnableFeignClients({"com.hermes.log"})
@ComponentScan({"com.hermes.log"})
```
第二步：Controller 请求方法上配置引用
```java
@FeignLog(model = "", optType = OptTypeEnum.MODIFY, desc = "", systemName = SystemTypeEnum.SERVICE)
```
