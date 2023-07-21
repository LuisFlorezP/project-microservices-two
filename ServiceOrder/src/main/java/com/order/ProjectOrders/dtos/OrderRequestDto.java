package com.order.ProjectOrders.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderRequestDto {

    private List<OrderLineItemsDto> orderLineItemsDtos;

    public List<OrderLineItemsDto> getOrderLineItemsDtos() {
        return orderLineItemsDtos;
    }

    public void setOrderLineItemsDtos(List<OrderLineItemsDto> orderLineItemsDtos) {
        this.orderLineItemsDtos = orderLineItemsDtos;
    }
}
