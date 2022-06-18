package com.Portfolio.ArgentinaPrograma.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tecnologia")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tecnologia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "tecnologia")
    private String tecnologia;
    @Column(name = "porcentaje")
    private double porcentaje;
    @Column(name ="imagen")
    private String UrlImagen;



}
