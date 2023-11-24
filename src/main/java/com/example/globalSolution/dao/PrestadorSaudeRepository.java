package com.example.globalSolution.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.globalSolution.entities.PrestadorSaude;

/**
 * Interface de repositório para a entidade Prestador de Saude.
 * Utiliza o Spring Data JPA para operações de persistência.
 */
@Repository
public interface PrestadorSaudeRepository extends JpaRepository<PrestadorSaude, Integer>{
	// Métodos de consulta adicionais podem ser adicionados aqui, se necessário.
}
