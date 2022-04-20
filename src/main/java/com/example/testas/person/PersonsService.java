package com.example.testas.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonsService {

    @Autowired
    PersonsDao personsDao;
    Persons persons;


    public void insertPerson(String firstname, String lastname, String dateOfBirth, String address){
        personsDao.insertPerson(firstname, lastname, dateOfBirth, address);
    }


}
