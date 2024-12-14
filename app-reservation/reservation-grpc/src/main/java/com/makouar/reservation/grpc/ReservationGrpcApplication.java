package com.makouar.reservation.grpc;

import com.makouar.reservation.grpc.server.GrpcServer;
import com.makouar.reservation.grpc.services.GrpcChambreServiceImpl;
import com.makouar.reservation.grpc.services.GrpcClientServiceImpl;
import com.makouar.reservation.grpc.services.GrpcReservationServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.makouar.reservation.core", "com.makouar.reservation.grpc"})
public class ReservationGrpcApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ReservationGrpcApplication.class, args);
        Thread.currentThread().join();

        GrpcServer server = new GrpcServer(
                new GrpcClientServiceImpl(),
                new GrpcReservationServiceImpl(),
                new GrpcChambreServiceImpl()
        );
        server.start();
        Thread.currentThread().join();
    }
}
