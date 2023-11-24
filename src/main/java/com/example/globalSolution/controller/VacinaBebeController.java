package com.example.globalSolution.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.globalSolution.entities.VacinaBebe;
import com.example.globalSolution.service.VacinaBebeService;

/**
 * Controlador para operações relacionadas a Vacinas de Bebês.
 */
@RestController
@RequestMapping("/vacina_bebe")
public class VacinaBebeController {
	@Autowired
    private VacinaBebeService vacinaBebeService;

    /**
     * Obtém uma Vacina de Bebê por ID.
     *
     * @param id_vacina_bebe O ID da Vacina de Bebê a ser recuperada.
     * @return ResponseEntity contendo a Vacina de Bebê recuperada ou status HTTP 404 se não encontrada.
     */
    @GetMapping("/{id_vacina_bebe}")
    public ResponseEntity<VacinaBebe> getVacinaBebeById(@PathVariable int id_vacina_bebe) {
    	VacinaBebe vacinaBebe = vacinaBebeService.getVacinaBebeById(id_vacina_bebe);
        return ResponseEntity.ok(vacinaBebe);
    }

    /**
     * Obtém todas as Vacinas de Bebês.
     *
     * @return ResponseEntity contendo a lista de todas as Vacinas de Bebês ou uma lista vazia se nenhuma Vacina de Bebê estiver presente.
     */
    @GetMapping("/getAll")
    public ResponseEntity<List<VacinaBebe>> getAllVacinasBebe() {
        List<VacinaBebe> vacinaBebe = vacinaBebeService.getVacinasBebe();
        return ResponseEntity.ok(vacinaBebe);
    }

    /**
     * Adiciona uma nova Vacina de Bebê.
     *
     * @param vacinaBebe A Vacina de Bebê a ser adicionada.
     * @return ResponseEntity contendo a Vacina de Bebê recém-criada e o status HTTP 201.
     */
    @PostMapping("/add")
    public ResponseEntity<VacinaBebe> addVacinaBebe(@RequestBody VacinaBebe vacinaBebe) {
    	VacinaBebe createdVacinaBebe = vacinaBebeService.createVacinaBebe(vacinaBebe);
        return new ResponseEntity<>(createdVacinaBebe, HttpStatus.CREATED);
    }

    /**
     * Adiciona uma lista de Vacinas de Bebês.
     *
     * @param vacinaBebe A lista de Vacinas de Bebês a ser adicionada.
     * @return ResponseEntity contendo a lista de Vacinas de Bebês recém-criadas e o status HTTP 201.
     */
    @PostMapping("/addList")
    public ResponseEntity<List<VacinaBebe>> addVacinasBebe(@RequestBody List<VacinaBebe> vacinaBebe) {
        List<VacinaBebe> createdVacinasBebe = vacinaBebeService.createVacinasBebe(vacinaBebe);
        return new ResponseEntity<>(createdVacinasBebe, HttpStatus.CREATED);
    }

    /**
     * Atualiza as informações de uma Vacina de Bebê existente.
     *
     * @param vacinaBebe A Vacina de Bebê com as informações atualizadas.
     * @return ResponseEntity contendo a Vacina de Bebê atualizada.
     */
    @PutMapping("/update")
    public ResponseEntity<VacinaBebe> updateVacinaBebe(@RequestBody VacinaBebe vacinaBebe) {
    	VacinaBebe updatedVacinaBebe = vacinaBebeService.updateVacinaBebe(vacinaBebe);
        return ResponseEntity.ok(updatedVacinaBebe);
    }

    /**
     * Exclui uma Vacina de Bebê por ID.
     *
     * @param id_vacina_bebe O ID da Vacina de Bebê a ser excluída.
     * @return ResponseEntity contendo uma mensagem indicando o resultado da operação de exclusão.
     */
    @DeleteMapping("/delete/{id_vacina_bebe}")
    public ResponseEntity<String> deleteVacinaBebe(@PathVariable int id_vacina_bebe) {
        String result = vacinaBebeService.deleteVacinaBebeById(id_vacina_bebe);
        return ResponseEntity.ok(result);
    }
}
