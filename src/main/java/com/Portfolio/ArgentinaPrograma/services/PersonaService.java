package com.Portfolio.ArgentinaPrograma.services;

import com.Portfolio.ArgentinaPrograma.dto.PersonaDTO;
//import com.Portfolio.ArgentinaPrograma.mapper.PersonaMapper;
import com.Portfolio.ArgentinaPrograma.model.Persona;
import com.Portfolio.ArgentinaPrograma.repository.PersonaRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
//    public PersonaMapper personaMapper;
//    @Autowired
    public PersonaRepository personaRepo;

//    @Override
//    public PersonaDTO save(PersonaDTO personaDto) {
//        Persona persona = personaMapper.dToEntity(personaDto);
//        Persona personaSave = personaRepo.save(persona);
//
//        PersonaDTO dto = personaMapper.entityToDto(personaSave);
//
//        return dto;
//    }

    @Override
    public Persona traerPersonaById(Long id) {
        Optional<Persona> personita = personaRepo.findById(id);
        return personita.get();

    }

    @Override
    public Persona crearPersona(Persona persona) {
        
        return personaRepo.save(persona);
    }

    @Override
    public void borrarPersona(Long id) {
        Persona persona = personaRepo.findById(id).orElse(null);
        personaRepo.delete(persona);
    }

    @Override
    public Persona editarPersona(Long id, Persona personaRequest) {
        Persona persona = personaRepo.findById(id).orElse(null);
        persona.setApellido(personaRequest.getApellido());
        persona.setFecha_nac(personaRequest.getFecha_nac());
        persona.setNombre(personaRequest.getNombre());
        persona.setProfesion(personaRequest.getProfesion());
        persona.setUrl_foto(personaRequest.getUrl_foto());

        return personaRepo.save(persona);
    }

}
