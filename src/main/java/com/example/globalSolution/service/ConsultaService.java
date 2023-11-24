package com.example.globalSolution.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.globalSolution.dao.ConsultaRepository;
import com.example.globalSolution.entities.Consulta;

/**
 * Serviço para manipulação de informações relacionadas a Consultas.
 */
@Service
public class ConsultaService {

    @Autowired
    private ConsultaRepository consultaRepository;

    /**
     * Cria uma nova consulta.
     *
     * @param consulta A consulta a ser criada.
     * @return A consulta criada.
     */
    public Consulta createConsulta(Consulta consulta) {
        return consultaRepository.save(consulta);
    }

    /**
     * Cria várias consultas.
     *
     * @param consultas A lista de consultas a ser criada.
     * @return A lista de consultas criada.
     */
    public List<Consulta> createConsultas(List<Consulta> consultas) {
        return consultaRepository.saveAll(consultas);
    }

    /**
     * Obtém uma consulta pelo ID.
     *
     * @param id_consulta O ID da consulta a ser obtida.
     * @return A consulta encontrada ou null se não existir.
     */
    public Consulta getConsultaById(int id_consulta) {
        return consultaRepository.findById(id_consulta).orElse(null);
    }

    /**
     * Obtém todas as consultas.
     *
     * @return A lista de todas as consultas.
     */
    public List<Consulta> getConsultas() {
        return consultaRepository.findAll();
    }

    /**
     * Atualiza as informações de uma consulta.
     *
     * @param consulta As novas informações da consulta.
     * @return A consulta atualizada ou uma nova consulta se o ID não existir.
     */
    public Consulta updateConsulta(Consulta consulta) {
        Consulta oldUser = null;
        Optional<Consulta> optionalUser = consultaRepository.findById(consulta.getId_consulta());
        if (optionalUser.isPresent()) {
            oldUser = optionalUser.get();
            oldUser.setId_consulta(consulta.getId_consulta());
            oldUser.setTipo_consulta(consulta.getTipo_consulta());
            oldUser.setData_hora_consulta(consulta.getData_hora_consulta());
            oldUser.setLocal_consulta(consulta.getLocal_consulta());
            consultaRepository.save(oldUser);
        } else {
            return new Consulta();
        }
        return oldUser;
    }

    /**
     * Deleta uma consulta pelo ID.
     *
     * @param id_consulta O ID da consulta a ser deletada.
     * @return Uma mensagem indicando que a consulta foi deletada.
     */
    public String deleteConsultaById(int id_consulta) {
        consultaRepository.deleteById(id_consulta);
        return "Consulta deletada!";
    }
}
