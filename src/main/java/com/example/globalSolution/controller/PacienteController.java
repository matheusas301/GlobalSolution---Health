package com.example.globalSolution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.globalSolution.entities.Paciente;
import com.example.globalSolution.service.PacienteService;

import java.util.List;

/**
 * Controlador para operações relacionadas a Pacientes.
 */
@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    /**
     * Obtém um Paciente por ID.
     *
     * @param id_paciente O ID do Paciente a ser recuperado.
     * @return ResponseEntity contendo o Paciente recuperado ou status HTTP 404 se não encontrado.
     */
    @GetMapping("/{id_paciente}")
    public ResponseEntity<Paciente> getPacienteById(@PathVariable int id_paciente) {
		Paciente paciente = pacienteService.getPacienteById(id_paciente);
        return ResponseEntity.ok(paciente);
    }


    /**
     * Obtém dados do Paciente por email.
     *
     * @param email_paciente O Email do Paciente a ser recuperado.
     * @return ResponseEntity contendo o Paciente recuperado ou status HTTP 404 se não encontrado.
     */
    @GetMapping("/byEmail/{email_paciente}")
    public Paciente getPacienteByEmail(@PathVariable String email_paciente) {
        return pacienteService.getPacienteByEmail(email_paciente);
    }

    /**
     * Obtém dados de login Paciente por Cpf.
     *
     * @param cpf_paciente O Cpf do Paciente a ser recuperado.
     * @return ResponseEntity contendo o Paciente recuperado ou status HTTP 404 se não encontrado.
     */
    @GetMapping("/byCpf/{cpf_paciente}")
    public ResponseEntity<Paciente> getPacienteByCpf(@PathVariable String cpf_paciente) {
        Paciente paciente = pacienteService.getPacienteByCpf(cpf_paciente);
        if (paciente != null) {
            return ResponseEntity.ok(paciente);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    

    /**
     * Obtém todos os Pacientes.
     *
     * @return ResponseEntity contendo a lista de todos os Pacientes ou uma lista vazia se nenhum Paciente estiver presente.
     */
    @GetMapping("/getAll")
    public ResponseEntity<List<Paciente>> getAllPacientes() {
        List<Paciente> pacientes = pacienteService.getPacientes();
        return ResponseEntity.ok(pacientes);
    }

    /**
     * Adiciona um novo Paciente.
     *
     * @param paciente O Paciente a ser adicionado.
     * @return ResponseEntity contendo o Paciente recém-criado e o status HTTP 201.
     */
    @PostMapping("/add")
    public ResponseEntity<Paciente> addPaciente(@RequestBody Paciente paciente) {
        Paciente createdPaciente = pacienteService.createPaciente(paciente);
        return new ResponseEntity<>(createdPaciente, HttpStatus.CREATED);
    }

    /**
     * Adiciona uma lista de Pacientes.
     *
     * @param pacientes A lista de Pacientes a ser adicionada.
     * @return ResponseEntity contendo a lista de Pacientes recém-criados e o status HTTP 201.
     */
    @PostMapping("/addList")
    public ResponseEntity<List<Paciente>> addPacientes(@RequestBody List<Paciente> pacientes) {
        List<Paciente> createdPacientes = pacienteService.createPacientes(pacientes);
        return new ResponseEntity<>(createdPacientes, HttpStatus.CREATED);
    }

    /**
     * Atualiza as informações de um Paciente existente.
     *
     * @param paciente O Paciente com as informações atualizadas.
     * @return ResponseEntity contendo o Paciente atualizado.
     */
    @PutMapping("/update")
    public ResponseEntity<Paciente> updatePaciente(@RequestBody Paciente paciente) {
        Paciente updatedPaciente = pacienteService.updatePaciente(paciente);
        return ResponseEntity.ok(updatedPaciente);
    }

    /**
     * Exclui um Paciente por ID.
     *
     * @param id_paciente O ID do Paciente a ser excluído.
     * @return ResponseEntity contendo uma mensagem indicando o resultado da operação de exclusão.
     */
    @DeleteMapping("/delete/{id_paciente}")
    public ResponseEntity<String> deletePaciente(@PathVariable int id_paciente) {
        String result = pacienteService.deletePacienteById(id_paciente);
        return ResponseEntity.ok(result);
    }
}
