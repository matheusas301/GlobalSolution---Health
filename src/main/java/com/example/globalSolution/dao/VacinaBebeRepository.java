package com.example.globalSolution.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.globalSolution.entities.VacinaBebe;

/**
 * Interface de repositório para a entidade Vacina do Bebe.
 * Utiliza o Spring Data JPA para operações de persistência.
 */
@Repository
public interface VacinaBebeRepository extends JpaRepository<VacinaBebe, Integer> {
	// Métodos de consulta adicionais podem ser adicionados aqui, se necessário.
}
