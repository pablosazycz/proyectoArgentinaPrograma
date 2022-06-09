
package com.Portfolio.ArgentinaPrograma.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import javax.persistence.Table;
import lombok.*;

@Entity
@Table(name="domicilio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Domicilio implements Serializable{
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name="calle")
    private String calle;
    
    @Column(name="numero")
    private int numero;
    
   @OneToOne()
    @JoinColumn(name="persona_id")
    private Persona persona;
   
}
