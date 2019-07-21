package com.example.zwd.springcloudgateway.utils;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class Config {

	@Bean(name="hostAddrKeyResolver")
	public KeyResolver hostAddrKeyResolver() {
		return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
	}

//	@Bean(name = "userKeyResolver")
//	public KeyResolver userKeyResolver() {
//		return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("userId"));
//	}
//
//	@Bean(name = "apiKeyResolver")
//	public KeyResolver apiKeyResolver() {
//		return exchange -> Mono.just(exchange.getRequest().getPath().value());
//	}

}
