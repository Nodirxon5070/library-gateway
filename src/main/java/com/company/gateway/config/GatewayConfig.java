package com.company.gateway.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {


    /*@Bean
    public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route("account-service-get-filter",
                        r -> r.path("/account-service/account/color")
                                .filters(f -> f.localResponseCache(
                                                Duration.of(30, ChronoUnit.SECONDS),
                                                DataSize.of(500, DataUnit.TERABYTES)
                                        )
                                )
                                .uri("lb://account-service")
                )
                .build();
    }*/


}
