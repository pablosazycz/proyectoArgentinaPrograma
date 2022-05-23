package com.Portfolio.ArgentinaPrograma.services;

import com.Portfolio.ArgentinaPrograma.dto.PersonaDTO;
//import com.Portfolio.ArgentinaPrograma.mapper.PersonaMapper;
import com.Portfolio.ArgentinaPrograma.model.Persona;
import com.Portfolio.ArgentinaPrograma.repository.BaseRepository;
import com.Portfolio.ArgentinaPrograma.repository.PersonaRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository) {
        super(baseRepository);
         
    }

  
    
    
}
