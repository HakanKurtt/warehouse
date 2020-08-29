package com.lizard.warehouse.model;

import java.math.BigDecimal;
import java.util.List;

public class Product {
    private Long id;
    private String name;
    private String description;
    private BigDecimal salePrice;

    private List<Material> components;
}
