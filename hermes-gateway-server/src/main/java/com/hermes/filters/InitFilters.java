package com.hermes.filters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class InitFilters {



	@Autowired
	private CustomGlobalFilter customGlobalFilter;

	@Autowired
	private SecurityFilter securityFilter;

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {

		return builder.routes()

				// 免登校验验证码登录
				.route(r -> r.path("/hermes-admin-server/**")
						.filters(f ->f.stripPrefix(1).
								filter(customGlobalFilter).filter(securityFilter)
						).uri("lb://HERMES-ADMIN-SERVER"))

				.build();


	}


}
