package com.order.ProjectOrders.service;

import com.order.ProjectOrders.dtos.OrderLineItemsDto;
import com.order.ProjectOrders.dtos.OrderRequestDto;
import com.order.ProjectOrders.model.Order;
import com.order.ProjectOrders.model.OrderLineItems;
import com.order.ProjectOrders.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public void placeOrder(OrderRequestDto dto) {
        Order order = new Order();
        order.setNumberOrder(UUID.randomUUID().toString());
        List<OrderLineItems> orderLineItems = dto.getOrderLineItemsDtos()
                .stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
        order.setOrderLineItemsList(orderLineItems);
    }

    private OrderLineItems mapToDto(OrderLineItemsDto orderLineItemsDto) {
        return OrderLineItems.builder()
                .codeSku(orderLineItemsDto.getCodeSku())
                .price(orderLineItemsDto.getPrice())
                .quantity(orderLineItemsDto.getQuantity())
                .build();
    }
}
