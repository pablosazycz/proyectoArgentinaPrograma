
package com.Portfolio.ArgentinaPrograma.repository;

import com.Portfolio.ArgentinaPrograma.model.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends JpaRepository<Domicilio,Long>{
    
}
