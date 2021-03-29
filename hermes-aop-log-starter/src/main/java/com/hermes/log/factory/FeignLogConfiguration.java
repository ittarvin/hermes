package com.hermes.log.factory;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义starter配置类，
 * 当环境中存在MyLog修饰的方法时才加载这个配置类，做到动态插拔作用
 */
@Configuration
@ConditionalOnBean(annotation = com.hermes.log.FeignLog.class)
public class FeignLogConfiguration {

}
