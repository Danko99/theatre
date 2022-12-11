package com.example.theatre.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class VehicleService {

    @Autowired
    private List<String> listOfStrings;

    private Map<String,Vehicle> vehicleMap;

    public VehicleService(Map<String, Vehicle> vehicleMap) {
        this.vehicleMap = vehicleMap;
    }

    public void printList(){
        System.out.println(listOfStrings);
    }

    public void getBeanByName(String bean) throws Exception {
        Vehicle vehicle = vehicleMap.get(bean);
        if(vehicle==null){
            throw new Exception("Don't have this bean");
        }

        System.out.println(vehicle.getName());

    }
}
