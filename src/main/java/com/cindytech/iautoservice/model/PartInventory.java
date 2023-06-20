package com.cindytech.iautoservice.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PartInventory {
    private List<PartInventoryItem> items;

    // costruttore
    public PartInventory() {
        this.items = new ArrayList<>();
    }

    // altri metodi
    public void addPart(Part part, int quantity, double purchasePrice, String supplier) {
        PartInventoryItem item = new PartInventoryItem(part, quantity, purchasePrice, supplier);
        items.add(item);
    }

    public void removePart(Part part) {
        items.removeIf(item -> item.getPart().equals(part));
    }

    public void updateQuantity(Part part, int quantity) {
        PartInventoryItem item = findItemByPart(part);
        item.setQuantity(quantity);
    }

    public void updatePurchasePrice(Part part, double purchasePrice) {
        PartInventoryItem item = findItemByPart(part);
        item.setPurchasePrice(purchasePrice);
    }

    private PartInventoryItem findItemByPart(Part part) {
        return items.stream().filter(item -> item.getPart().equals(part)).findFirst().orElse(null);
    }
}
