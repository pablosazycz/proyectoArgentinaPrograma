/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.ArgentinaPrograma.services;

import com.Portfolio.ArgentinaPrograma.model.Domicilio;
import com.Portfolio.ArgentinaPrograma.model.Persona;
import com.Portfolio.ArgentinaPrograma.repository.DomicilioRepository;
import com.Portfolio.ArgentinaPrograma.repository.PersonaRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;


public class DomicilioServiceImpl implements DomicilioService<Domicilio> {

    @Autowired
    private PersonaRepository personaRepository;
    @Autowired
    private DomicilioRepository domicilioRepository;
    
    @Override
    public Domicilio save(Domicilio entity) throws Exception {
        try {
            Persona persona = personaRepository.findAll().get(0);
            persona.setDomicilio(entity);
            personaRepository.save(persona);

            return entity;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }    
    }

    @Override
    public Domicilio update(Long id, Domicilio entity) throws Exception {
     try {
            Optional<Domicilio> entityOptional = domicilioRepository.findById(id);
            Domicilio entityUpdate = entityOptional.get();
            entityUpdate = domicilioRepository.save(entity);
            return entityUpdate;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public boolean delete(Long id) throws Exception {
     try {
            if (domicilioRepository.existsById(id)) {
                domicilioRepository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    
    }
    

