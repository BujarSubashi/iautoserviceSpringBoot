package com.cindytech.iautoservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "part_purchase")
public class PartPurchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "part")
    private Part part;
    @ManyToOne
    @JoinColumn(name="supplier_id", nullable=false)
    private String supplier;
    @Column(name = "purchase_price")
    private double purchasePrice;
    @Column(name = "sell_price")
    private double sellPrice;
    @Column(name = "quantity")
    private int quantity;
    @ManyToOne
    @JoinColumn(name="order_id", nullable=false)
    private Order order;
 


    public PartPurchase(Part part, String supplier, double purchasePrice, double sellPrice, int quantity) {
        this.part = part;
        this.setSupplier(supplier);
        this.setPurchasePrice(purchasePrice);
        this.setSellPrice(sellPrice);
        this.quantity = quantity;
    }
}
