package com.inventory.ProjectInventories.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InventoryResponseDto {

    private String codeSku;
    private boolean inStock;

    public String getCodeSku() {
        return codeSku;
    }

    public void setCodeSku(String codeSku) {
        this.codeSku = codeSku;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
