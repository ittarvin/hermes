众神的使者 v1.0.0 

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

## 2021-04-08
新增案例实践
- CLI Admin Tool 查询 clusterList
```
./mqadmin clusterList -n localhost:9876
```
输出结果：
```
#Cluster Name     #Broker Name            #BID  #Addr                  #Version                #InTPS(LOAD)       #OutTPS(LOAD) #PCWait(ms) #Hour #SPACE
DefaultCluster    baoxiandaili-wangpengfei-1.novalocal  0     172.17.47.163:10911    V4_8_0                   0.00(0,0ms)         0.00(0,0ms)          0 449402.73 0.0463
```

- CLI Admin Tool 创建 TOPIC
```
./mqadmin updateTopic -n 172.17.47.163:9876 -c DefaultCluster -t TopicTest
```
输出结果：
```
RocketMQLog:WARN No appenders could be found for logger (io.netty.util.internal.PlatformDependent0).
RocketMQLog:WARN Please initialize the logger system properly.
create topic to 172.17.47.163:10911 success.
TopicConfig [
topicName=TopicTest, 
readQueueNums=8, 
writeQueueNums=8, 
perm=RW-, 
topicFilterType=SINGLE_TAG, 
topicSysFlag=0, 
order=false]
```
- CLI Admin Tool 查询 TOPICLIST
```
./mqadmin topicList -n 172.17.47.163:9876
```
输出结果：
```
RocketMQLog:WARN No appenders could be found for logger (io.netty.util.internal.PlatformDependent0).
RocketMQLog:WARN Please initialize the logger system properly.
SCHEDULE_TOPIC_XXXX
RMQ_SYS_TRANS_HALF_TOPIC
DefaultCluster_REPLY_TOPIC
BenchmarkTest
OFFSET_MOVED_EVENT
TopicTest
TBW102
baoxiandaili-wangpengfei-1.novalocal
SELF_TEST_TOPIC
DefaultCluster
```

- 执行测试代码 com.hermes.example.simple.SyncProducer
```
SendResult [sendStatus=SEND_OK, msgId=C0A8BADF077018B4AAC2266162980000, offsetMsgId=AC112FA300002A9F0000000000000000, messageQueue=MessageQueue [topic=TopicTest, brokerName=baoxiandaili-wangpengfei-1.novalocal, queueId=3], queueOffset=0]
SendResult [sendStatus=SEND_OK, msgId=C0A8BADF077018B4AAC22661642F0001, offsetMsgId=AC112FA300002A9F00000000000000C9, messageQueue=MessageQueue [topic=TopicTest, brokerName=baoxiandaili-wangpengfei-1.novalocal, queueId=4], queueOffset=0]
SendResult [sendStatus=SEND_OK, msgId=C0A8BADF077018B4AAC22661642F0002, offsetMsgId=AC112FA300002A9F0000000000000192, messageQueue=MessageQueue [topic=TopicTest, brokerName=baoxiandaili-wangpengfei-1.novalocal, queueId=5], queueOffset=0]
SendResult [sendStatus=SEND_OK, msgId=C0A8BADF077018B4AAC22661643F0003, offsetMsgId=AC112FA300002A9F000000000000025B, messageQueue=MessageQueue [topic=TopicTest, brokerName=baoxiandaili-wangpengfei-1.novalocal, queueId=6], queueOffset=0]
SendResult [sendStatus=SEND_OK, msgId=C0A8BADF077018B4AAC22661643F0004, offsetMsgId=AC112FA300002A9F0000000000000324, messageQueue=MessageQueue [topic=TopicTest, brokerName=baoxiandaili-wangpengfei-1.novalocal, queueId=7], queueOffset=0]
SendResult [sendStatus=SEND_OK, msgId=C0A8BADF077018B4AAC22661644E0005, offsetMsgId=AC112FA300002A9F00000000000003ED, messageQueue=MessageQueue [topic=TopicTest, brokerName=baoxiandaili-wangpengfei-1.novalocal, queueId=0], queueOffset=0]
SendResult [sendStatus=SEND_OK, msgId=C0A8BADF077018B4AAC22661644E0006, offsetMsgId=AC112FA300002A9F00000000000004B6, messageQueue=MessageQueue [topic=TopicTest, brokerName=baoxiandaili-wangpengfei-1.novalocal, queueId=1], queueOffset=0]
SendResult [sendStatus=SEND_OK, msgId=C0A8BADF077018B4AAC22661645E0007, offsetMsgId=AC112FA300002A9F000000000000057F, messageQueue=MessageQueue [topic=TopicTest, brokerName=baoxiandaili-wangpengfei-1.novalocal, queueId=2], queueOffset=0]
SendResult [sendStatus=SEND_OK, msgId=C0A8BADF077018B4AAC22661645E0008, offsetMsgId=AC112FA300002A9F0000000000000648, messageQueue=MessageQueue [topic=TopicTest, brokerName=baoxiandaili-wangpengfei-1.novalocal, queueId=3], queueOffset=1]
SendResult [sendStatus=SEND_OK, msgId=C0A8BADF077018B4AAC22661646D0009, offsetMsgId=AC112FA300002A9F0000000000000711, messageQueue=MessageQueue [topic=TopicTest, brokerName=baoxiandaili-wangpengfei-1.novalocal, queueId=4], queueOffset=1]
```

- CLI Admin Tool 查询状态
```
./mqadmin statsAll -n 172.17.47.163:9876
```
输出结果：TopicTest 存在 100 个未被消费数据
```
#Topic                            #Consumer Group                  #Accumulation      #InTPS     #OutTPS   #InMsg24Hour  #OutMsg24Hour
SCHEDULE_TOPIC_XXXX                                                           0        0.00                          0    NO_CONSUMER
RMQ_SYS_TRANS_HALF_TOPIC                                                      0        0.00                          0    NO_CONSUMER
DefaultCluster_REPLY_TOPIC                                                    0        0.00                          0    NO_CONSUMER
BenchmarkTest                                                                 0        0.00                          0    NO_CONSUMER
OFFSET_MOVED_EVENT                                                            0        0.00                          0    NO_CONSUMER
TopicTest                                                                     0        0.00                        100    NO_CONSUMER
TBW102                                                                        0        0.00                          0    NO_CONSUMER
baoxiandaili-wangpengfei-1.noval                                              0        0.00                          0    NO_CONSUMER
SELF_TEST_TOPIC                                                               0        0.00                          0    NO_CONSUMER
DefaultCluster                                                                0        0.00                          0    NO_CONSUMER
```
