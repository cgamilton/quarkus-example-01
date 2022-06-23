package com.cgamilton.example01.producer.service;

import com.cgamilton.example01.producer.model.OrderService;
import com.cgamilton.example01.producer.model.OSRequest;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class OrderServiceService {
    @Inject
    @Channel("order-service-out")
    Emitter<OrderService> emitter;
    public OrderService create(OSRequest osRequest) {
        var os = new OrderService();
        os.setName(osRequest.getName());
        os.setLastName(osRequest.getLastName());
        os.setDate(LocalDateTime.now());
        os.setOsNumber(UUID.randomUUID().toString());

        queueOs(os);

        return os;
    }

    void queueOs(OrderService os) {
        emitter.send(os);
    }
}
