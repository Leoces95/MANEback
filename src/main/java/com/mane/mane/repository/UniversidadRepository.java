package com.mane.mane.repository;

import com.mane.mane.entities.UniversidadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UniversidadRepository extends JpaRepository<UniversidadEntity, Integer> {

    @Query("SELECT u FROM UniversidadEntity u WHERE u.tipo = :tipo")
    List<UniversidadEntity> findByTipo(@Param("tipo") String tipo);
}
