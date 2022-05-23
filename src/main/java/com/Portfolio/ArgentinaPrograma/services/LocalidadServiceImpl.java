
package com.Portfolio.ArgentinaPrograma.services;

import com.Portfolio.ArgentinaPrograma.model.Localidad;
import com.Portfolio.ArgentinaPrograma.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{
    
      

    public LocalidadServiceImpl( BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
        
    }
        
        
        
}
