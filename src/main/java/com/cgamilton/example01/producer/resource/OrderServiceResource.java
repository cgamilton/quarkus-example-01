package com.cgamilton.example01.producer.resource;

import com.cgamilton.example01.producer.model.OrderService;
import com.cgamilton.example01.producer.model.OSRequest;
import com.cgamilton.example01.producer.service.OrderServiceService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/os")
public class OrderServiceResource {

    @Inject
    OrderServiceService osService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public OrderService newOS(OSRequest request){
        return osService.create(request);
    }
}
