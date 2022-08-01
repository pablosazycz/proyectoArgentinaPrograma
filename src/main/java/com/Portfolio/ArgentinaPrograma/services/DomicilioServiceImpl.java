package com.Portfolio.ArgentinaPrograma.services;

import com.Portfolio.ArgentinaPrograma.model.Domicilio;
import com.Portfolio.ArgentinaPrograma.model.Persona;
import com.Portfolio.ArgentinaPrograma.repository.DomicilioRepository;
import com.Portfolio.ArgentinaPrograma.repository.PersonaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
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
    public void delete(Long id) {

        Optional<Persona> persona = personaRepository.findById(id);
        persona.get().setDomicilio(null);
        personaRepository.save(persona.get());
    }

    @Override
    public List<Domicilio> findAll() throws Exception {
        try {
            List<Domicilio> entities = domicilioRepository.findAll();
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Domicilio findById(Long id) throws Exception {
  
         try {
            Optional<Domicilio> entityOptional = domicilioRepository.findById(id);
            return entityOptional.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }  }

    

}
