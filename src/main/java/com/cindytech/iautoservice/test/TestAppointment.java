package com.cindytech.iautoservice.test;

import com.cindytech.iautoservice.model.Appointment;
import com.cindytech.iautoservice.model.Mechanic;
import com.cindytech.iautoservice.repository.AppointmentRepository;
import com.cindytech.iautoservice.repository.MechanicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class TestAppointment {
	@Autowired
	private AppointmentRepository appointmentRepository;

	@Autowired
	private MechanicsRepository mechanicsRepository;

	public void main(String[] args) {

		Optional<Mechanic> m1 = mechanicsRepository.findById(6);


		// Creazione di un nuovo oggetto Appointment
		Appointment appointment = new Appointment();
		appointment.setDateAndTime(Timestamp.valueOf(LocalDateTime.of(2023, 3, 10, 14, 0)));
		appointment.setDescription("Cambio Olio");
		appointment.setVehiclePlate("AA123AA");
//		appointment.setMechanicID(1);
		appointment.setMechanic(m1.get());



		Appointment appointment1 = new Appointment();
		appointment1.setDateAndTime(Timestamp.valueOf(LocalDateTime.of(2023, 3, 10, 15, 0)));
		appointment1.setDescription("Cambio Olio");
		appointment1.setVehiclePlate("AA123BB");
//		appointment.setMechanicID(1);
		appointment.setMechanic(m1.get());

		Appointment appointment2 = new Appointment();
		appointment2.setDateAndTime(Timestamp.valueOf(LocalDateTime.of(2023, 3, 10, 16, 0)));
		appointment2.setDescription("Cambio Olio");
		appointment2.setVehiclePlate("AA123CC");
//		appointment.setMechanicID(1);
		appointment.setMechanic(m1.get());

		// Salvataggio dell'appuntamento nel database
//		AppointmentDao appointmentDao = new AppointmentDao();
		try {
			appointmentRepository.save(appointment);
			appointmentRepository.save(appointment1);
			appointmentRepository.save(appointment2);

			//GET LIST OF APPOINTMENT
			List<Appointment> appointments = (List<Appointment>) appointmentRepository.findAll();
			for (Appointment a : appointments) {

				System.out.println("TARGA: "+ a.getVehiclePlate());
				appointment.toString();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
