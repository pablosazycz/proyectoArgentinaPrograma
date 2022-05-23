
package com.Portfolio.ArgentinaPrograma.controller;

import com.Portfolio.ArgentinaPrograma.model.Localidad;
import com.Portfolio.ArgentinaPrograma.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{
    
    
}
