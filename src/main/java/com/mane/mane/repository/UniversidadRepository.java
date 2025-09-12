package com.mane.mane.repository;

import com.mane.mane.dto.UniversidadDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversidadRepository extends JpaRepository<UniversidadDto, Integer> {

}
