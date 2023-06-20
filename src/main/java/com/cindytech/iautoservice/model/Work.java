package com.cindytech.iautoservice.model;

import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class Work {

	public enum Status {
		NEW,
		IN_PROGRESS,
		COMPLETED,
		CANCELLED
	}

	private int workId;
	private String description;
	private double price;
	private int estimatedTime;
	private LocalDate startDate;
	private LocalDate endDate;
	private int vehicleId;
	private int mechanicId;
	private List<Part> parts;
	private Status status;
	private Timestamp creationDate;

	//EMPTY COSTRUCTOR
	public Work() {
		this.parts = new ArrayList<>();
		this.status = Status.NEW;
		this.creationDate = Timestamp.valueOf(LocalDateTime.now());
	}

	//COSTRUCTOR
	public Work(String description, double price, int estimatedTime) {
		this.description = description;
		this.price = price;
		this.estimatedTime = estimatedTime;
		this.parts = new ArrayList<>();
		this.status = Status.NEW;
		this.creationDate = Timestamp.valueOf(LocalDateTime.now());
	}

	//COSTRUCTOR
	public Work(String description, double price, int estimatedTime, LocalDate startDate, LocalDate endDate, int vehicleId, int mechanicId) {
		this.description = description;
		this.price = price;
		this.estimatedTime = estimatedTime;
		this.startDate = startDate;
		this.endDate = endDate;
		this.vehicleId = vehicleId;
		this.mechanicId = mechanicId;
		this.parts = new ArrayList<Part>();
		this.status = Status.NEW;
		this.creationDate = Timestamp.valueOf(LocalDateTime.now());
	}
}