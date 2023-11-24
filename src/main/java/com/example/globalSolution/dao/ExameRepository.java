package com.example.globalSolution.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.globalSolution.entities.Exame;

/**
 * Interface de repositório para a entidade Exame.
 * Utiliza o Spring Data JPA para operações de persistência.
 */
@Repository
public interface ExameRepository extends JpaRepository<Exame, Integer>{
	// Métodos de consulta adicionais podem ser adicionados aqui, se necessário.
}
