package com.example.testas.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class PersonsDao {

@Autowired
    JdbcTemplate jdbcTemplate;


    public void insertPerson(String firstname, String lastname, String dateOfBirth, String address){
        String query = "INSERT INTO persons (firstname, lastname, dateOfBirth, address) VALUES (?,?,?,?)";

        int result = jdbcTemplate.update(query, firstname, lastname, dateOfBirth, address);

        if (result > 0){
            System.out.println(result + " person has been added!");
        }
    }
}
