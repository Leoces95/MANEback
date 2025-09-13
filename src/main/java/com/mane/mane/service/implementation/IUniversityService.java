package com.mane.mane.service.implementation;

import com.mane.mane.entities.UniversidadEntity;

import java.util.List;

public interface IUniversityService {
    List<UniversidadEntity> consultarUniversidad();

    String consultarNombre(int idUniversidad);
}
