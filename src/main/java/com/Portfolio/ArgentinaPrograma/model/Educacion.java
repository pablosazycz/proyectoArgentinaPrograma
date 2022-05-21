package com.Portfolio.ArgentinaPrograma.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "Educacion")
@NoArgsConstructor
@AllArgsConstructor

public class Educacion extends Base {

    

    @Column(name = "titulo")
    private String titulo;  //titulo del estudio
    @Column(name = "estado")
    private String estado;
    @Column(name = "pais")
    private String pais;    // donde estudio
    @Column(name = "tipo_estudio")
    private String tipo_estudio;   //primario, secundario, terciario, etc
    @Column(name = "area_estudio")
    private String area_estudio;   //salud, ingenieria ,etc
    @Column(name = "institucion")
    private String institucion;    //nombre de la institucion
    @Column(name = "inicio")
    @Temporal(TemporalType.DATE)
    private Date fecha_inicio;
    @Column(name = "fin", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecha_fin;

    
  
}
