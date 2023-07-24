package com.inventory.ProjectInventories.service;

import com.inventory.ProjectInventories.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository repository;

    @Transactional(readOnly = true)
    public boolean isInStock(String codeSku) {
        return repository.findByCodeSku(codeSku).isPresent();
    }
}
