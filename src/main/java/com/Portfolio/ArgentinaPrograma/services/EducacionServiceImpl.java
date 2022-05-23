package com.Portfolio.ArgentinaPrograma.services;

import com.Portfolio.ArgentinaPrograma.model.Educacion;
import com.Portfolio.ArgentinaPrograma.repository.BaseRepository;
import com.Portfolio.ArgentinaPrograma.repository.EducacionRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionServiceImpl extends BaseServiceImpl<Educacion, Long> implements EducacionService{
    
    @Autowired
    private EducacionRepository educacionRepository;
    
    public EducacionServiceImpl(BaseRepository<Educacion, Long> baseRepository){
        super(baseRepository);
    }


    
    

}
