package com.example.globalSolution.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.globalSolution.dao.ExameBebeRepository;
import com.example.globalSolution.entities.ExameBebe;

/**
 * Serviço para manipulação de informações relacionadas a Exames de Bebês.
 */
@Service
public class ExameBebeService {

    @Autowired
    private ExameBebeRepository exameBebeRepository;

    /**
     * Cria um novo exame de bebê.
     *
     * @param examebebe O exame de bebê a ser criado.
     * @return O exame de bebê criado.
     */
    public ExameBebe createExameBebe(ExameBebe examebebe) {
        return exameBebeRepository.save(examebebe);
    }

    /**
     * Cria vários exames de bebê.
     *
     * @param examebebes A lista de exames de bebê a ser criada.
     * @return A lista de exames de bebê criada.
     */
    public List<ExameBebe> createExamesBebe(List<ExameBebe> examebebes) {
        return exameBebeRepository.saveAll(examebebes);
    }

    /**
     * Obtém um exame de bebê pelo ID.
     *
     * @param id_exame_bebe O ID do exame de bebê a ser obtido.
     * @return O exame de bebê encontrado ou null se não existir.
     */
    public ExameBebe getExameBebeById(int id_exame_bebe) {
        return exameBebeRepository.findById(id_exame_bebe).orElse(null);
    }

    /**
     * Obtém todos os exames de bebê.
     *
     * @return A lista de todos os exames de bebê.
     */
    public List<ExameBebe> getExamesBebe() {
        return exameBebeRepository.findAll();
    }

    /**
     * Atualiza as informações de um exame de bebê.
     *
     * @param examebebe As novas informações do exame de bebê.
     * @return O exame de bebê atualizado ou um novo exame de bebê se o ID não existir.
     */
    public ExameBebe updateExameBebe(ExameBebe examebebe) {
        ExameBebe oldUser = null;
        Optional<ExameBebe> optionalUser = exameBebeRepository.findById(examebebe.getId_exame_bebe());
        if (optionalUser.isPresent()) {
            oldUser = optionalUser.get();
            oldUser.setId_exame_bebe(examebebe.getId_exame_bebe());
            oldUser.setTipo_exame_bebe(examebebe.getTipo_exame_bebe());
            oldUser.setData_hora_exame_bebe(examebebe.getData_hora_exame_bebe());
            oldUser.setLocal_exame_bebe(examebebe.getLocal_exame_bebe());
            exameBebeRepository.save(oldUser);
        } else {
            return new ExameBebe();
        }
        return oldUser;
    }

    /**
     * Deleta um exame de bebê pelo ID.
     *
     * @param id_exame_bebe O ID do exame de bebê a ser deletado.
     * @return Uma mensagem indicando que o exame de bebê foi deletado.
     */
    public String deleteExameBebeById(int id_exame_bebe) {
        exameBebeRepository.deleteById(id_exame_bebe);
        return "Exame do bebê deletado!";
    }
}
