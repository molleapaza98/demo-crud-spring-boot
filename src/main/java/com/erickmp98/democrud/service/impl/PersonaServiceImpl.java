package com.erickmp98.democrud.service.impl;


import com.erickmp98.democrud.commons.GenericServiceImpl;
import com.erickmp98.democrud.dao.PersonaDao;
import com.erickmp98.democrud.model.Persona;
import com.erickmp98.democrud.service.api.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaService {

    @Autowired
    private PersonaDao personaDao;

    @Override
    public CrudRepository<Persona, Long> getDao() {
        return personaDao;
    }
}
