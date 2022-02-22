package com.ri.solid.product.controller;

import com.ri.solid.product.dto.Product;

public class ProductUtil {
  public String getGSTRate(Product product) {
    switch (product.attributes().get("producedAt")) {
      case "AP":
        return "18%";
      case "KA":
        return "28%";
    }
    return "30%";
  }
}
