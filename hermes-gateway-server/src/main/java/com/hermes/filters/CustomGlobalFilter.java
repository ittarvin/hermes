package com.hermes.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.support.ServerWebExchangeUtils;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;


/**
 * 自定义全局过滤器
 * @date 20210322
 * @author 王鹏飞
 *
 */
@Component
public class CustomGlobalFilter implements GatewayFilter, Ordered {


    Logger logger = LoggerFactory.getLogger(CustomGlobalFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        logger.info("全局校验-处理线程 {}" ,Thread.currentThread().getId());


        return chain.filter(exchange);
    }


    @Override
    public int getOrder() {
        return 0;
    }



}
