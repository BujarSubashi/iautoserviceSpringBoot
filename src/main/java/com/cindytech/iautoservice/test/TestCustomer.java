package com.cindytech.iautoservice.test;

import com.cindytech.iautoservice.model.Customer;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestCustomer {
	public static void main(String[] args) {

		Customer c = new Customer();
		c.setCustomerId(1);
		c.setFirstName("Artan");
		c.setLastName("Rreshka");
		c.setAddress("Tirane, Al");
		c.setPhone("0682828008");
		c.setEmail("artan@gmail.com");
//		c.setMechanic_id(1);
		
//		CustomerDao dao = new CustomerDao();
		List<Customer> customers = new ArrayList();
//		try {
			//dao.insert(c);
			//dao.update(c);
			/*customers = dao.all();
			
			for (Customer customer : customers) {
				System.out.println(customer.getFirstName());
		
			}
			customers.size();*/
			
//			dao.delete(c);
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
	}
}
