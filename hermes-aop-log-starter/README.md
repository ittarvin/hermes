## hermes-aop-log-starter 日志拦截器模块
 
第一步：声明注解扫描
```java
@EnableFeignClients({"com.hermes.log"})
@ComponentScan({"com.hermes.log"})
```
第二步：Controller 请求方法上配置引用
```java
@FeignLog(model = "", optType = OptTypeEnum.MODIFY, desc = "", systemName = SystemTypeEnum.SERVICE)
```

## 2021-03-31
优化 hermes-aop-log-starter 日志拦截器模块
- 项目中删除声明注解扫描
- pom 文件中添加如下引用即可
```
 <dependency>
  <groupId>com.hermes</groupId>
  <artifactId>hermes-aop-log-starter</artifactId>
  <version>1.0.0</version>
</dependency>
```