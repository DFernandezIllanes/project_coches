package com.project.coches.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Entidad de marca coche
 */
@Getter
@Setter
@Entity
@Table(name = "marca_coche")
public class MarcaCocheEntity {

    /**
     * Id de la marca
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * descripcion de la marca
     */
    @Column(name = "descripcion")
    private String description;
}
