package com.github.nesmelov.simplerestservice.service;

import com.github.nesmelov.simplerestservice.entity.Product;
import java.util.List;

public interface ProductService {

  List<Product> getAllProducts();

  Product getProductById(Long id);

  void editProduct(Long id, Product product);

  Product addProduct(Product product);
}
