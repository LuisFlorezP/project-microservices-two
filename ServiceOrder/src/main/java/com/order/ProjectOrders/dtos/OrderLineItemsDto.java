package com.order.ProjectOrders.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderLineItemsDto {

    private String codeSku;
    private BigDecimal price;
    private Integer quantity;


    public String getCodeSku() {
        return codeSku;
    }

    public void setCodeSku(String codeSku) {
        this.codeSku = codeSku;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
