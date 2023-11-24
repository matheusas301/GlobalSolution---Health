package com.example.globalSolution.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.globalSolution.entities.Responsavel;

/**
 * Interface de repositório para a entidade Responsavel.
 * Utiliza o Spring Data JPA para operações de persistência.
 */
@Repository
public interface ResponsavelRepository extends JpaRepository<Responsavel, Integer>{
	// Métodos de consulta adicionais podem ser adicionados aqui, se necessário.
}
