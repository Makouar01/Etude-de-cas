package com.makouar.reservation.soap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.makouar.reservation.core", "com.makouar.reservation.soap"})
public class ReservationSoapApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReservationSoapApplication.class, args);
    }
}
