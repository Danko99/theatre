package com.example.theatre.controller;

import com.example.theatre.service.TheatreService;
import org.jooq.Record1;
import org.jooq.Result;
import org.jooq.generated.tables.Department;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheatreControllerV1 {
    TheatreService theatreService;

    public TheatreControllerV1(TheatreService theatreService) {
        this.theatreService = theatreService;
    }

    @GetMapping(value = "/result")
    public String getTables(){
        Result<Record1<String>> result = theatreService.getResult();
        Record1<String> stringRecord1 = result.get(0);
        return stringRecord1.get(Department.DEPARTMENT.NAME_DEPARTMENT);
    }
}
