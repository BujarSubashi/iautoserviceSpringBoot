package com.cindytech.iautoservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDescription {
	private Part id;
	private double price;
	private String description;
}