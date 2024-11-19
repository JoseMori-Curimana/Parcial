package com.example.ExamenParcial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ExamenParcial.model.Alumno;
import com.example.ExamenParcial.services.AlumnoService;
import com.example.ExamenParcial.util.Endpoints;



@SuppressWarnings("unused")
@RestController
@RequestMapping(Endpoints.ALUMNOS)
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping(Endpoints.FIND_ALL)
    public List<Alumno> findAll() {
        return alumnoService.findAll();
    }

    @GetMapping(Endpoints.FIND_BY_ID)
    public Alumno findById(@PathVariable Integer id) {
        
        return alumnoService.findById(id);
            
    }

    @PostMapping(Endpoints.CREATE)
    public Alumno create(@RequestBody Alumno alumno) {
        return alumnoService.add(alumno);
    }

    @PutMapping(Endpoints.UPDATE)
    public Alumno update(@RequestBody Alumno alumno) {
        return alumnoService.update(alumno);
            
    }

    @DeleteMapping(Endpoints.DELETE)
    public Boolean delete(@PathVariable Integer id)
    {
        return alumnoService.deleteById(id);

    }
}

//Desde aqui empiezo a hacer cambios