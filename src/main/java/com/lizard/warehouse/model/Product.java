package com.lizard.warehouse.model;

import java.math.BigDecimal;
import java.util.List;

public class Product {
    private Long id;
    private String name;
    private String description;
    private BigDecimal salePrice;
    private BigDecimal netPrice;
    private BigDecimal labourCost;
    private double vatAmount;

    private List<Material> components;
}
