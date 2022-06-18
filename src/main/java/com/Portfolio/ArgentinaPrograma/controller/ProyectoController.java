package com.Portfolio.ArgentinaPrograma.controller;

import com.Portfolio.ArgentinaPrograma.model.Proyecto;
import com.Portfolio.ArgentinaPrograma.services.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyecto")
public class ProyectoController {

    @Autowired
    private ProyectoService proyectoService;

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Proyecto entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(proyectoService.save(entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Proyecto entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(proyectoService.update(id, entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
        }
    }
//    @ResponseStatus(HttpStatus.OK)

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) throws Exception {
        try {
            proyectoService.delete(id);
            HttpStatus OK = HttpStatus.OK;

        } catch (Exception e) {
            ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
        }

    }
}
