package com.cindytech.iautoservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@Entity
@Table(name = "mechanics")
public class Mechanic {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mechanic_id")
	private Integer mechanicId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	@Column(name = "role")
	private String role;
	@Column(name = "salary")
	private String salary;
	@Column(name = "create_time")
	private Date hireDate;
	@Column(name = "image")
	private byte[] picture;
	@OneToMany(mappedBy="mechanic")
	private List<Appointment> appointments;
 
	//Costruttore vuoto
	public Mechanic() {}
}
