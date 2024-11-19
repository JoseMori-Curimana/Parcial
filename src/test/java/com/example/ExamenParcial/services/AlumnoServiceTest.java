package com.example.ExamenParcial.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.ExamenParcial.model.Alumno;



@SpringBootTest
public class AlumnoServiceTest {

    private static final Logger log = LoggerFactory.getLogger(AlumnoServiceTest.class);

    @Autowired 
    private AlumnoServiceImpl alumnoService;


    @Test
    void testFindAll() {

        log.info("STAR VIVAAAAAA");
        List<Alumno> alumno = this.alumnoService.findAll(); 
        
        
        alumno.forEach(Item -> System.out.println(Item.getNombre()));

        assertEquals(true, !alumno.isEmpty());
    }

    @Test
    void testFindById() {

    }

    @Test
    void testUpdate() {

    }

}
