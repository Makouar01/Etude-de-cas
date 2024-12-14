package com.saad.reservation.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.makouar.reservation.core", "com.makouar.reservation.graphql"})
public class ReservationGraphqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReservationGraphqlApplication.class, args);
    }
}