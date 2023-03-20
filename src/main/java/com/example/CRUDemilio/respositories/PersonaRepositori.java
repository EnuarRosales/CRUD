package com.example.CRUDemilio.respositories;


import com.example.CRUDemilio.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonaRepositori extends JpaRepository<Persona,Long> {


}
