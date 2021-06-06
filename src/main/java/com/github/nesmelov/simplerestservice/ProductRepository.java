package com.github.nesmelov.simplerestservice;

import com.github.nesmelov.simplerestservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
