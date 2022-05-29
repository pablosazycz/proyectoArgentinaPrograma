package com.Portfolio.ArgentinaPrograma.services;

import com.Portfolio.ArgentinaPrograma.dto.PersonaDTO;
//import com.Portfolio.ArgentinaPrograma.mapper.PersonaMapper;
import com.Portfolio.ArgentinaPrograma.model.Persona;
import com.Portfolio.ArgentinaPrograma.repository.PersonaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService<Persona> {

    @Autowired
    public PersonaRepository personaRepository;

    @Override
    public List<Persona> findAll() throws Exception {
        try {
            List<Persona> entities = personaRepository.findAll();
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Persona findById(Long id) throws Exception {
         try {
            Optional<Persona> entityOptional = personaRepository.findById(id);
            return entityOptional.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Persona save(Persona entity) throws Exception {
        try {
            entity = personaRepository.save(entity);
            
            return entity;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        } }

    @Override
    public Persona update(Long id, Persona entity) throws Exception {
     try {
            Optional<Persona> entityOptional = personaRepository.findById(id);
            Persona entityUpdate = entityOptional.get();
            entityUpdate = personaRepository.save(entity);
            return entityUpdate;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    
    }

    @Override
    public boolean delete(Long id) throws Exception {
    try {
            if (personaRepository.existsById(id)) {
                personaRepository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    
  
   


}
