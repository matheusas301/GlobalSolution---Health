package com.example.globalSolution.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.globalSolution.entities.Bebe;

/**
 * Interface de repositório para a entidade Bebe.
 * Utiliza o Spring Data JPA para operações de persistência.
 */
@Repository
public interface BebeRepository extends JpaRepository<Bebe, Integer> {
    // Métodos de consulta adicionais podem ser adicionados aqui, se necessário.
}
