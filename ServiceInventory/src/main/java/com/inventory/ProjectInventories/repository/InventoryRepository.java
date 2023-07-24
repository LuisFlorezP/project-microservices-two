package com.inventory.ProjectInventories.repository;

import com.inventory.ProjectInventories.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    List<Inventory> findByCodeSkuIn(List<String> codeSku);
}
