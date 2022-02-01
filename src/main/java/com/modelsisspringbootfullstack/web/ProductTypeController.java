package com.modelsisspringbootfullstack.web;

import com.modelsisspringbootfullstack.entities.ProductType;
import com.modelsisspringbootfullstack.repository.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductTypeController {

    @Autowired
    ProductTypeRepository productTypeRepository;

    @GetMapping("/productTypes")
    public List<ProductType> ListProductTypes(){
        return productTypeRepository.findAll();
    }

    @PostMapping("/productType")
    public ProductType save(@RequestBody ProductType type) {
        return productTypeRepository.save(type);
    }

    @GetMapping("/productType/{id}")
    public Optional<ProductType> getType(@PathVariable Long id) {
        return productTypeRepository.findById(id);
    }
}
