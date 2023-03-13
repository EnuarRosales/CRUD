package com.example.CRUDemilio.entities;

import java.util.ArrayList;
import java.util.List;

public class ListPersonas {
   //declaracion de variables
    private  String name;
    private List<Persona> listaPersonas;

    //constructor
    public ListPersonas(String name) {
        this.name = name;
        this.listaPersonas = new ArrayList<Persona>();
    }

    //agragar persona
    public void addPersona(Persona persona){
        this.listaPersonas.add(persona);
    }

    //geter and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }
}
