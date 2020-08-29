package com.lizard.warehouse.model;

import java.math.BigDecimal;
import java.util.List;

public class Material {

    private Long id;
    private String name;
    private String description;
    private BigDecimal supplyPrice;
    private String materialType;
    private Integer stockAmount;

    private double weight;
    private String weightUnit = "kg";

    private double length;
    private String lengthUnit = "mm";

    // Kesit
    private String crossSection;

    private List<Material> components;

}
