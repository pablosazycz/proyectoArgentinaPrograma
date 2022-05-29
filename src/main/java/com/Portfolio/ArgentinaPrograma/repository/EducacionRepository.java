
package com.Portfolio.ArgentinaPrograma.repository;

import com.Portfolio.ArgentinaPrograma.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Long>{
    
}
