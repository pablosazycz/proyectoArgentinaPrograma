
package com.Portfolio.ArgentinaPrograma.controller;

import com.Portfolio.ArgentinaPrograma.model.Domicilio;
import com.Portfolio.ArgentinaPrograma.services.DomicilioService;
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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/domicilio")
public class DomicilioController {
    @Autowired
    private DomicilioService domicilioService;
    
    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Domicilio entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(domicilioService.save(entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
        }
    }
    
    

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Domicilio entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(domicilioService.update(id, entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
        }
    }

  @DeleteMapping("/{id}")
  @ResponseStatus(value = HttpStatus.OK)
    public void delete(@PathVariable Long id) throws Exception {
        domicilioService.delete(id);
    }
}
