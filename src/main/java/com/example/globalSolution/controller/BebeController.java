package com.example.globalSolution.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.globalSolution.entities.Bebe;
import com.example.globalSolution.service.BebeService;

/**
 * Controlador REST para operações relacionadas a Bebês.
 */
@RestController
@RequestMapping("/bebe")
public class BebeController {

    @Autowired
    private BebeService bebeService;

    /**
     * Obtém um Bebê por ID.
     *
     * @param id_bebe O ID do Bebê a ser recuperado.
     * @return ResponseEntity contendo o Bebê recuperado ou status HTTP 404 se não encontrado.
     */
    @GetMapping("/{id_bebe}")
    public ResponseEntity<Bebe> getBebeById(@PathVariable int id_bebe) {
        Bebe bebe = bebeService.getBebeById(id_bebe);
        return ResponseEntity.ok(bebe);
    }

    /**
     * Obtém todos os Bebês.
     *
     * @return ResponseEntity contendo a lista de todos os Bebês ou uma lista vazia se nenhum Bebê estiver presente.
     */
    @GetMapping("/getAll")
    public ResponseEntity<List<Bebe>> getAllBebes() {
        List<Bebe> bebes = bebeService.getBebes();
        return ResponseEntity.ok(bebes);
    }

    /**
     * Adiciona um novo Bebê.
     *
     * @param bebe O Bebê a ser adicionado.
     * @return ResponseEntity contendo o Bebê recém-criado e o status HTTP 201.
     */
    @PostMapping("/add")
    public ResponseEntity<Bebe> addBebe(@RequestBody Bebe bebe) {
        Bebe createdBebe = bebeService.createBebe(bebe);
        return new ResponseEntity<>(createdBebe, HttpStatus.CREATED);
    }

    /**
     * Adiciona uma lista de Bebês.
     *
     * @param bebes A lista de Bebês a ser adicionada.
     * @return ResponseEntity contendo a lista de Bebês recém-criados e o status HTTP 201.
     */
    @PostMapping("/addList")
    public ResponseEntity<List<Bebe>> addBebes(@RequestBody List<Bebe> bebes) {
        List<Bebe> createdBebes = bebeService.createBebes(bebes);
        return new ResponseEntity<>(createdBebes, HttpStatus.CREATED);
    }

    /**
     * Atualiza as informações de um Bebê existente.
     *
     * @param bebe O Bebê com as informações atualizadas.
     * @return ResponseEntity contendo o Bebê atualizado.
     */
    @PutMapping("/update")
    public ResponseEntity<Bebe> updateBebe(@RequestBody Bebe bebe) {
        Bebe updatedBebe = bebeService.updateBebe(bebe);
        return ResponseEntity.ok(updatedBebe);
    }

    /**
     * Exclui um Bebê por ID.
     *
     * @param id_bebe O ID do Bebê a ser excluído.
     * @return ResponseEntity contendo uma mensagem indicando o resultado da operação de exclusão.
     */
    @DeleteMapping("/delete/{id_bebe}")
    public ResponseEntity<String> deleteBebe(@PathVariable int id_bebe) {
        String result = bebeService.deleteBebeById(id_bebe);
        return ResponseEntity.ok(result);
    }
}
