package com.mane.mane.service.implementation;
import com.mane.mane.entities.UniversidadEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mane.mane.repository.UniversidadRepository;

import java.util.List;

@Service
public class UniversityService implements IUniversityService {
    @Autowired
    private UniversidadRepository repository;

    @Override
    public List<UniversidadEntity> consultarUniversidad() {
        //repository.consultar();
        return List.of();
    }

    @Override
    public String consultarNombre(int idUniversidad) {
        return "";
    }
}
