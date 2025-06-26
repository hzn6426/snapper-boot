package com.baomibing.gateway.config;

import com.baomibing.gateway.filter.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * SnamGatewayConfiguration
 *
 * @author zening
 * @version 1.0.0
 **/
@Configuration
public class SnapperGatewayConfiguration {

    @Bean
	public BlackListFilter blackListFilter() {
		return new BlackListFilter();
	}

	@Bean
	public JwtTokenFilter jwtTokenFilter() {
		return new JwtTokenFilter();
	}

	@Bean
	public RateLimitFilter rateLimiterFilter() {
		return new RateLimitFilter();
	}

	@Bean
	public LogTraceFilter logTraceFilter() {
		return new LogTraceFilter();
	}


	@Bean
	public AuthorizationFilter authorizationFilter() {
		return new AuthorizationFilter();
	}

	@Bean
	public HmacFilter hmacFilter() {
		return new HmacFilter();
	}

	@Bean
	public HmacAuthorizationFilter hmacAuthorizationFilter() {
		return new HmacAuthorizationFilter();
	}

	@Bean
	public ThirdPartFilter thirdPartFilter() {
		return new ThirdPartFilter();
	}



}
