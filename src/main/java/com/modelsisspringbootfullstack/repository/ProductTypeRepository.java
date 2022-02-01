package com.modelsisspringbootfullstack.repository;

import com.modelsisspringbootfullstack.entities.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductTypeRepository extends JpaRepository<ProductType,Long> {
    public ProductType findProductTypeByName(String name);
}
