package com.Portfolio.ArgentinaPrograma.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "persona")
@NoArgsConstructor
@AllArgsConstructor
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_nac;
    private String profesion;
    private String url_foto;

    @OneToOne(cascade = CascadeType.ALL)
 //   @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;

    @OneToMany(cascade= CascadeType.ALL)
//    @JoinTable(
//            name = "persona_educacion",
//            joinColumns = @JoinColumn(name = "persona_id"),
//            inverseJoinColumns = @JoinColumn(name = "educacion_id")
//    )
    private Collection<Educacion> educaciones;

    
    @OneToMany(cascade= CascadeType.ALL)
//    @JoinTable(
//            name = "persona_experiencia",
//            joinColumns = @JoinColumn(name = "persona_id"),
//            inverseJoinColumns = @JoinColumn(name = "experiencia_id")
//    )
    private Collection<ExperienciaLaboral> experiencia;
    
    @OneToMany(cascade= CascadeType.ALL)
//    @JoinTable(
//            name = "persona_proyecto",
//            joinColumns = @JoinColumn(name = "persona_id"),
//            inverseJoinColumns = @JoinColumn(name = "proyecto_id")
//    )
    private Collection<Proyecto> proyectos;
    
    @OneToMany(cascade= CascadeType.ALL)
//    @JoinTable(
//            name = "persona_tecnologias",
//            joinColumns = @JoinColumn(name = "persona_id"),
//            inverseJoinColumns = @JoinColumn(name = "tecnologias_id")
//    )
    private Collection<Tecnologia> tecnologias;

}
