/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.ArgentinaPrograma.services;

import com.Portfolio.ArgentinaPrograma.model.Persona;
import com.Portfolio.ArgentinaPrograma.model.Proyecto;
import com.Portfolio.ArgentinaPrograma.repository.PersonaRepository;
import com.Portfolio.ArgentinaPrograma.repository.ProyectoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoServiceImpl implements ProyectoService<Proyecto> {

    @Autowired
    private ProyectoRepository proyectoRepository;
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Proyecto save(Proyecto entity) throws Exception {
        try {
            Persona persona = personaRepository.findAll().get(0);
            persona.getProyectos().add(entity);
            personaRepository.save(persona);

            return entity;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Proyecto update(Long id, Proyecto entity) throws Exception {
        try {
            Optional<Proyecto> entityOptional = proyectoRepository.findById(id);
            Proyecto entityUpdate = entityOptional.get();
            entityUpdate = proyectoRepository.save(entity);
            return entityUpdate;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    
    @Override
    public void delete(Long id){
        Persona persona  = personaRepository.findAll().get(0);
        persona.getProyectos().remove(this.proyecto(id));
        proyectoRepository.deleteById(id);
    }
   
    private Proyecto proyecto(Long id){
        Optional<Proyecto> proyecto = proyectoRepository.findById(id);
        return proyecto.get();
    }
    
  
    @Override
    public List<Proyecto> findAll() throws Exception {
    try {
            List<Proyecto> entities = proyectoRepository.findAll();
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Proyecto findById(Long id) throws Exception {
     try {
            Optional<Proyecto> entityOptional = proyectoRepository.findById(id);
            return entityOptional.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
