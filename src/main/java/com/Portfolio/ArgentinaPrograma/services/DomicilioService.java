
package com.Portfolio.ArgentinaPrograma.services;

import org.springframework.stereotype.Service;

@Service
public interface DomicilioService <Domicilio>{
    public Domicilio save(Domicilio entity) throws Exception;
    public Domicilio update(Long id, Domicilio entity) throws Exception;
    public boolean delete(Long id) throws Exception;
}
