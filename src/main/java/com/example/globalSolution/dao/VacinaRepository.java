package com.example.globalSolution.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.globalSolution.entities.Vacina;

/**
 * Interface de repositório para a entidade Vacina.
 * Utiliza o Spring Data JPA para operações de persistência.
 */
@Repository
public interface VacinaRepository extends JpaRepository<Vacina, Integer> {
	// Métodos de consulta adicionais podem ser adicionados aqui, se necessário.
}
