package com.Portfolio.ArgentinaPrograma.controller;

import com.Portfolio.ArgentinaPrograma.model.Persona;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import com.Portfolio.ArgentinaPrograma.services.PersonaService;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins="*")
public class PersonaController {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private PersonaService personaService;
    
    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(personaService.findAll());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(personaService.findById(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
        }
    }

    @PostMapping("/nuevo")
    public ResponseEntity<?> save(@RequestBody Persona entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(personaService.save(entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
        }
    }
    
    

    @PutMapping("/editar/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Persona entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(personaService.update(id, entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(personaService.delete(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
        }

    }
    
    

//    @PostMapping("/api")
//    public ResponseEntity<PersonaDTO> crearPersona(@RequestBody PersonaDTO personaDto) {
//
//        // convierte DTO to entity
//        Persona personaRequest = modelMapper.map(personaDto, Persona.class);
//        Persona persona = personaService.crearPersona(personaRequest);
//
//        // convierte entity to DTO
//        PersonaDTO personaResponse = modelMapper.map(persona, PersonaDTO.class);
//        return new ResponseEntity<PersonaDTO>(personaResponse, HttpStatus.CREATED);
//    }
//
////    @PostMapping
////    public ResponseEntity<PersonaDTO> save(@RequestBody PersonaDTO personaDto) {
////        PersonaDTO personaGuardada = personaService.save(personaDto);
////        return ResponseEntity.status(HttpStatus.CREATED).body(personaGuardada);
////
////    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<PersonaDTO> traerPersonaById(@PathVariable(name = "id") Long id) {
//
//        Persona personaMostrar = personaService.traerPersonaById(id);
//        PersonaDTO perId = modelMapper.map(personaMostrar, PersonaDTO.class);
//        return ResponseEntity.ok().body(perId);
//
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<String> borrarPersona(@PathVariable(name = "id") Long id) {
//
//        personaService.borrarPersona(id);
//
//        return new ResponseEntity<String>("Persona eliminada correctamente", HttpStatus.OK);
//
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<PersonaDTO> editarPersona(@PathVariable Long id,
//                                                    @RequestBody PersonaDTO personaDto) {
//        
//        // convierte DTO to entity
//        Persona personaRequest = modelMapper.map(personaDto, Persona.class);
//        Persona persona = personaService.editarPersona(id, personaRequest);
//
//        // convierte entity to DTO
//        PersonaDTO personaResponse = modelMapper.map(persona, PersonaDTO.class);
//        return ResponseEntity.ok().body(personaResponse);
//    }
}
