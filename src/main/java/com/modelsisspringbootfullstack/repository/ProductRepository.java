package com.modelsisspringbootfullstack.repository;

import com.modelsisspringbootfullstack.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
