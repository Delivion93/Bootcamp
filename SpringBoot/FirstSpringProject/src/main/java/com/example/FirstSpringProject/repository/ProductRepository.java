package com.example.FirstSpringProject.repository;

import com.example.FirstSpringProject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
