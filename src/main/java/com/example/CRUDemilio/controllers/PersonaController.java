package com.example.CRUDemilio.controllers;

import com.example.CRUDemilio.entities.ListPersonas;
import com.example.CRUDemilio.entities.Persona;
import com.example.CRUDemilio.services.PersonaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController{
    PersonaService personaService;

    public PersonaController( PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/mostrar")
    public List<Persona> muestra(){
        return this.personaService.getListaPersonas();
    }

    @PostMapping("/mostrar")
    public Persona crearPersona(@RequestBody Persona persona){
    return this.personaService.crearPersona(persona);
    }

}
