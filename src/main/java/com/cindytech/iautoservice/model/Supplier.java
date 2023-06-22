package com.cindytech.iautoservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "quote")
public class Supplier {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sid")
	private Integer idSupplier;
	private String name;
	private String id_vat_number;
	private String activity_type;
	private String phone1;
	private String phone2;
	private String email;
	private String address;
	private String note;
	private String category;
	
	
	public Supplier() {}
	
	public Supplier(String name, String id_vat_number, String activity_type, String phone1,
			String phone2, String email, String address, String note, String category) {
		super();

		this.name = name;
		this.id_vat_number = id_vat_number;
		this.activity_type = activity_type;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.email = email;
		this.address = address;
		this.note = note;
		this.category = category;
	}
}
