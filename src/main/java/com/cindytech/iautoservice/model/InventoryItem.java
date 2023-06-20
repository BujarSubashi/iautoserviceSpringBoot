package com.cindytech.iautoservice.model;

import lombok.Data;

@Data
public class InventoryItem {
    private Part part;
    private int quantity;
    private double purchasePrice;
    private double sellingPrice;

    public InventoryItem() {}
    
    public InventoryItem(Part part, int quantity, double purchasePrice, double sellingPrice) {
        this.part = part;
        this.quantity = quantity;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }
}
