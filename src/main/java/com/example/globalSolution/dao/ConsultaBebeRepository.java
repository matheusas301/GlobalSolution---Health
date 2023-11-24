package com.example.globalSolution.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.globalSolution.entities.ConsultaBebe;

/**
 * Interface de repositório para a entidade Consulta do Bebe.
 * Utiliza o Spring Data JPA para operações de persistência.
 */
@Repository
public interface ConsultaBebeRepository extends JpaRepository<ConsultaBebe, Integer> {
    // Métodos de consulta adicionais podem ser adicionados aqui, se necessário.
}
