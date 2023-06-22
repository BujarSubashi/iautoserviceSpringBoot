package com.cindytech.iautoservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_id")
    private int vehicleId;
    @Column(name = "license_plate")
    private String licensePlate;
    @Column(name = "brand")
    private String brand;
    @Column(name = "model")
    private String model;
    @Column(name = "year_of_production")
    private int yearOfProduction;
    @Column(name = "mileage")
    private int mileage;
    @Column(name = "costumer_id")
    private int costumerId;
    // Da valutare se meglio lista di appuntamenti poiché il meccanico potrebbe cambiare
//    @Column(name = "mechanic_id")
//    private int mechanic_id;
    @OneToMany(mappedBy="vehicle")
    private List <Quote> quotes;
    @Column(name = "creation_date")
    private Timestamp creationDate;

    // Constructors
    public Vehicle() {
    	this.quotes = new ArrayList<>();
    	this.creationDate = Timestamp.valueOf(LocalDateTime.now());
    }

    public Vehicle(int vehicleId, String licensePlate, String brand, String model, int yearOfProduction, int mileage, int customerId) {
        this.vehicleId = vehicleId;
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.mileage = mileage;
        this.costumerId = customerId;
        this.quotes = new ArrayList<>();
        this.creationDate = Timestamp.valueOf(LocalDateTime.now());
    }
}