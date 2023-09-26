package com.MicroserviciosTFG.GestorPersonal.controller;

import com.MicroserviciosTFG.GestorPersonal.entity.PersonalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.MicroserviciosTFG.GestorPersonal.repository.PersonalRepository;

import java.util.List;

@RestController
@RequestMapping("/api/personal")
public class PersonalController {

    @Autowired
    private PersonalRepository personalRepository;


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PersonalEntity> getAllHerramientas(){
        return personalRepository.findAll();

    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createPersonal(@RequestBody PersonalEntity personalEntity){
       personalRepository.save(personalEntity);
    }
}
