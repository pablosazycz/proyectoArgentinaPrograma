
package com.Portfolio.ArgentinaPrograma.services;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ExperienciaLaboralService<ExperienciaLaboral> {
    
    public List<ExperienciaLaboral> findAll() throws Exception; 
    public ExperienciaLaboral findById(Long id) throws Exception;
    public ExperienciaLaboral save(ExperienciaLaboral entity) throws Exception;
    public ExperienciaLaboral update(Long id, ExperienciaLaboral entity) throws Exception;
    public void delete(Long id) throws Exception;
}
