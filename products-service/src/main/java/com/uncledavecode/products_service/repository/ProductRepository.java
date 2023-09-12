package com.uncledavecode.products_service.repository;

import com.uncledavecode.products_service.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
