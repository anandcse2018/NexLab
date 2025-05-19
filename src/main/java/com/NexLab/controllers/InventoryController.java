package com.NexLab.controllers;

import com.NexLab.domains.Product;
import com.NexLab.services.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class InventoryController {

    @Autowired
    InventoryService inventoryService;

    @GetMapping("/home")
    public String homepage()
    {
        return "Homepage";
    }

    @PostMapping("/add")
    @ResponseBody
    public Product add(@RequestBody Product product)
    {
        return inventoryService.create(product);
    }
}
