package com.example.globalSolution.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.globalSolution.entities.PrestadorSaude;
import com.example.globalSolution.service.PrestadorSaudeService;

/**
 * Controlador para operações relacionadas a Prestadores de Saúde.
 */
@RestController
@RequestMapping("/prestador_saude")
public class PrestadorSaudeController {

    @Autowired
    private PrestadorSaudeService prestadorSaudeService;

    /**
     * Obtém um Prestador de Saúde por ID.
     *
     * @param id_prestador_saude O ID do Prestador de Saúde a ser recuperado.
     * @return ResponseEntity contendo o Prestador de Saúde recuperado ou status HTTP 404 se não encontrado.
     */
    @GetMapping("/{id_prestador_saude}")
    public ResponseEntity<PrestadorSaude> getPrestadorSaudeById(@PathVariable int id_prestador_saude) {
        PrestadorSaude prestadorSaude = prestadorSaudeService.getPrestadorSaudeById(id_prestador_saude);
        return ResponseEntity.ok(prestadorSaude);
    }

    /**
     * Obtém todos os Prestadores de Saúde.
     *
     * @return ResponseEntity contendo a lista de todos os Prestadores de Saúde ou uma lista vazia se nenhum Prestador de Saúde estiver presente.
     */
    @GetMapping("/getAll")
    public ResponseEntity<List<PrestadorSaude>> getAllPrestadoresSaude() {
        List<PrestadorSaude> prestadorSaude = prestadorSaudeService.getPrestadoresSaude();
        return ResponseEntity.ok(prestadorSaude);
    }

    /**
     * Adiciona um novo Prestador de Saúde.
     *
     * @param prestadorSaude O Prestador de Saúde a ser adicionado.
     * @return ResponseEntity contendo o Prestador de Saúde recém-criado e o status HTTP 201.
     */
    @PostMapping("/add")
    public ResponseEntity<PrestadorSaude> addPrestadorSaude(@RequestBody PrestadorSaude prestadorSaude) {
        PrestadorSaude createdPrestadorSaude = prestadorSaudeService.createPrestadorSaude(prestadorSaude);
        return new ResponseEntity<>(createdPrestadorSaude, HttpStatus.CREATED);
    }

    /**
     * Adiciona uma lista de Prestadores de Saúde.
     *
     * @param prestadoresSaude A lista de Prestadores de Saúde a ser adicionada.
     * @return ResponseEntity contendo a lista de Prestadores de Saúde recém-criados e o status HTTP 201.
     */
    @PostMapping("/addList")
    public ResponseEntity<List<PrestadorSaude>> addPrestadoresSaude(@RequestBody List<PrestadorSaude> prestadoresSaude) {
        List<PrestadorSaude> createdPrestadoresSaude = prestadorSaudeService.createPrestadoresSaude(prestadoresSaude);
        return new ResponseEntity<>(createdPrestadoresSaude, HttpStatus.CREATED);
    }

    /**
     * Atualiza as informações de um Prestador de Saúde existente.
     *
     * @param prestadorSaude O Prestador de Saúde com as informações atualizadas.
     * @return ResponseEntity contendo o Prestador de Saúde atualizado.
     */
    @PutMapping("/update")
    public ResponseEntity<PrestadorSaude> updatePrestadorSaude(@RequestBody PrestadorSaude prestadorSaude) {
        PrestadorSaude updatedPrestadorSaude = prestadorSaudeService.updatePrestadorSaude(prestadorSaude);
        return ResponseEntity.ok(updatedPrestadorSaude);
    }

    /**
     * Exclui um Prestador de Saúde por ID.
     *
     * @param id_prestador_saude O ID do Prestador de Saúde a ser excluído.
     * @return ResponseEntity contendo uma mensagem indicando o resultado da operação de exclusão.
     */
    @DeleteMapping("/delete/{id_prestador_saude}")
    public ResponseEntity<String> deletePrestadorSaude(@PathVariable int id_prestador_saude) {
        String result = prestadorSaudeService.deletePrestadorSaudeById(id_prestador_saude);
        return ResponseEntity.ok(result);
    }
}

