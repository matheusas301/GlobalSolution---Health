package com.example.globalSolution.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.globalSolution.entities.Consulta;
import com.example.globalSolution.service.ConsultaService;

/**
 * Controlador para operações relacionadas a Consultas.
 */
@RestController
@RequestMapping("/consulta")
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    /**
     * Obtém uma Consulta por ID.
     *
     * @param id_consulta O ID da Consulta a ser recuperada.
     * @return ResponseEntity contendo a Consulta recuperada ou status HTTP 404 se não encontrada.
     */
    @GetMapping("/{id_consulta}")
    public ResponseEntity<Consulta> getConsultaById(@PathVariable int id_consulta) {
        Consulta consulta = consultaService.getConsultaById(id_consulta);
        return ResponseEntity.ok(consulta);
    }

    /**
     * Obtém todas as Consultas.
     *
     * @return ResponseEntity contendo a lista de todas as Consultas ou uma lista vazia se nenhuma Consulta estiver presente.
     */
    @GetMapping("/getAll")
    public ResponseEntity<List<Consulta>> getAllConsultas() {
        List<Consulta> consultas = consultaService.getConsultas();
        return ResponseEntity.ok(consultas);
    }

    /**
     * Adiciona uma nova Consulta.
     *
     * @param consulta A Consulta a ser adicionada.
     * @return ResponseEntity contendo a Consulta recém-criada e o status HTTP 201.
     */
    @PostMapping("/add")
    public ResponseEntity<Consulta> addConsulta(@RequestBody Consulta consulta) {
        Consulta createdConsulta = consultaService.createConsulta(consulta);
        return new ResponseEntity<>(createdConsulta, HttpStatus.CREATED);
    }

    /**
     * Adiciona uma lista de Consultas.
     *
     * @param consultas A lista de Consultas a ser adicionada.
     * @return ResponseEntity contendo a lista de Consultas recém-criadas e o status HTTP 201.
     */
    @PostMapping("/addList")
    public ResponseEntity<List<Consulta>> addConsultas(@RequestBody List<Consulta> consultas) {
        List<Consulta> createdConsultas = consultaService.createConsultas(consultas);
        return new ResponseEntity<>(createdConsultas, HttpStatus.CREATED);
    }

    /**
     * Atualiza as informações de uma Consulta existente.
     *
     * @param consulta A Consulta com as informações atualizadas.
     * @return ResponseEntity contendo a Consulta atualizada.
     */
    @PutMapping("/update")
    public ResponseEntity<Consulta> updateConsulta(@RequestBody Consulta consulta) {
        Consulta updatedConsulta = consultaService.updateConsulta(consulta);
        return ResponseEntity.ok(updatedConsulta);
    }

    /**
     * Exclui uma Consulta por ID.
     *
     * @param id_consulta O ID da Consulta a ser excluída.
     * @return ResponseEntity contendo uma mensagem indicando o resultado da operação de exclusão.
     */
    @DeleteMapping("/delete/{id_consulta}")
    public ResponseEntity<String> deleteConsulta(@PathVariable int id_consulta) {
        String result = consultaService.deleteConsultaById(id_consulta);
        return ResponseEntity.ok(result);
    }
}
