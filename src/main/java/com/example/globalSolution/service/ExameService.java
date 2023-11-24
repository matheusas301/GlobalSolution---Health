package com.example.globalSolution.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.globalSolution.dao.ExameRepository;
import com.example.globalSolution.entities.Exame;

/**
 * Serviço para manipulação de informações relacionadas a Exames.
 */
@Service
public class ExameService {

    @Autowired
    private ExameRepository exameRepository;

    /**
     * Cria um novo exame.
     *
     * @param exame O exame a ser criado.
     * @return O exame criado.
     */
    public Exame createExame(Exame exame) {
        return exameRepository.save(exame);
    }

    /**
     * Cria vários exames.
     *
     * @param exames A lista de exames a ser criada.
     * @return A lista de exames criada.
     */
    public List<Exame> createExames(List<Exame> exames) {
        return exameRepository.saveAll(exames);
    }

    /**
     * Obtém um exame pelo ID.
     *
     * @param id_exame O ID do exame a ser obtido.
     * @return O exame encontrado ou null se não existir.
     */
    public Exame getExameById(int id_exame) {
        return exameRepository.findById(id_exame).orElse(null);
    }

    /**
     * Obtém todos os exames.
     *
     * @return A lista de todos os exames.
     */
    public List<Exame> getExames() {
        return exameRepository.findAll();
    }

    /**
     * Atualiza as informações de um exame.
     *
     * @param exame As novas informações do exame.
     * @return O exame atualizado ou um novo exame se o ID não existir.
     */
    public Exame updateExame(Exame exame) {
        Exame oldUser = null;
        Optional<Exame> optionalUser = exameRepository.findById(exame.getId_exame());
        if (optionalUser.isPresent()) {
            oldUser = optionalUser.get();
            oldUser.setId_exame(exame.getId_exame());
            oldUser.setTipo_exame(exame.getTipo_exame());
            oldUser.setData_hora_exame(exame.getData_hora_exame());
            oldUser.setLocal_exame(exame.getLocal_exame());
            exameRepository.save(oldUser);
        } else {
            return new Exame();
        }
        return oldUser;
    }

    /**
     * Deleta um exame pelo ID.
     *
     * @param id_exame O ID do exame a ser deletado.
     * @return Uma mensagem indicando que o exame foi deletado.
     */
    public String deleteExameById(int id_exame) {
        exameRepository.deleteById(id_exame);
        return "Exame deletado!";
    }
}