公共平台 v1.0.0 

设计文档地址 ：https://xie.infoq.cn/article/f77e07fd645f8a8bc1979fa09


##2021-03-29
新增 AOP 日志拦截器注解

引用方式：
```java
@FeignLog(model = "", optType = OptTypeEnum.MODIFY, desc = "", systemName = SystemTypeEnum.SERVICE)
```

新增注解
```java
@EnableFeignClients({"com.hermes.log"})
@ComponentScan({"com.hermes.log"})
```
