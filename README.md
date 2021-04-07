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

## 2021-04-07
新增 hermes-rocketmq-starter 消息中间件
- 版本：rocketmq-all-4.8.0-source-release.zip （RocketMQ-vs-ActiveMQ-vs-Kafka 参考）
```
RocketMQ-vs-ActiveMQ-vs-Kafka.png
```

- 安装方法参考 http://rocketmq.apache.org/docs/quick-start/ 源文件方式安装
- 前置安装 maven 
```
yum install maven
```
- 安装 rocketmq
```
unzip rocketmq-all-4.8.0-source-release.zip
cd rocketmq-all-4.8.0-source-release/
mvn -Prelease-all -DskipTests clean install -U
```
- rocketmq-client 4.3.0
```
<dependency>
    <groupId>org.apache.rocketmq</groupId>
    <artifactId>rocketmq-client</artifactId>
    <version>4.3.0</version>
</dependency>
```
