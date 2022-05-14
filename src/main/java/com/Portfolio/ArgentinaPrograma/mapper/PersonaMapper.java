//package com.Portfolio.ArgentinaPrograma.mapper;
//
//import com.Portfolio.ArgentinaPrograma.dto.PersonaDTO;
//import com.Portfolio.ArgentinaPrograma.model.Persona;
//import org.springframework.stereotype.Component;
//
//@Component
//public class PersonaMapper {
//
//    public Persona dToEntity(PersonaDTO dto) {
//
//        Persona persona = new Persona();
//
//        persona.setApellido(dto.getApellido());
//        persona.setFecha_nac(dto.getFecha_nac());
//        persona.setNombre(dto.getNombre());
//        persona.setProfesion(dto.getProfesion());
//        persona.setUrl_foto(dto.getUrl_foto());
//        
//
//        return persona;
//    }
//
//    public PersonaDTO entityToDto(Persona entity) {
//
//        PersonaDTO dto = new PersonaDTO();
//
//        dto.setId(entity.getId());
//        dto.setApellido(entity.getApellido());
//        dto.setFecha_nac(entity.getFecha_nac());
//        dto.setNombre(entity.getNombre());
//        dto.setProfesion(entity.getProfesion());
//        dto.setUrl_foto(entity.getUrl_foto());
//
//        return dto;
//    }
//
//}
