package com.example.globalSolution.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.globalSolution.entities.Consulta;

/**
 * Interface de repositório para a entidade Consulta.
 * Utiliza o Spring Data JPA para operações de persistência.
 */
@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Integer> {
    // Métodos de consulta adicionais podem ser adicionados aqui, se necessário.
}
