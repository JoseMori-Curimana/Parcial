package com.example.ExamenParcial.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExamenParcial.model.Alumno;
import com.example.ExamenParcial.repository.AlumnoRepository;



@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    AlumnoRepository alumnoRepository;

    @Override
    public List<Alumno> findAll() {
        return (List<Alumno>)alumnoRepository.findAll();
    }

    @Override
    public Alumno findById(Integer id) {
        
        return (Alumno)alumnoRepository.findById(id).get();
    }

    @Override
    public Alumno add(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    @Override
    public Alumno update(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    @Override
    public Boolean deleteById(Integer id) {
      alumnoRepository.deleteById(id);
      return true;
    }
}
