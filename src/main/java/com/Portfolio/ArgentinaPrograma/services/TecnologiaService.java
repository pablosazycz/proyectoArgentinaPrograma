
package com.Portfolio.ArgentinaPrograma.services;

import org.springframework.stereotype.Service;

@Service
public interface TecnologiaService<Tecnologia> {
    
    public Tecnologia save(Tecnologia entity) throws Exception;
    public Tecnologia update(Long id, Tecnologia entity) throws Exception;
    public void  delete(Long id) throws Exception;
}
