package com.cindytech.iautoservice.test;

import com.cindytech.iautoservice.model.Quote;

import java.sql.SQLException;

public class TestQuote {

	public static void main(String[] args) {

		// Creazione di un nuovo oggetto Quote
		Quote quote = new Quote();
		quote.setPrice(200.00);
		quote.setDescription("Tagliando");
		quote.setLicencePlate("BB456CC");
		quote.setMechanicId(1);
		
		Quote quote1 = new Quote();
		quote1.setPrice(220.00);
		quote1.setDescription("Tagliando");
		quote1.setLicencePlate("BB456EE");
		quote1.setMechanicId(1);
		
		Quote quote2 = new Quote();
		quote2.setPrice(250.00);
		quote2.setDescription("Tagliando");
		quote2.setLicencePlate("BB456KG");
		quote2.setMechanicId(1);
		
		/*Appointment appointment1 = new Appointment();
		appointment1.setAppointmentDate(Timestamp.valueOf(LocalDateTime.of(2023, 3, 10, 14, 0)));
		appointment1.setDescription("Cambio Olio");
		appointment1.setVehiclePlate("AA123BB");
		appointment1.setMechanicID(1);
		
		Appointment appointment2 = new Appointment();
		appointment2.setAppointmentDate(Timestamp.valueOf(LocalDateTime.of(2023, 3, 10, 14, 0)));
		appointment2.setDescription("Cambio Olio");
		appointment2.setVehiclePlate("AA123CC");
		appointment2.setMechanicID(1);*/

		// Salvataggio dell'appuntamento nel database
//		QuoteDao quoteDao = new QuoteDao();
//		try {
			//appointmentDao.insert(appointment);
			//appointmentDao.update(appointment);
			//appointmentDao.delete(appointment);
			/*appointmentDao.insert(appointment);
			appointmentDao.insert(appointment1);
			appointmentDao.insert(appointment2);*/
			
			//GET LIST OF APPOINTMENT
			/*List<Appointment> appointments = appointmentDao.all();
			for (Appointment appointment : appointments) {
				
				System.out.println("TARGA: "+appointment.getVehiclePlate());
				appointment.toString();
			}*/
			
//			quoteDao.insert(quote);
//			quoteDao.insert(quote1);
//			quoteDao.insert(quote2);
			
			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
