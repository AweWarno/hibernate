package com.example.demo.controller;

import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping("/persons/by-city/")
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("{city}")
    private String fetchPerson(@PathVariable String city) throws SQLException {
        return PersonRepository.getPersonByCity(city).toString();
    }
}
