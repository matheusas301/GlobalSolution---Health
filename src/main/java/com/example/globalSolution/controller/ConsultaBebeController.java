package com.example.globalSolution.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.globalSolution.entities.ConsultaBebe;
import com.example.globalSolution.service.ConsultaBebeService;

/**
 * Controlador para operações relacionadas a Consultas de Bebês.
 */
@RestController
@RequestMapping("/consulta_bebe")
public class ConsultaBebeController {

    @Autowired
    private ConsultaBebeService consultaBebeService;

    /**
     * Obtém uma Consulta de Bebê por ID.
     *
     * @param id_consulta_bebe O ID da Consulta de Bebê a ser recuperada.
     * @return ResponseEntity contendo a Consulta de Bebê recuperada ou status HTTP 404 se não encontrada.
     */
    @GetMapping("/{id_consulta_bebe}")
    public ResponseEntity<ConsultaBebe> getConsultaBebeById(@PathVariable int id_consulta_bebe) {
        ConsultaBebe consultaBebe = consultaBebeService.getConsultaBebeById(id_consulta_bebe);
        return ResponseEntity.ok(consultaBebe);
    }

    /**
     * Obtém todas as Consultas de Bebês.
     *
     * @return ResponseEntity contendo a lista de todas as Consultas de Bebês ou uma lista vazia se nenhuma Consulta de Bebê estiver presente.
     */
    @GetMapping("/getAll")
    public ResponseEntity<List<ConsultaBebe>> getAllConsultasBebe() {
        List<ConsultaBebe> consultasBebe = consultaBebeService.getConsultasBebe();
        return ResponseEntity.ok(consultasBebe);
    }

    /**
     * Adiciona uma nova Consulta de Bebê.
     *
     * @param consultaBebe A Consulta de Bebê a ser adicionada.
     * @return ResponseEntity contendo a Consulta de Bebê recém-criada e o status HTTP 201.
     */
    @PostMapping("/add")
    public ResponseEntity<ConsultaBebe> addConsultaBebe(@RequestBody ConsultaBebe consultaBebe) {
        ConsultaBebe createdConsultaBebe = consultaBebeService.createConsultaBebe(consultaBebe);
        return new ResponseEntity<>(createdConsultaBebe, HttpStatus.CREATED);
    }

    /**
     * Adiciona uma lista de Consultas de Bebês.
     *
     * @param consultasBebe A lista de Consultas de Bebês a ser adicionada.
     * @return ResponseEntity contendo a lista de Consultas de Bebês recém-criadas e o status HTTP 201.
     */
    @PostMapping("/addList")
    public ResponseEntity<List<ConsultaBebe>> addConsultasBebe(@RequestBody List<ConsultaBebe> consultasBebe) {
        List<ConsultaBebe> createdConsultasBebe = consultaBebeService.createConsultasBebe(consultasBebe);
        return new ResponseEntity<>(createdConsultasBebe, HttpStatus.CREATED);
    }

    /**
     * Atualiza as informações de uma Consulta de Bebê existente.
     *
     * @param consultaBebe A Consulta de Bebê com as informações atualizadas.
     * @return ResponseEntity contendo a Consulta de Bebê atualizada.
     */
    @PutMapping("/update")
    public ResponseEntity<ConsultaBebe> updateConsultaBebe(@RequestBody ConsultaBebe consultaBebe) {
        ConsultaBebe updatedConsultaBebe = consultaBebeService.updateConsultaBebe(consultaBebe);
        return ResponseEntity.ok(updatedConsultaBebe);
    }

    /**
     * Exclui uma Consulta de Bebê por ID.
     *
     * @param id_consulta_bebe O ID da Consulta de Bebê a ser excluída.
     * @return ResponseEntity contendo uma mensagem indicando o resultado da operação de exclusão.
     */
    @DeleteMapping("/delete/{id_consulta_bebe}")
    public ResponseEntity<String> deleteConsultaBebe(@PathVariable int id_consulta_bebe) {
        String result = consultaBebeService.deleteConsultaBebeById(id_consulta_bebe);
        return ResponseEntity.ok(result);
    }
}
