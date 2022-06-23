package com.cgamilton.example01.consumer;

import com.cgamilton.example01.producer.model.OrderService;
import io.vertx.core.json.JsonObject;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class OrderServiceConsumer {

    @Incoming("order-service")
    public void consume(JsonObject json){
        System.out.println(json.mapTo(OrderService.class));
    }
}
