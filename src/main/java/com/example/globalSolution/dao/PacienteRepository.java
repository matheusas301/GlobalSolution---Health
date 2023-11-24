package com.example.globalSolution.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.globalSolution.entities.Paciente;

/**
 * Interface de repositório para a entidade Paciente.
 * Utiliza o Spring Data JPA para operações de persistência.
 */
@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
	@Query("SELECT p FROM TB_PACIENTE p WHERE p.email_paciente = :email_paciente")
	Paciente findByEmail(String email_paciente);
	@Query("SELECT p FROM TB_PACIENTE p WHERE p.cpf_paciente = :cpf_paciente")
	Paciente findByCpf(String cpf_paciente);
}
