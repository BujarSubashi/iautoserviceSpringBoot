package com.cindytech.iautoservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VehicleParts {
    private int id;
    private Work work;
    private Part part;
    private int quantity;

    public VehicleParts() {
    }
}
