package com.cindytech.iautoservice.model;

import com.cindytech.iautoservice.enums.Status;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "order")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private int orderId;
	@Column(name = "status")
	private Status status;
	@ManyToOne
	@JoinColumn(name="supplier_id", nullable=false)
	private Supplier supplier;
	@OneToMany(mappedBy="order")
	private List<PartPurchase> partPurchases;
	@Column(name = "creation_time")
    private Date creationTime;
	@Column(name = "completion_time")
    private Date completionTime;
	@Column(name = "total_cost")
	private double totalCost;

	public Order() {}
			
	public Order(int orderId, Supplier supplier, List<PartPurchase> parts) {
		this.orderId = orderId;
		this.supplier = supplier;
		this.partPurchases = parts;
		this.creationTime = new Date();
	}

	// Method to calculate total cost of the order
	 public double getTotalCost() {
	        double totalCost = 0;
	        for (PartPurchase partPurchase : partPurchases) {
	            totalCost += partPurchase.getQuantity() * partPurchase.getPurchasePrice();
	        }
	        return totalCost;
	    }
	
	 public void markAsNew() {
	        this.status = Status.NEW;
	    }

	    public void markAsInProgress() {
	        this.status = Status.IN_PROGRESS;
	    }

	    public void markAsCompleted() {
	        this.status = Status.COMPLETED;
	        this.completionTime =new Date();
	    }

	    public void markAsCancelled() {
	        this.status = Status.CANCELLED;
	        this.completionTime = new Date();
	    }
	    
	    public boolean isNew() {
	        return this.status == Status.NEW;
	    }

	    public boolean isInProgress() {
	        return this.status == Status.IN_PROGRESS;
	    }

	    public boolean isCompleted() {
	        return this.status == Status.COMPLETED;
	    }

	    public boolean isCancelled() {
	        return this.status == Status.CANCELLED;
	    }
}