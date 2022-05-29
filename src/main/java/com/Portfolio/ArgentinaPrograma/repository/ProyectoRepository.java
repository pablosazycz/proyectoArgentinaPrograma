
package com.Portfolio.ArgentinaPrograma.repository;

import com.Portfolio.ArgentinaPrograma.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {
    
}
