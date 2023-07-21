package com.order.ProjectOrders.controller;

import com.order.ProjectOrders.dtos.OrderRequestDto;
import com.order.ProjectOrders.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ordersUdemy")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("/make")
    @ResponseStatus(HttpStatus.CREATED)
    public String makeOrder(@RequestBody OrderRequestDto dto) {
        service.placeOrder(dto);
        return "Order made successfully!";
    }
}
