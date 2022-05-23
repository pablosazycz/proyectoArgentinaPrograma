
package com.Portfolio.ArgentinaPrograma.repository;

import com.Portfolio.ArgentinaPrograma.model.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository <Persona, Long>  {
    
}
