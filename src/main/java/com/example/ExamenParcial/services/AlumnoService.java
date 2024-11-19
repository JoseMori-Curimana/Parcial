package com.example.ExamenParcial.services;
import java.util.List;


import com.example.ExamenParcial.model.Alumno;

public interface AlumnoService {
    
    
    List<Alumno> findAll();

    Alumno findById(Integer id);

    Alumno add(Alumno alumno);

    Alumno update(Alumno alumno);

    Boolean deleteById(Integer id);
}

