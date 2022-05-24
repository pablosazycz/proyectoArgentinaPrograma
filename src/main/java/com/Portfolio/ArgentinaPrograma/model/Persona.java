package com.Portfolio.ArgentinaPrograma.model;

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
@Getter @Setter
@Table(name="Persona")
@NoArgsConstructor
@AllArgsConstructor
public class Persona {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_nac;
    private String profesion;
    private String url_foto;
    


@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_domicilio")
    private Domicilio domicilio;
   
    @OneToMany(cascade= CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "persona_educacion",
            joinColumns = @JoinColumn(name = "persona_id"),
            inverseJoinColumns = @JoinColumn(name = "educacion_id")
    )
    private Collection<Educacion> educaciones = new ArrayList<Educacion>();
    
    @OneToMany(cascade= CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "persona_experiencia",
            joinColumns = @JoinColumn(name = "persona_id"),
            inverseJoinColumns = @JoinColumn(name = "experiencia_id")
    )
    private Collection<ExperienciaLaboral> experiencia = new ArrayList<ExperienciaLaboral>();
   
    
    
}
    
