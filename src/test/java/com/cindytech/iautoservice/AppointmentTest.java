package com.cindytech.iautoservice;

import com.cindytech.iautoservice.model.Appointment;
import com.cindytech.iautoservice.model.Mechanic;
import com.cindytech.iautoservice.repository.AppointmentRepository;
import com.cindytech.iautoservice.repository.MechanicsRepository;
import com.cindytech.iautoservice.repository.VehicleRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@SpringBootTest
class AppointmentTest {
    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private MechanicsRepository mechanicsRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    @BeforeEach
    public void init(){
        Optional<Mechanic> m1 = mechanicsRepository.findById(6);

        // Creazione di un nuovo oggetto Appointment
        Appointment appointment = new Appointment();
        appointment.setDateAndTime(Timestamp.valueOf(LocalDateTime.of(2023, 3, 10, 14, 0)));
        appointment.setDescription("Cambio Olio Test");
        appointment.setVehicle(vehicleRepository.findById(1).get());
        appointment.setMechanic(m1.get());

        Appointment appointment1 = new Appointment();
        appointment1.setDateAndTime(Timestamp.valueOf(LocalDateTime.of(2023, 3, 10, 15, 0)));
        appointment1.setDescription("Cambio Olio Test");
        appointment1.setVehicle(vehicleRepository.findById(2).get());
        appointment1.setMechanic(m1.get());

        // Salvataggio dell'appuntamento nel database
        appointmentRepository.save(appointment);
        appointmentRepository.save(appointment1);
    }

    @Test
    public void appointmentInsertionTest(){
        List<Appointment> appointments = appointmentRepository.findAll().stream().filter(a -> a.getVehicle().getLicensePlate().equals("AA123AA")||a.getVehicle().getLicensePlate().equals("AA123BB")).collect(Collectors.toList());
        Assertions.assertTrue(appointments.size() > 1);

    }

    @Test
    public void getMechanicByAppointmentTest(){
        List<Appointment> appointments = appointmentRepository.findAll().stream().filter(a -> a.getDescription().equals("Cambio Olio Test")).collect(Collectors.toList());
        appointments.stream().forEach(a -> Assertions.assertEquals(a.getMechanic().getMechanicId(), 6));
    }

    @AfterEach
    public void destroy(){
        List<Appointment> appointments = appointmentRepository.findAll().stream().filter(a -> a.getDescription().equals("Cambio Olio Test")).collect(Collectors.toList());
        appointments.stream().forEach(a -> appointmentRepository.delete(a));
    }
}
