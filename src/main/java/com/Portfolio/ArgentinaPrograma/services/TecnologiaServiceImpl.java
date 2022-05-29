/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.ArgentinaPrograma.services;

import com.Portfolio.ArgentinaPrograma.model.Persona;
import com.Portfolio.ArgentinaPrograma.model.Tecnologia;
import com.Portfolio.ArgentinaPrograma.repository.PersonaRepository;
import com.Portfolio.ArgentinaPrograma.repository.TecnologiaRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

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
    public boolean delete(Long id) throws Exception {
        try {
            if (tecnologiaRepository.existsById(id)) {
                tecnologiaRepository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
