
package com.Portfolio.ArgentinaPrograma.services;


public interface ExperienciaLaboralService<ExperienciaLaboral> {
    
    public ExperienciaLaboral save(ExperienciaLaboral entity) throws Exception;
    public ExperienciaLaboral update(Long id, ExperienciaLaboral entity) throws Exception;
    public boolean delete(Long id) throws Exception;
}
