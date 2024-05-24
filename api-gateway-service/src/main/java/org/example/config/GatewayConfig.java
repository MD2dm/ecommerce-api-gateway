package org.example.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableHystrix
public class GatewayConfig {

//    @Autowired
//    private AuthenticationFilter filter;

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder){
//        return builder.routes()
//                .route("authentication-service", r -> r.path("/auth/**")
//                        .filters(f -> f.filter(filter))
//                        .uri("lb://auth-service"))
//                .build();
        return builder.routes()
                .route("authentication-service", r -> r.path("/auth/**")
                        .uri("lb://authentication-service"))
                .build();
    }
}
