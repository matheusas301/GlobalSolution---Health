package com.example.globalSolution.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.globalSolution.entities.ExameBebe;
import com.example.globalSolution.service.ExameBebeService;

/**
 * Controlador para operações relacionadas a Exames de Bebês.
 */
@RestController
@RequestMapping("/exame_bebe")
public class ExameBebeController {

    @Autowired
    private ExameBebeService exameBebeService;

    /**
     * Obtém um Exame de Bebê por ID.
     *
     * @param id_exame_bebe O ID do Exame de Bebê a ser recuperado.
     * @return ResponseEntity contendo o Exame de Bebê recuperado ou status HTTP 404 se não encontrado.
     */
    @GetMapping("/{id_exame_bebe}")
    public ResponseEntity<ExameBebe> getExameById(@PathVariable int id_exame_bebe) {
        ExameBebe exameBebe = exameBebeService.getExameBebeById(id_exame_bebe);
        return ResponseEntity.ok(exameBebe);
    }

    /**
     * Obtém todos os Exames de Bebês.
     *
     * @return ResponseEntity contendo a lista de todos os Exames de Bebês ou uma lista vazia se nenhum Exame de Bebê estiver presente.
     */
    @GetMapping("/getAll")
    public ResponseEntity<List<ExameBebe>> getAllExamesBebe() {
        List<ExameBebe> exameBebe = exameBebeService.getExamesBebe();
        return ResponseEntity.ok(exameBebe);
    }

    /**
     * Adiciona um novo Exame de Bebê.
     *
     * @param exameBebe O Exame de Bebê a ser adicionado.
     * @return ResponseEntity contendo o Exame de Bebê recém-criado e o status HTTP 201.
     */
    @PostMapping("/add")
    public ResponseEntity<ExameBebe> addExameBebe(@RequestBody ExameBebe exameBebe) {
        ExameBebe createdExameBebe = exameBebeService.createExameBebe(exameBebe);
        return new ResponseEntity<>(createdExameBebe, HttpStatus.CREATED);
    }

    /**
     * Adiciona uma lista de Exames de Bebês.
     *
     * @param examesBebe A lista de Exames de Bebês a ser adicionada.
     * @return ResponseEntity contendo a lista de Exames de Bebês recém-criados e o status HTTP 201.
     */
    @PostMapping("/addList")
    public ResponseEntity<List<ExameBebe>> addExamesBebe(@RequestBody List<ExameBebe> examesBebe) {
        List<ExameBebe> createdExamesBebe = exameBebeService.createExamesBebe(examesBebe);
        return new ResponseEntity<>(createdExamesBebe, HttpStatus.CREATED);
    }

    /**
     * Atualiza as informações de um Exame de Bebê existente.
     *
     * @param exameBebe O Exame de Bebê com as informações atualizadas.
     * @return ResponseEntity contendo o Exame de Bebê atualizado.
     */
    @PutMapping("/update")
    public ResponseEntity<ExameBebe> updateExameBebe(@RequestBody ExameBebe exameBebe) {
        ExameBebe updatedExameBebe = exameBebeService.updateExameBebe(exameBebe);
        return ResponseEntity.ok(updatedExameBebe);
    }

    /**
     * Exclui um Exame de Bebê por ID.
     *
     * @param id_exame_bebe O ID do Exame de Bebê a ser excluído.
     * @return ResponseEntity contendo uma mensagem indicando o resultado da operação de exclusão.
     */
    @DeleteMapping("/delete/{id_exame_bebe}")
    public ResponseEntity<String> deleteExameBebe(@PathVariable int id_exame_bebe) {
        String result = exameBebeService.deleteExameBebeById(id_exame_bebe);
        return ResponseEntity.ok(result);
    }
}