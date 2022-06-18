package com.Portfolio.ArgentinaPrograma.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
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

    @OneToOne( mappedBy="persona",cascade = {CascadeType.PERSIST, CascadeType.MERGE}  )
    private Domicilio domicilio;

    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Educacion> educaciones;

    @OneToMany(cascade = CascadeType.ALL)
    private Collection<ExperienciaLaboral> experiencia;

    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Proyecto> proyectos;

    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Tecnologia> tecnologias;

}
