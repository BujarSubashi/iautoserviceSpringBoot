package com.cindytech.iautoservice.test;

import com.cindytech.iautoservice.model.Work;

import java.time.LocalDate;

public class TestWork {

	public static void main(String[] args) {

		LocalDate oggi = LocalDate.now();
		LocalDate domani = oggi.plusDays(1);
		//LocalDate todayLocalDate = LocalDate.now( ZoneId.of( "America/Montreal" ) ); 
		
		// Creazione di un nuovo oggetto Work
		/*Work work = new Work();
		//work.setWorkId(1);
		work.setDescription("Cambio Olio");
		work.setPrice(50.0);
		work.setEstimatedTime(4);
		work.setStartDate(oggi);
		work.setEndDate(domani);
		work.setVehicleId(1);
		work.setMechanicId(1);
		work.markAsInProgress();
		
		Work work1 = new Work();
		//work2.setWorkId(1);
		work1.setDescription("Cambio Pastiche Freni");
		work1.setPrice(35.0);
		work1.setEstimatedTime(2);
		work1.setStartDate(oggi);
		work1.setEndDate(domani);
		work1.setVehicleId(1);
		work1.setMechanicId(1);*/
		
		Work work2 = new Work();
		work2.setWorkId(5);
		work2.setDescription("Cambio Gomme");
		work2.setPrice(50.0);
		work2.setEstimatedTime(4);
		work2.setStartDate(oggi);
		work2.setEndDate(domani);
		work2.setVehicleId(1);
		work2.setMechanicId(1);
//		work2.markAsCompleted();


		// Salvataggio dell'appuntamento nel database
//		WorkDao workDao = new WorkDao();
//		try {
			//workDao.insert(work);
			//workDao.insert(work1);
			//workDao.insert(work2);
//			workDao.update(work2);
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
			
			//quoteDao.insert(quote);
			//quoteDao.insert(quote1);
			//quoteDao.insert(quote2);
			
			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
