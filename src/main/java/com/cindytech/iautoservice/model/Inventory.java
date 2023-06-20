package com.cindytech.iautoservice.model;

import java.util.List;

public class Inventory {
	private List<PartInventory> partsInventory;

    public Inventory() {}
    public Inventory(List<PartInventory> partsInventory) {
        this.partsInventory = partsInventory;
    }

    public List<PartInventory> getPartsInventory() {
        return partsInventory;
    }

    public void setPartsInventory(List<PartInventory> partsInventory) {
        this.partsInventory = partsInventory;
    }

    public void addPartInventory(PartInventory partInventory) {
        this.partsInventory.add(partInventory);
    }

    public void removePartInventory(PartInventory partInventory) {
        this.partsInventory.remove(partInventory);
    }

    // Other methods for managing the inventory
}
