package com.example.globalSolution.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.globalSolution.entities.Responsavel;
import com.example.globalSolution.service.ResponsavelService;

/**
 * Controlador para operações relacionadas a Responsáveis.
 */
@RestController
@RequestMapping("/responsavel")
public class ResponsavelController {

    @Autowired
    private ResponsavelService responsavelService;

    /**
     * Obtém um Responsável por ID.
     *
     * @param id_responsavel O ID do Responsável a ser recuperado.
     * @return ResponseEntity contendo o Responsável recuperado ou status HTTP 404 se não encontrado.
     */
    @GetMapping("/{id_responsavel}")
    public ResponseEntity<Responsavel> getResponsavelById(@PathVariable int id_responsavel) {
        Responsavel responsavel = responsavelService.getResponsavelById(id_responsavel);
        return ResponseEntity.ok(responsavel);
    }

    /**
     * Obtém todos os Responsáveis.
     *
     * @return ResponseEntity contendo a lista de todos os Responsáveis ou uma lista vazia se nenhum Responsável estiver presente.
     */
    @GetMapping("/getAll")
    public ResponseEntity<List<Responsavel>> getAllResponsaveis() {
        List<Responsavel> responsavel = responsavelService.getResponsaveis();
        return ResponseEntity.ok(responsavel);
    }

    /**
     * Adiciona um novo Responsável.
     *
     * @param responsavel O Responsável a ser adicionado.
     * @return ResponseEntity contendo o Responsável recém-criado e o status HTTP 201.
     */
    @PostMapping("/add")
    public ResponseEntity<Responsavel> addResponsavel(@RequestBody Responsavel responsavel) {
        Responsavel createdResponsavel = responsavelService.createResponsavel(responsavel);
        return new ResponseEntity<>(createdResponsavel, HttpStatus.CREATED);
    }

    /**
     * Adiciona uma lista de Responsáveis.
     *
     * @param responsaveis A lista de Responsáveis a ser adicionada.
     * @return ResponseEntity contendo a lista de Responsáveis recém-criados e o status HTTP 201.
     */
    @PostMapping("/addList")
    public ResponseEntity<List<Responsavel>> addResponsaveis(@RequestBody List<Responsavel> responsaveis) {
        List<Responsavel> createdResponsaveis = responsavelService.createResponsaveis(responsaveis);
        return new ResponseEntity<>(createdResponsaveis, HttpStatus.CREATED);
    }

    /**
     * Atualiza as informações de um Responsável existente.
     *
     * @param responsavel O Responsável com as informações atualizadas.
     * @return ResponseEntity contendo o Responsável atualizado.
     */
    @PutMapping("/update")
    public ResponseEntity<Responsavel> updateResponsavel(@RequestBody Responsavel responsavel) {
        Responsavel updatedResponsavel = responsavelService.updateResponsavel(responsavel);
        return ResponseEntity.ok(updatedResponsavel);
    }

    /**
     * Exclui um Responsável por ID.
     *
     * @param id_responsavel O ID do Responsável a ser excluído.
     * @return ResponseEntity contendo uma mensagem indicando o resultado da operação de exclusão.
     */
    @DeleteMapping("/delete/{id_responsavel}")
    public ResponseEntity<String> deleteResponsavel(@PathVariable int id_responsavel) {
        String result = responsavelService.deleteResponsavelById(id_responsavel);
        return ResponseEntity.ok(result);
    }
}
