package com.github.nesmelov.simplerestservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Entity
@Data
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;

  public static Product copyWithId(Product product, Long id) {
    Product copy = new Product();
    BeanUtils.copyProperties(product, copy);
    copy.setId(id);
    return copy;
  }
}
