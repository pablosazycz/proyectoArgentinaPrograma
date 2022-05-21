
package com.Portfolio.ArgentinaPrograma.services;

import com.Portfolio.ArgentinaPrograma.model.Localidad;
import com.Portfolio.ArgentinaPrograma.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pablo
 */
@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long>{
    
        @Autowired
        private LocalidadServiceImpl localidadService;

    public LocalidadServiceImpl( BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
        
    }
        
        
        
}
