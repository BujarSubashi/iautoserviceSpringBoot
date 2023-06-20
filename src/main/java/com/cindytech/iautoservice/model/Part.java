package com.cindytech.iautoservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Part {

	private int productId;
	private int partNumber;
	private String productName;
	private String productCategory;
	private String productSupplier;
	private String productDescription;
	private double buy_price;
	private double sell_price;
	private int quantity;
	private byte[] picture;

	//Empty Constructor
	public Part() {}
}
