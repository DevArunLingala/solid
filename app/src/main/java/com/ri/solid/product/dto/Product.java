package com.ri.solid.product.dto;

import java.util.Map;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true)
public class Product {
  private String id;
  private String name;
  private String manufacturer;
  private String type;
  private Map<String, String> attributes;
  private Integer qnt;
}
