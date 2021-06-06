package com.github.nesmelov.simplerestservice.service;

import com.github.nesmelov.simplerestservice.ProductRepository;
import com.github.nesmelov.simplerestservice.entity.Product;
import com.github.nesmelov.simplerestservice.exception.NoSuchProductException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

  private final ProductRepository productRepository;

  @Autowired
  public ProductServiceImpl(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @Override
  public List<Product> getAllProducts() {
    return productRepository.findAll();
  }

  @Override
  public Product getProductById(Long id) {
    return productRepository.findById(id)
        .orElseThrow(() -> new NoSuchProductException("id {" + id + "} is not found"));
  }

  @Override
  public void editProduct(Long id, Product product) {
    productRepository.save(Product.copyWithId(product, id));
  }

  @Override
  public Product addProduct(Product product) {
    return productRepository.save(product);
  }

}
