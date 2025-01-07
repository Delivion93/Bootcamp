package com.example.FirstSpringProject.dataBaseTest;

import com.example.FirstSpringProject.entity.Product;
import com.example.FirstSpringProject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String...args) throws Exception {
        Product product = new Product();
        product.setName("Sample Product");
        product.setPrice(9.99);
        product.setStock(100);
        productRepository.save(product);

        productRepository.findAll().forEach(System.out::println);
    }

}
