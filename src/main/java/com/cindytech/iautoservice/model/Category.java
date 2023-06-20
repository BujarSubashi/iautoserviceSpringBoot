package com.cindytech.iautoservice.model;

import lombok.Data;

@Data
public class Category {
	
	private int idCategory;
	private String categoryDescription;
	
	public Category() {}
	
	public Category(int idCategory, String categoryDescription) {
		super();
		this.idCategory = idCategory;
		this.categoryDescription = categoryDescription;
	}
}
