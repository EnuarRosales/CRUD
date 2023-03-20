package com.example.CRUDemilio.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import com.example.CRUDemilio.entities.Persona;
import com.example.CRUDemilio.services.PersonaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {
    @Autowired
    PersonaService personaService;


    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

//LISTAMOS TODAS LAS PERSONAS
    @GetMapping("/mostrar")
    public List<Persona> muestra() {
        return this.personaService.getListaPersonas();
    }
//CREAR PERSONAS
    @PostMapping("/mostrar")
    public Persona crearPersona(@RequestBody Persona persona) {
        return this.personaService.crearPersona(persona);
    }

//ELIMINAR
    @DeleteMapping("/persona/eliminar/{id}")
    public void delete(@PathVariable Long id){
    personaService.eliminarPersona(id);
    }

    //EDITAR
    @PutMapping("/persona/editar/{id}")
    public String  editar(@RequestBody Persona persona){
        persona = personaService.encontrarPersona(persona);
        //model.addAttribute("persona",persona);
        return "persona";

    }





}



