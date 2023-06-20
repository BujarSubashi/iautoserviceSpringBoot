package com.cindytech.iautoservice.model;

import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
public class Quote {
	
	private int qouteId;
	private double price;
	private String licencePlate;
	private String description;
	private int mechanicId;
	private Timestamp creationDate;

	public Quote() {
		this.creationDate = Timestamp.valueOf(LocalDateTime.now());
	}

	public Quote(double price, String licencePlate, String description, int mechanicId) {
		this.price = price;
		this.licencePlate = licencePlate;
		this.description = description;
		this.mechanicId = mechanicId;
		this.creationDate = Timestamp.valueOf(LocalDateTime.now());
	}
}
