/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.ArgentinaPrograma.services;

import com.Portfolio.ArgentinaPrograma.model.Educacion;
import com.Portfolio.ArgentinaPrograma.model.Persona;
import com.Portfolio.ArgentinaPrograma.repository.EducacionRepository;
import com.Portfolio.ArgentinaPrograma.repository.PersonaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionServiceImpl implements EducacionService<Educacion> {

    @Autowired
    private EducacionRepository educacionRepository;
    @Autowired
    private PersonaRepository personaRepository;
   
    @Override
    public Educacion save(Educacion entity) throws Exception {
     try {
         Persona persona = personaRepository.findAll().get(0);
         persona.getEducaciones().add(entity);
         personaRepository.save(persona);
                   
            return entity;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Educacion update(Long id, Educacion entity) throws Exception {
       try {
            Optional<Educacion> entityOptional = educacionRepository.findById(id);
            Educacion entityUpdate = entityOptional.get();
            entityUpdate = educacionRepository.save(entity);
            return entityUpdate;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public boolean delete(Long id) throws Exception {
    try {
            if (educacionRepository.existsById(id)) {
                educacionRepository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }   
    }
    
}
