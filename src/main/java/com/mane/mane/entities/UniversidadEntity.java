package com.mane.mane.entities;

import jakarta.persistence.*;


import java.util.List;

@Entity
@Table(name = "UNIVERSIDAD")
public class UniversidadEntity {

    @Id
    @Column(name = "idUniversidad")
    private Integer idUniversidad;

    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;

    @Column(name = "tipo", length = 50)
    private String tipo;

    @Column(name = "direccion", length = 200)
    private String direccion;

    @OneToMany(mappedBy = "universidad", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<EstudianteEntity> estudiantes;

}
