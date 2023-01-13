package com.backend.crud.repository;

import com.backend.crud.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {
    Optional<Persona> findByNombre(String nombre);
    boolean existsByNombre(String nombre);
}
