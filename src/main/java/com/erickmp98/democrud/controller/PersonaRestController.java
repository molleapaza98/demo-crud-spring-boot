package com.erickmp98.democrud.controller;

import com.erickmp98.democrud.model.Persona;
import com.erickmp98.democrud.service.api.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/")
@CrossOrigin("*")
public class PersonaRestController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/all")
    public List<Persona> getALl(){
       return personaService.getAll();
    }

    @GetMapping("/find/{id}")
    public Persona find(@PathVariable Long id) {
        return personaService.get(id);
    }

    @PostMapping("/save")
    public ResponseEntity<Persona> save(@RequestBody Persona persona) {
        Persona obj = personaService.save(persona);
        return new ResponseEntity<Persona>(obj, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Persona> delete(@PathVariable Long id) {
        Persona persona = personaService.get(id);
        if(persona!= null){
            personaService.delete(id);
        }else{
            return new ResponseEntity<Persona>(persona, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<Persona>(persona,HttpStatus.OK);
    }
}
