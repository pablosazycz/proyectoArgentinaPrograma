
package com.Portfolio.ArgentinaPrograma.services;

import com.Portfolio.ArgentinaPrograma.dto.PersonaDTO;
import com.Portfolio.ArgentinaPrograma.model.Persona;
import java.util.List;


public interface PersonaService<Persona> {
   
    
    public List<Persona> findAll() throws Exception; 
    public Persona findById(Long id) throws Exception;
    public Persona save(Persona entity) throws Exception;
    public Persona update(Long id, Persona entity) throws Exception;
    public boolean delete(Long id) throws Exception;
    
}
