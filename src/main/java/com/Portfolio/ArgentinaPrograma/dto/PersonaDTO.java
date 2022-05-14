
package com.Portfolio.ArgentinaPrograma.dto;

import java.util.Date;
import lombok.*;

@Getter @Setter

public class PersonaDTO {
    
    private Long id;
    private String nombre;
    private String apellido;
    private Date fecha_nac;
    private String profesion;
    private String url_foto;
    
}
