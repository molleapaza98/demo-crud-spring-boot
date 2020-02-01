package com.erickmp98.democrud.dao;

import com.erickmp98.democrud.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long> {


}
