package com.cindytech.iautoservice;

import com.cindytech.iautoservice.model.Mechanic;
import com.cindytech.iautoservice.repository.AppointmentRepository;
import com.cindytech.iautoservice.repository.MechanicsRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class MechanicsTest {

    @Autowired
    private MechanicsRepository mechanicsRepository;

    @Test
    public void mechanicInsertionTest(){
        Mechanic m = new Mechanic();
        m.setFirstName("meccanico");
        m.setLastName("Di Test");
        m.setRole("user");
        m.setPassword("1234344242");
        m.setUsername("test");

        m.setHireDate(new Date());

        m = mechanicsRepository.save(m);

        Assertions.assertEquals(m.getFirstName(), "meccanico");

        mechanicsRepository.delete(m);
    }

}
