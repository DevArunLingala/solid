package com.ri.solid.product.controller;

import com.ri.solid.product.dto.Product;
import com.ri.solid.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
  @Autowired ProductService productService;

  @GetMapping("/product/{id}")
  ResponseEntity<Product> getProduct(@PathVariable String id) {
    return new ResponseEntity<>(productService.product(id), HttpStatus.OK);
  }
}
