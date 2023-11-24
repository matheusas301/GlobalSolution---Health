package com.example.globalSolution.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.globalSolution.dao.ConsultaBebeRepository;
import com.example.globalSolution.entities.ConsultaBebe;

/**
 * Serviço para manipulação de informações relacionadas a Consultas de Bebês.
 */
@Service
public class ConsultaBebeService {

    @Autowired
    private ConsultaBebeRepository consultaBebeRepository;

    /**
     * Cria uma nova consulta para bebê.
     *
     * @param consultaBebe A consulta para bebê a ser criada.
     * @return A consulta para bebê criada.
     */
    public ConsultaBebe createConsultaBebe(ConsultaBebe consultaBebe) {
        return consultaBebeRepository.save(consultaBebe);
    }

    /**
     * Cria várias consultas para bebê.
     *
     * @param consultasBebe A lista de consultas para bebê a ser criada.
     * @return A lista de consultas para bebê criada.
     */
    public List<ConsultaBebe> createConsultasBebe(List<ConsultaBebe> consultasBebe) {
        return consultaBebeRepository.saveAll(consultasBebe);
    }

    /**
     * Obtém uma consulta para bebê pelo ID.
     *
     * @param id_consulta_bebe O ID da consulta para bebê a ser obtida.
     * @return A consulta para bebê encontrada ou null se não existir.
     */
    public ConsultaBebe getConsultaBebeById(int id_consulta_bebe) {
        return consultaBebeRepository.findById(id_consulta_bebe).orElse(null);
    }

    /**
     * Obtém todas as consultas para bebê.
     *
     * @return A lista de todas as consultas para bebê.
     */
    public List<ConsultaBebe> getConsultasBebe() {
        return consultaBebeRepository.findAll();
    }

    /**
     * Atualiza as informações de uma consulta para bebê.
     *
     * @param consultaBebe As novas informações da consulta para bebê.
     * @return A consulta para bebê atualizada ou uma nova consulta para bebê se o ID não existir.
     */
    public ConsultaBebe updateConsultaBebe(ConsultaBebe consultaBebe) {
        ConsultaBebe oldUser = null;
        Optional<ConsultaBebe> optionalUser = consultaBebeRepository.findById(consultaBebe.getId_consulta_bebe());
        if (optionalUser.isPresent()) {
            oldUser = optionalUser.get();
            oldUser.setId_consulta_bebe(consultaBebe.getId_consulta_bebe());
            oldUser.setTipo_consulta_bebe(consultaBebe.getTipo_consulta_bebe());
            oldUser.setData_hora_consulta_bebe(consultaBebe.getData_hora_consulta_bebe());
            oldUser.setLocal_consulta_bebe(consultaBebe.getLocal_consulta_bebe());
            consultaBebeRepository.save(oldUser);
        } else {
            return new ConsultaBebe();
        }
        return oldUser;
    }

    /**
     * Deleta uma consulta para bebê pelo ID.
     *
     * @param id_consulta_bebe O ID da consulta para bebê a ser deletada.
     * @return Uma mensagem indicando que a consulta para bebê foi deletada.
     */
    public String deleteConsultaBebeById(int id_consulta_bebe) {
        consultaBebeRepository.deleteById(id_consulta_bebe);
        return "Consulta do bebê deletada!";
    }
}
