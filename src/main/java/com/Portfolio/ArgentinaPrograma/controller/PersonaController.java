package com.Portfolio.ArgentinaPrograma.controller;

import com.Portfolio.ArgentinaPrograma.dto.PersonaDTO;
import com.Portfolio.ArgentinaPrograma.model.Persona;
import com.Portfolio.ArgentinaPrograma.services.IPersonaService;
import javax.websocket.server.PathParam;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private IPersonaService personaService;

    @PostMapping("/api")
    public ResponseEntity<PersonaDTO> crearPersona(@RequestBody PersonaDTO personaDto) {

        // convierte DTO to entity
        Persona personaRequest = modelMapper.map(personaDto, Persona.class);
        Persona persona = personaService.crearPersona(personaRequest);

        // convierte entity to DTO
        PersonaDTO personaResponse = modelMapper.map(persona, PersonaDTO.class);
        return new ResponseEntity<PersonaDTO>(personaResponse, HttpStatus.CREATED);
    }

//    @PostMapping
//    public ResponseEntity<PersonaDTO> save(@RequestBody PersonaDTO personaDto) {
//        PersonaDTO personaGuardada = personaService.save(personaDto);
//        return ResponseEntity.status(HttpStatus.CREATED).body(personaGuardada);
//
//    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonaDTO> traerPersonaById(@PathVariable(name = "id") Long id) {

        Persona personaMostrar = personaService.traerPersonaById(id);
        PersonaDTO perId = modelMapper.map(personaMostrar, PersonaDTO.class);
        return ResponseEntity.ok().body(perId);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> borrarPersona(@PathVariable(name = "id") Long id) {

        personaService.borrarPersona(id);

        return new ResponseEntity<String>("Persona eliminada correctamente", HttpStatus.OK);

    }

    @PutMapping("/{id}")
    public ResponseEntity<PersonaDTO> editarPersona(@PathVariable Long id,
                                                    @RequestBody PersonaDTO personaDto) {
        
        // convierte DTO to entity
        Persona personaRequest = modelMapper.map(personaDto, Persona.class);
        Persona persona = personaService.editarPersona(id, personaRequest);

        // convierte entity to DTO
        PersonaDTO personaResponse = modelMapper.map(persona, PersonaDTO.class);
        return ResponseEntity.ok().body(personaResponse);
    }
}
