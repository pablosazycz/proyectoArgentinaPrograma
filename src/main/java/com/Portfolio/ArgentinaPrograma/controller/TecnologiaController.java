
package com.Portfolio.ArgentinaPrograma.controller;

import com.Portfolio.ArgentinaPrograma.model.Tecnologia;
import com.Portfolio.ArgentinaPrograma.services.TecnologiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/tecnologia")
public class TecnologiaController {
    
    @Autowired
    private TecnologiaService tecnologiaService;
    
     @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Tecnologia entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(tecnologiaService.save(entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
        }
    }
    
    

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Tecnologia entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(tecnologiaService.update(id, entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
        }
    }

   @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) throws Exception {
        try {
            tecnologiaService.delete(id);
            HttpStatus OK = HttpStatus.OK;

        } catch (Exception e) {
            ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
        }

    }
    
    
}
