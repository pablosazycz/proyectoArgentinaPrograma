
package com.Portfolio.ArgentinaPrograma.services;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DomicilioService <Domicilio>{
    public List<Domicilio> findAll() throws Exception;
   public Domicilio findById(Long id) throws Exception;
    public Domicilio save(Domicilio entity) throws Exception;
    public Domicilio update(Long id, Domicilio entity) throws Exception;
    public void delete(Long id) throws Exception;
}
