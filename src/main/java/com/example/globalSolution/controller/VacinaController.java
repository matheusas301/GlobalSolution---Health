package com.example.globalSolution.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.globalSolution.entities.Vacina;
import com.example.globalSolution.service.VacinaService;

/**
 * Controlador para operações relacionadas a Vacinas.
 */
@RestController
@RequestMapping("/vacina")
public class VacinaController {
	@Autowired
    private VacinaService vacinaService;

    /**
     * Obtém uma Vacina por ID.
     *
     * @param id_vacina O ID da Vacina a ser recuperada.
     * @return ResponseEntity contendo a Vacina recuperada ou status HTTP 404 se não encontrada.
     */
    @GetMapping("/{id_vacina}")
    public ResponseEntity<Vacina> getVacinaBebeById(@PathVariable int id_vacina) {
    	Vacina vacina = vacinaService.getVacinaById(id_vacina);
        return ResponseEntity.ok(vacina);
    }

    /**
     * Obtém todas as Vacinas.
     *
     * @return ResponseEntity contendo a lista de todas as Vacinas ou uma lista vazia se nenhuma Vacina estiver presente.
     */
    @GetMapping("/getAll")
    public ResponseEntity<List<Vacina>> getAllVacinas() {
        List<Vacina> vacina = vacinaService.getVacinas();
        return ResponseEntity.ok(vacina);
    }

    /**
     * Adiciona uma nova Vacina.
     *
     * @param vacina A Vacina a ser adicionada.
     * @return ResponseEntity contendo a Vacina recém-criada e o status HTTP 201.
     */
    @PostMapping("/add")
    public ResponseEntity<Vacina> addVacina(@RequestBody Vacina vacina) {
    	Vacina createdVacina = vacinaService.createVacina(vacina);
        return new ResponseEntity<>(createdVacina, HttpStatus.CREATED);
    }

    /**
     * Adiciona uma lista de Vacinas.
     *
     * @param vacina A lista de Vacinas a ser adicionada.
     * @return ResponseEntity contendo a lista de Vacinas recém-criadas e o status HTTP 201.
     */
    @PostMapping("/addList")
    public ResponseEntity<List<Vacina>> addVacinas(@RequestBody List<Vacina> vacina) {
        List<Vacina> createdVacinas = vacinaService.createVacinas(vacina);
        return new ResponseEntity<>(createdVacinas, HttpStatus.CREATED);
    }

    /**
     * Atualiza as informações de uma Vacina existente.
     *
     * @param vacina A Vacina com as informações atualizadas.
     * @return ResponseEntity contendo a Vacina atualizada.
     */
    @PutMapping("/update")
    public ResponseEntity<Vacina> updateVacina(@RequestBody Vacina vacina) {
    	Vacina updatedVacina = vacinaService.updateVacina(vacina);
        return ResponseEntity.ok(updatedVacina);
    }

    /**
     * Exclui uma Vacina por ID.
     *
     * @param id_vacina O ID da Vacina a ser excluída.
     * @return ResponseEntity contendo uma mensagem indicando o resultado da operação de exclusão.
     */
    @DeleteMapping("/delete/{id_vacina}")
    public ResponseEntity<String> deleteVacina(@PathVariable int id_vacina) {
        String result = vacinaService.deleteVacinaById(id_vacina);
        return ResponseEntity.ok(result);
    }
}