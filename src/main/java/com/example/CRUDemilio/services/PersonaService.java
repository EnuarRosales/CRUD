package com.example.CRUDemilio.services;

import com.example.CRUDemilio.entities.Persona;
import com.example.CRUDemilio.respositories.PersonaRepositori;
import org.springframework.stereotype.Service;


import java.util.List;

//EN LOS SERVICIOS VAN TODAS LAS REGLAS DE

@Service
public class PersonaService {

    PersonaRepositori repositori;


    public PersonaService(PersonaRepositori repositori) {
        this.repositori = repositori;

    }

    //VER
    public List<Persona> getListaPersonas() {
        return this.repositori.findAll();
    }

    //CREAR
    public Persona crearPersona(Persona newPersona) {
        return this.repositori.save(newPersona);
    }

    //ELIMINAR
    public  void eliminarPersona(Long id){
        repositori.deleteById(id);
    }

    //EDITAR

    public Persona encontrarPersona(Persona persona){
        return repositori.findById(persona.getId()).orElse(null);
}



}
