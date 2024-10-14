package com.example.demo.repository;


import com.example.demo.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

@Repository
public class PersonRepository {

    @PersistenceContext
    EntityManager entityManager;

    public static Person getPersonByCity(String city) throws SQLException {
        return entityManager.find(Person.class, 1L);
    }

}
