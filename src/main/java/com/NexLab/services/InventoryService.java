package com.NexLab.services;

import com.NexLab.domains.Product;

import java.util.List;

public interface InventoryService {

    public Product create(Product product);

    public List<Product> get();

    public Product getOne(Long id);
}
