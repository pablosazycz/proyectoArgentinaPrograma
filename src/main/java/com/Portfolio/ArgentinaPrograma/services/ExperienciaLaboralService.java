
package com.Portfolio.ArgentinaPrograma.services;

import org.springframework.stereotype.Service;

@Service
public interface ExperienciaLaboralService<ExperienciaLaboral> {
    
    public ExperienciaLaboral save(ExperienciaLaboral entity) throws Exception;
    public ExperienciaLaboral update(Long id, ExperienciaLaboral entity) throws Exception;
    public void delete(Long id) throws Exception;
}
