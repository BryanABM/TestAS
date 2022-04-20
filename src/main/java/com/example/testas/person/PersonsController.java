package com.example.testas.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonsController {
    @Autowired
    PersonsService personsService;
    Persons persons;

    public PersonsController(PersonsService personsService){
        this.personsService = personsService;
    }

    @GetMapping("/insertPerson")
    public void insertPerson(@RequestParam(value = "firstname")String firstname,
                             @RequestParam(value = "lastname")String lastname,
                             @RequestParam(value = "dateOfBirth")String dateOfBirth,
                             @RequestParam(value = "address")String address){
        personsService.insertPerson(firstname, lastname, dateOfBirth, address);
    }
}
