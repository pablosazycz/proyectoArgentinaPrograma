package com.Portfolio.ArgentinaPrograma.repository;

import com.Portfolio.ArgentinaPrograma.model.ExperienciaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExperienciaLaboralRepository extends JpaRepository<ExperienciaLaboral, Long>{
    
    
}
