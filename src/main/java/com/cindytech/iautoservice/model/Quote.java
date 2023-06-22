package com.cindytech.iautoservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "quote")
public class Quote {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "quote_id")
	private int qouteId;
	@Column(name = "price")
	private double price;
	@ManyToOne
	@JoinColumn(name="vehicle_id", nullable=false)
	private Vehicle vehicle;
	@Column(name = "description")
	private String description;
	@ManyToOne
	@JoinColumn(name="mechanic_id", nullable=false)
	private Mechanic mechanic;
	@Column(name = "creation_date")
	private Timestamp creationDate;

	public Quote() {
		this.creationDate = Timestamp.valueOf(LocalDateTime.now());
	}

	public Quote(int qouteId, double price, Vehicle vehicle, String description, Mechanic mechanic, Timestamp creationDate) {
		this.qouteId = qouteId;
		this.price = price;
		this.vehicle = vehicle;
		this.description = description;
		this.mechanic = mechanic;
		this.creationDate = creationDate;
	}
}
