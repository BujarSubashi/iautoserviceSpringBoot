package com.cindytech.iautoservice.model;

public class PartPurchase {
    private int id;
    private Part part;
    private String supplier;
    private double purchasePrice;
    private double sellPrice;
    private int quantity;
 


    public PartPurchase(Part part, String supplier, double purchasePrice, double sellPrice, int quantity) {
        this.part = part;
        this.setSupplier(supplier);
        this.setPurchasePrice(purchasePrice);
        this.setSellPrice(sellPrice);
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public double getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}

	public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
