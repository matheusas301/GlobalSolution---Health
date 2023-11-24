package com.example.globalSolution.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.globalSolution.entities.Exame;
import com.example.globalSolution.service.ExameService;

/**
 * Controlador para operações relacionadas a Exames.
 */
@RestController
@RequestMapping("/exame")
public class ExameController {

    @Autowired
    private ExameService exameService;

    /**
     * Obtém um Exame por ID.
     *
     * @param id_exame O ID do Exame a ser recuperado.
     * @return ResponseEntity contendo o Exame recuperado ou status HTTP 404 se não encontrado.
     */
    @GetMapping("/{id_exame}")
    public ResponseEntity<Exame> getExameById(@PathVariable int id_exame) {
        Exame exame = exameService.getExameById(id_exame);
        return ResponseEntity.ok(exame);
    }

    /**
     * Obtém todos os Exames.
     *
     * @return ResponseEntity contendo a lista de todos os Exames ou uma lista vazia se nenhum Exame estiver presente.
     */
    @GetMapping("/getAll")
    public ResponseEntity<List<Exame>> getAllExames() {
        List<Exame> exame = exameService.getExames();
        return ResponseEntity.ok(exame);
    }

    /**
     * Adiciona um novo Exame.
     *
     * @param exame O Exame a ser adicionado.
     * @return ResponseEntity contendo o Exame recém-criado e o status HTTP 201.
     */
    @PostMapping("/add")
    public ResponseEntity<Exame> addExame(@RequestBody Exame exame) {
        Exame createdExame = exameService.createExame(exame);
        return new ResponseEntity<>(createdExame, HttpStatus.CREATED);
    }

    /**
     * Adiciona uma lista de Exames.
     *
     * @param exames A lista de Exames a ser adicionada.
     * @return ResponseEntity contendo a lista de Exames recém-criados e o status HTTP 201.
     */
    @PostMapping("/addList")
    public ResponseEntity<List<Exame>> addExames(@RequestBody List<Exame> exames) {
        List<Exame> createdExames = exameService.createExames(exames);
        return new ResponseEntity<>(createdExames, HttpStatus.CREATED);
    }

    /**
     * Atualiza as informações de um Exame existente.
     *
     * @param exame O Exame com as informações atualizadas.
     * @return ResponseEntity contendo o Exame atualizado.
     */
    @PutMapping("/update")
    public ResponseEntity<Exame> updateExame(@RequestBody Exame exame) {
        Exame updatedExame = exameService.updateExame(exame);
        return ResponseEntity.ok(updatedExame);
    }

    /**
     * Exclui um Exame por ID.
     *
     * @param id_exame O ID do Exame a ser excluído.
     * @return ResponseEntity contendo uma mensagem indicando o resultado da operação de exclusão.
     */
    @DeleteMapping("/delete/{id_exame}")
    public ResponseEntity<String> deleteExame(@PathVariable int id_exame) {
        String result = exameService.deleteExameById(id_exame);
        return ResponseEntity.ok(result);
    }
}
