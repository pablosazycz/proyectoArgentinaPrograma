
package com.Portfolio.ArgentinaPrograma.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.*;

@Entity
@Table(name="experiencia")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ExperienciaLaboral implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private String empresa;            //nombre de la empresa
    private String actividad_empresa;  // rubro de la empresa
    private String puesto;             //cargo en la empresa
    private String nivel_experiencia;  // junior, sennior, semi-sennior
    private String area_puesto;        //area del puesto que estuvo
    private String pais;               //pais de la empresa

    private String fecha_inicio;         // cuando comenzo
    
    private String fecha_finalizacion;  // termino o al presente
   
    private String descripcion_tarea;    //tareas que hacia
    
    private int personas_cargo;  
    private String urlImagen;//tenia personas a cargo
    
   
}
