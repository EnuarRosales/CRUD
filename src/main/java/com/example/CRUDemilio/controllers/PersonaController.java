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

//LISTAMOS TODAS LAS PERSONAS
    @GetMapping("/mostrar")
    public List<Persona> muestra() {
        return this.personaService.getListaPersonas();
    }
//CREAR PERSONAS
    @PostMapping("/mostrar")
    public void crearPersona(@RequestBody Persona persona) {
        personaService.crearPersona(persona);
    }

//ELIMINAR
    @DeleteMapping("/persona/eliminar/{id}")
    public void delete(@PathVariable Long id){
    personaService.eliminarPersona(id);
    }

    //EDITAR
    @PutMapping("/persona/editar/{id}")
    public Persona editar(Persona persona){
        persona = personaService.encontrarPersona(persona);
        persona.setApellido("prueba");
        //model.addAttribute("persona", persona);
        personaService.crearPersona(persona);
        return persona;

    }

    @PutMapping("/mostrar01")
    public void editarPersona(@RequestBody Persona persona) {
        personaService.crearPersona(persona);
    }


}



