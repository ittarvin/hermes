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
- 架构文档参考 http://rocketmq.apache.org/docs/rmq-arc/  
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
- copy rocketmq-4.8.0.zip 到  /opt/soft/
```
  cd rocketmq-all-4.8.0-source-release/distribution/target/rocketmq-4.8.0
  cp rocketmq-4.8.0.zip /opt/soft/ 
  cd /opt/soft/
  unzip rocketmq-4.8.0.zip  
```
- 启动 rocketmq （Start Name Server）
```
cd /opt/soft/rocketmq-4.8.0/bin
nohup sh mqnamesrv &
tail -fn 100 ~/logs/rocketmqlogs/namesrv.log
```
- 启动 rocketmq （Start Broker）
```
nohup sh mqbroker -n localhost:9876 &
tail -f ~/logs/rocketmqlogs/broker.log
```
- Rocketmq Broker 异常处理 新建对应目录即可
 ```
Error when measuring disk space usage, file doesn't exist on this path: /root/store/consumequeue
Error when measuring disk space usage, file doesn't exist on this path: /root/store/commitlog
``` 
- 停止服务
```
sh bin/mqshutdown broker
sh bin/mqshutdown namesrv
```
- rocketmq-client 4.3.0
```
<dependency>
    <groupId>org.apache.rocketmq</groupId>
    <artifactId>rocketmq-client</artifactId>
    <version>4.3.0</version>
</dependency>
```
