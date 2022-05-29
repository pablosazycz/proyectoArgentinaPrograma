
package com.Portfolio.ArgentinaPrograma.services;


public interface ProyectoService<Proyecto> {
    
    public Proyecto save(Proyecto entity) throws Exception;
    public Proyecto update(Long id, Proyecto entity) throws Exception;
    public boolean delete(Long id) throws Exception;
    
}
