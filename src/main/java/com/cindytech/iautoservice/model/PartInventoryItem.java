package com.cindytech.iautoservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PartInventoryItem {
    private Part part;
    private int quantity;
    private double purchasePrice;
    private String supplier;
}


