package com.Portfolio.ArgentinaPrograma.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import static org.hibernate.engine.internal.Cascade.cascade;

@Entity
@Getter @Setter
@Table(name="Persona")

public class Persona {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_nac;
    private String profesion;
    private String url_foto;
    

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, Date fecha_nac, String profesion, String url_foto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
        this.profesion = profesion;
        this.url_foto = url_foto;
    }

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
    
    
}
    
