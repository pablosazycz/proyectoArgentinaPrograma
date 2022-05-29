
package com.Portfolio.ArgentinaPrograma.services;


public interface TecnologiaService<Tecnologia> {
    
    public Tecnologia save(Tecnologia entity) throws Exception;
    public Tecnologia update(Long id, Tecnologia entity) throws Exception;
    public boolean delete(Long id) throws Exception;
}
