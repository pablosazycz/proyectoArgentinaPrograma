
package com.Portfolio.ArgentinaPrograma.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.*;


@Entity
@Table(name="localidad")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Localidad {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name="denominacion")
    private String denominacion;
    
    
    
}
