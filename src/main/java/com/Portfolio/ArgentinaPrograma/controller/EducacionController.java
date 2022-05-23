package com.Portfolio.ArgentinaPrograma.controller;

import com.Portfolio.ArgentinaPrograma.model.Educacion;
import com.Portfolio.ArgentinaPrograma.services.EducacionServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/educacion")
public class EducacionController extends BaseControllerImpl <Educacion, EducacionServiceImpl>{

}