/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.ArgentinaPrograma.services;

import com.Portfolio.ArgentinaPrograma.model.ExperienciaLaboral;
import com.Portfolio.ArgentinaPrograma.model.Persona;
import com.Portfolio.ArgentinaPrograma.repository.ExperienciaLaboralRepository;
import com.Portfolio.ArgentinaPrograma.repository.PersonaRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLaboralServiceImpl implements ExperienciaLaboralService<ExperienciaLaboral> {

    @Autowired
    private PersonaRepository personaRepository;
    @Autowired
    private ExperienciaLaboralRepository experienciaLaboralRepository;

    @Override
    public ExperienciaLaboral save(ExperienciaLaboral entity) throws Exception {
        try {
            Persona persona = personaRepository.findAll().get(0);
            persona.getExperiencia().add(entity);
            personaRepository.save(persona);
            return entity;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public ExperienciaLaboral update(Long id, ExperienciaLaboral entity) throws Exception {
    try {
            Optional<ExperienciaLaboral> entityOptional = experienciaLaboralRepository.findById(id);
            ExperienciaLaboral entityUpdate = entityOptional.get();
            entityUpdate = experienciaLaboralRepository.save(entity);
            return entityUpdate;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        
        
    }
 @Override
    public void delete(Long id){
        Persona persona  = personaRepository.findAll().get(0);
        persona.getExperiencia().remove(this.experienciaLaboral(id));
        experienciaLaboralRepository.deleteById(id);
    }
   
    private ExperienciaLaboral experienciaLaboral(Long id){
        Optional<ExperienciaLaboral> experienciaLaboral = experienciaLaboralRepository.findById(id);
        return experienciaLaboral.get();
    }
}
