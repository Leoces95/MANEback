package com.mane.mane.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "ESTUDIANTE")
public class EstudianteEntity {

    @Id
    @Column(name = "idEstudiante")
    private Integer idEstudiante;

    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;

    @Column(name = "apellido", length = 100, nullable = false)
    private String apellido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUniversidad", referencedColumnName = "IdUniversidad")
    private UniversidadEntity universidad;
}
