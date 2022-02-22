package com.ri.solid.product.service;

import com.ri.solid.product.dto.Product;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
  private final Map<String, Product> products;
  private final Set<Product> productSet = new HashSet<>();

  public ProductService() {
    products = new HashMap<>();
    Map<String, String> attributes = new HashMap<>();
    attributes.put("color", "green");
    attributes.put("producedAt", "KA");
    Product banana =
        new Product()
            .id("1")
            .manufacturer("from-farms")
            .name("banana")
            .type("fruit")
            .attributes(attributes);
    products.put("1", banana);

    attributes.put("length", "10 cm");
    Product cucumber =
        new Product()
            .id("2")
            .manufacturer("from-farms")
            .name("cucumber")
            .type("veg")
            .attributes(attributes);

    products.put("2", cucumber);

    productSet.add(banana);
    productSet.add(cucumber);
  }

  public Product product(String id) {
    return products.get(id);
  }

  boolean hasProductInStock(String name) {
    Product product = null;
    for (Product p : products.values()) {
      if (p.name().equals(name)) {
        product = p;
        break;
      }
    }
    return productSet.contains(product);
  }
}
