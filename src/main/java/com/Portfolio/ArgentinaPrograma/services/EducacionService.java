
package com.Portfolio.ArgentinaPrograma.services;

import java.util.List;


public interface EducacionService<Educacion> {
    
    public Educacion save(Educacion entity) throws Exception;
    public Educacion update(Long id, Educacion entity) throws Exception;
    public boolean delete(Long id) throws Exception;
    
}