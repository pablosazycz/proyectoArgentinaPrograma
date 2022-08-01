
package com.Portfolio.ArgentinaPrograma.services;

import java.util.List;


public interface EducacionService<Educacion> {
    
    public List<Educacion> findAll() throws Exception; 
    public Educacion findById(Long id) throws Exception;
    public Educacion save(Educacion entity) throws Exception;
    public Educacion update(Long id, Educacion entity) throws Exception;
    public void delete(Long id) throws Exception;
    
}
