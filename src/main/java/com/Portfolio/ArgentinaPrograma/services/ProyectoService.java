
package com.Portfolio.ArgentinaPrograma.services;

import java.util.List;


public interface ProyectoService<Proyecto> {
    
    public List<Proyecto> findAll() throws Exception; 
    public Proyecto findById(Long id) throws Exception; 
    public Proyecto save(Proyecto entity) throws Exception;
    public Proyecto update(Long id, Proyecto entity) throws Exception;
    public void delete(Long id) throws Exception;
    
}
