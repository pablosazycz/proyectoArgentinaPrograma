
package com.Portfolio.ArgentinaPrograma.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name="Educacion")
@NoArgsConstructor
@AllArgsConstructor

public class Educacion implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private String titulo;  //titulo del estudio
    private String pais;    // donde estudio
    private String tipo_estudio;   //primario, secundario, terciario, etc
    private String area_estudio;   //salud, ingenieria ,etc
    private String institucion;    //nombre de la institucion
    private String estado_estudio; //finalizo o en curso
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_inicio;     //cuando comenzo
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_finalizacion;  //cuando termino
    
     @ManyToOne
    @JoinColumn(name="persona_id")
    private Persona persona;
    
}
