
package com.Portfolio.ArgentinaPrograma.services;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface TecnologiaService<Tecnologia> {
    
    public List<Tecnologia> findAll() throws Exception; 
    public Tecnologia findById(Long id) throws Exception;
    public Tecnologia save(Tecnologia entity) throws Exception;
    public Tecnologia update(Long id, Tecnologia entity) throws Exception;
    public void  delete(Long id) throws Exception;
}
