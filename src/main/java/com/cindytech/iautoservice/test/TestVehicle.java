package com.cindytech.iautoservice.test;

import com.cindytech.iautoservice.model.Vehicle;

import java.sql.SQLException;

public class TestVehicle {
	public static void main(String[] args) throws SQLException {
		
		Vehicle v = new Vehicle();
		v.setVehicleId(3);
		v.setLicensePlate("DR995WN");
		v.setBrand("Ford");
		v.setModel("S-Max");
//		v.setYear(2008);
		v.setMileage(135000);
//		v.setCustomer(2);
		v.setMechanic_id(1);
		
		Vehicle v2 = new Vehicle();
		//v.setVehicleId(3);
		v2.setLicensePlate("DP701EP");
		v2.setBrand("Ford");
		v2.setModel("Fiesta");
//		v2.setYear(2008);
		v2.setMileage(185000);
//		v2.setCustomer(2);
		v2.setMechanic_id(1);
		
//		VehicleDao dao = new VehicleDao();
		
		//dao.insert(v2);
		//dao.update(v);
//		dao.delete(v2);
		/*List<Vehicle> vehicles = new ArrayList<>();
		vehicles = dao.all();
		
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle.getLicensePlate() + " "+vehicle.getBrand()+" "+vehicle.getModel());
		}*/
	}
}
