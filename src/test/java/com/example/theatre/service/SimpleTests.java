package com.example.theatre.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SimpleTests {

    @Autowired
    VehicleService vehicleService;

    @Test
    void name() throws Exception {
//        vehicleService.getBeanByName("plane");
        vehicleService.printList();

    }
}
