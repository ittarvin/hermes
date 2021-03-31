package com.hermes.log.factory;

import com.hermes.log.FeignLog;
import com.hermes.log.aop.FeignLogStarterAOP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义starter配置类，
 * 当环境中存在MyLog修饰的方法时才加载这个配置类，做到动态插拔作用
 */
@Configuration
@EnableFeignClients
@ConditionalOnMissingBean(annotation = FeignLog.class)
public class FeignLogConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(FeignLogConfiguration.class);


    public FeignLogConfiguration() {
        logger.info("初始化 BXCXFeignLog 配置声明");
    }

    @Bean
    static FeignLogStarterAOP feignBXCXLogStarterAOP(){
        return new FeignLogStarterAOP();
    }

}
