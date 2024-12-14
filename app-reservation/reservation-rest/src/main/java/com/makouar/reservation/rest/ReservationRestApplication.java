package com.makouar.reservation.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.makouar.reservation.core", "com.makouar.reservation.rest"})
public class ReservationRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReservationRestApplication.class, args);
    }
}
