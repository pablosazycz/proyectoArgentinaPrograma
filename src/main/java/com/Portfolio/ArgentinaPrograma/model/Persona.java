package com.Portfolio.ArgentinaPrograma.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.*;
import static org.hibernate.engine.internal.Cascade.cascade;

@Entity
@Getter @Setter
@Table(name="Persona")
@NoArgsConstructor
@AllArgsConstructor

public class Persona extends Base {
   
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
    private List<Educacion> educaciones = new ArrayList<Educacion>();
    
    @OneToMany(cascade= CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "persona_experiencia",
            joinColumns = @JoinColumn(name = "persona_id"),
            inverseJoinColumns = @JoinColumn(name = "experiencia_id")
    )
    private List<Experiencia_Laboral> experiencia = new ArrayList<Experiencia_Laboral>();
}
    
