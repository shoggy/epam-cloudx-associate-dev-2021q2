package com.github.nesmelov.simplerestservice.controller;

import com.github.nesmelov.simplerestservice.entity.Product;
import com.github.nesmelov.simplerestservice.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

  private final ProductService productService;

  @Autowired
  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @PostMapping
  public Product addProduct(@RequestBody Product product) {
    return productService.addProduct(product);
  }

  @PutMapping(path = "/{id}")
  public void editProduct(@PathVariable Long id, @RequestBody Product product) {
    productService.editProduct(id, product);
  }

  @GetMapping(path = "/{id}")
  public Product getProduct(@PathVariable Long id) {
    return productService.getProductById(id);
  }

  @GetMapping
  public List<Product> getAllProducts() {
    return productService.getAllProducts();
  }
}
