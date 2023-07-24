package com.inventory.ProjectInventories.controller;

import com.inventory.ProjectInventories.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventoriesUdemy")
public class InventoryController {

    @Autowired
    private InventoryService service;

    @GetMapping("/stock/{codeSku}")
    public boolean isInStock(@PathVariable String codeSku) {
        return service.isInStock(codeSku);
    }
}
