package com.Portfolio.ArgentinaPrograma.controller;

import com.Portfolio.ArgentinaPrograma.model.Persona;
import com.Portfolio.ArgentinaPrograma.services.PersonaServiceImpl;
//import com.Portfolio.ArgentinaPrograma.services.IPersonaService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/persona")
public class PersonaController extends  BaseControllerImpl <Persona, PersonaServiceImpl>{

}
