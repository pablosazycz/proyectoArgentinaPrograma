
package com.Portfolio.ArgentinaPrograma.model;

import java.util.Date;
import javax.persistence.*;
import lombok.*;

@Entity
@Table(name="experiencia")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ExperienciaLaboral {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private String empresa;            //nombre de la empresa
    private String actividad_empresa;  // rubro de la empresa
    private String puesto;             //cargo en la empresa
    private String nivel_experiencia;  // junior, sennior, semi-sennior
    private String area_puesto;        //area del puesto que estuvo
    private String pais;               //pais de la empresa
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_inicio;         // cuando comenzo
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_finalizacion;  // termino o al presente
   
    private String descripcion_tarea;    //tareas que hacia
    
    private int personas_cargo;          //tenia personas a cargo
}
