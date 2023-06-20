package com.cindytech.iautoservice;

import com.cindytech.iautoservice.model.Customer;
import com.cindytech.iautoservice.repository.CustomerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CustomerTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void customerInsertionTest(){
        Customer c = new Customer();
        c.setFirstName("customer");
        c.setLastName("Di Test");
        c.setPhone("380456780");
        c.setEmail("customer@gmail.com");

        c = customerRepository.save(c);

        Assertions.assertEquals(c.getFirstName(), "customer");

        customerRepository.delete(c);
    }

}