package com.NexLab.services;

import com.NexLab.domains.Product;
import com.NexLab.repositories.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InventoryServiceImpl implements InventoryService{

    @Autowired
    InventoryRepository inventoryRepository;

    @Override
    public Product create(Product product) {
        return inventoryRepository.save(product);
    }

    @Override
    public List<Product> get() {
        return inventoryRepository.findAll();
    }

    @Override
    public Product getOne(Long id) {
        return inventoryRepository.findById(id).orElseThrow(()-> new RuntimeException("Product Not Found!"));
    }
}
