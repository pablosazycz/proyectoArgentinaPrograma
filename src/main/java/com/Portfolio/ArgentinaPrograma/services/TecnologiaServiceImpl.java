/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.ArgentinaPrograma.services;

import com.Portfolio.ArgentinaPrograma.model.Persona;
import com.Portfolio.ArgentinaPrograma.model.Tecnologia;
import com.Portfolio.ArgentinaPrograma.repository.PersonaRepository;
import com.Portfolio.ArgentinaPrograma.repository.TecnologiaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologiaServiceImpl implements TecnologiaService<Tecnologia> {

    @Autowired
    private TecnologiaRepository tecnologiaRepository;
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Tecnologia save(Tecnologia entity) throws Exception {
        try {
            Persona persona = personaRepository.findAll().get(0);
            persona.getTecnologias().add(entity);
            personaRepository.save(persona);
            return entity;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Tecnologia update(Long id, Tecnologia entity) throws Exception {
        try {
            Optional<Tecnologia> entityOptional = tecnologiaRepository.findById(id);
            Tecnologia entityUpdate = entityOptional.get();
            entityUpdate = tecnologiaRepository.save(entity);
            return entityUpdate;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public void delete (Long id){
        Persona persona  = personaRepository.findAll().get(0);
        persona.getTecnologias().remove(this.tecnologia(id));
        tecnologiaRepository.deleteById(id);
    }
   
    private Tecnologia tecnologia (Long id){
        Optional<Tecnologia> tecnologia = tecnologiaRepository.findById(id);
        return tecnologia.get();
    }

    @Override
    public List<Tecnologia> findAll() throws Exception {
     try {
            List<Tecnologia> entities = tecnologiaRepository.findAll();
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }}

    @Override
    public Tecnologia findById(Long id) throws Exception {
    try {
            Optional<Tecnologia> entityOptional = tecnologiaRepository.findById(id);
            return entityOptional.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
