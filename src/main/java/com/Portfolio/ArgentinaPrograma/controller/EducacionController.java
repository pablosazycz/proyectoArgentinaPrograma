package com.Portfolio.ArgentinaPrograma.controller;

import com.Portfolio.ArgentinaPrograma.model.Educacion;
import com.Portfolio.ArgentinaPrograma.services.EducacionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(path = "/educacion")
public class EducacionController {

//    @Autowired
    private EducacionServiceImpl educacionService;
    
    public EducacionController(EducacionServiceImpl educacionService){
        this.educacionService=educacionService;
    }

    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(educacionService.findAll());

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
        }
    }

@GetMapping("/{id}")
public ResponseEntity<?> getOne (@PathVariable Long id){
    try {
            return ResponseEntity.status(HttpStatus.OK).body(educacionService.findById(id));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
        }
}

@PostMapping("/nuevo")
public ResponseEntity<?> save (@RequestBody Educacion entity){
    try {
            return ResponseEntity.status(HttpStatus.OK).body(educacionService.save(entity));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
        }
}
@PutMapping("edit/{id}")
public ResponseEntity<?> update (@PathVariable Long id, @RequestBody Educacion entity){
    try {
            return ResponseEntity.status(HttpStatus.OK).body(educacionService.update(id, entity));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
        }
}

@DeleteMapping("/{id}")
public ResponseEntity<?> delete (@PathVariable Long id){
     try {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(educacionService.delete(id));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
        }
    
}
}