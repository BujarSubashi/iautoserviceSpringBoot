package com.cindytech.iautoservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
public class Invoice {
    private int id;
    private LocalDate date;
    private Customer customer;
    private Vehicle vehicle;
    private List<Work> works;
    private double totalPrice;
    public Invoice() {
    }
}
