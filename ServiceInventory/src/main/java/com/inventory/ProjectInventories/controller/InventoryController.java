package com.inventory.ProjectInventories.controller;

import com.inventory.ProjectInventories.dto.InventoryResponseDto;
import com.inventory.ProjectInventories.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventoriesUdemy")
public class InventoryController {

    @Autowired
    private InventoryService service;

    @GetMapping("/stock")
    public List<InventoryResponseDto> isInStock(@RequestParam List<String> codeSku) {
        return service.isInStock(codeSku);
    }
}
