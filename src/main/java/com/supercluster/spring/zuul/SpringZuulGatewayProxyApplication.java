package com.supercluster.spring.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.supercluster.spring.zuul.filters.ErrorFilter;
import com.supercluster.spring.zuul.filters.PostFilter;
import com.supercluster.spring.zuul.filters.PreFilter;
import com.supercluster.spring.zuul.filters.RouteFilter;

@SpringBootApplication
@EnableZuulProxy 
public class SpringZuulGatewayProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringZuulGatewayProxyApplication.class, args);
	}
	
	@Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }
    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }
    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }
    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }

}

