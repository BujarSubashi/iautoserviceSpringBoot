package com.cindytech.iautoservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int customerId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "adress")
    private String address;
    @Column(name = "tp_number")
    private String phone;
    @Column(name = "email")
    private String email;
    // @Column(name = "mechanic_id")
    //private List<Vehicle> vehicles;

    // Constructors
    public Customer() {}
}