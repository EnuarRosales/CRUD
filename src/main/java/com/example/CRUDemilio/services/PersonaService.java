package com.example.CRUDemilio.services;

import com.example.CRUDemilio.entities.ListPersonas;
import com.example.CRUDemilio.entities.Persona;
import com.example.CRUDemilio.respositories.PersonaRepositori;
import org.springframework.stereotype.Service;

import java.util.List;

//EN LOS SERVICIOS VAN TODAS LAS REGLAS DE

@Service
public class PersonaService {

    PersonaRepositori repositori;


    public PersonaService( PersonaRepositori repositori) {
        this.repositori = repositori;

    }

    public List<Persona> getListaPersonas() {
        return this.repositori.findAll();
    }


    //CREAR
    public Persona crearPersona(Persona newPersona){
        return this.repositori.save(newPersona);
    }

}
