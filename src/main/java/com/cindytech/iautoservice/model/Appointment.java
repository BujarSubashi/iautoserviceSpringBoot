package com.cindytech.iautoservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "appointment")
@Data
public class Appointment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "appointment_id")
  private int appointmentID;
  @Column(name = "date_and_time")
  private Date dateAndTime;
  @Column(name = "description")
  private String description;
  @ManyToOne
  @JoinColumn(name="vehicle_id", nullable=false)
  private Vehicle vehicle;
  @ManyToOne
  @JoinColumn(name="mechanic_id", nullable=false)
  private Mechanic mechanic;

  public Appointment() {
  }
}