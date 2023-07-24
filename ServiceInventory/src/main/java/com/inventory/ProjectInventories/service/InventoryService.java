package com.inventory.ProjectInventories.service;

import com.inventory.ProjectInventories.dto.InventoryResponseDto;
import com.inventory.ProjectInventories.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository repository;

    @Transactional(readOnly = true)
    public List<InventoryResponseDto> isInStock(List<String> codeSku) {
        return repository.findByCodeSkuIn(codeSku)
                .stream().map(inventory ->
                    InventoryResponseDto.builder()
                            .codeSku(inventory.getCodeSku())
                            .inStock(inventory.getQuantity() > 0)
                            .build()
                ).collect(Collectors.toList());
    }
}
