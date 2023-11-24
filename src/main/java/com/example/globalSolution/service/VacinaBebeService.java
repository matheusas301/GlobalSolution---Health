package com.example.globalSolution.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.globalSolution.dao.VacinaBebeRepository;
import com.example.globalSolution.entities.VacinaBebe;

/**
 * Serviço para manipulação de informações relacionadas a Vacinas de Bebês.
 */
@Service
public class VacinaBebeService {

    @Autowired
    private VacinaBebeRepository vacinaBebeRepository;

    /**
     * Cria uma nova Vacina para Bebê.
     *
     * @param vacinaBebe A Vacina para Bebê a ser criada.
     * @return A Vacina para Bebê criada.
     */
    public VacinaBebe createVacinaBebe(VacinaBebe vacinaBebe) {
        return vacinaBebeRepository.save(vacinaBebe);
    }

    /**
     * Cria várias Vacinas para Bebês.
     *
     * @param vacinasBebe A lista de Vacinas para Bebês a ser criada.
     * @return A lista de Vacinas para Bebês criada.
     */
    public List<VacinaBebe> createVacinasBebe(List<VacinaBebe> vacinasBebe) {
        return vacinaBebeRepository.saveAll(vacinasBebe);
    }

    /**
     * Obtém uma Vacina para Bebê pelo ID.
     *
     * @param id_vacina_bebe O ID da Vacina para Bebê a ser obtida.
     * @return A Vacina para Bebê encontrada ou null se não existir.
     */
    public VacinaBebe getVacinaBebeById(int id_vacina_bebe) {
        return vacinaBebeRepository.findById(id_vacina_bebe).orElse(null);
    }

    /**
     * Obtém todas as Vacinas para Bebês.
     *
     * @return A lista de todas as Vacinas para Bebês.
     */
    public List<VacinaBebe> getVacinasBebe() {
        return vacinaBebeRepository.findAll();
    }

    /**
     * Atualiza as informações de uma Vacina para Bebê.
     *
     * @param vacinaBebe As novas informações da Vacina para Bebê.
     * @return A Vacina para Bebê atualizada ou uma nova Vacina para Bebê se o ID não existir.
     */
    public VacinaBebe updateVacinaBebe(VacinaBebe vacinaBebe) {
        VacinaBebe oldUser = null;
        Optional<VacinaBebe> optionalUser = vacinaBebeRepository.findById(vacinaBebe.getId_vacina_bebe());
        if (optionalUser.isPresent()) {
            oldUser = optionalUser.get();
            oldUser.setId_vacina_bebe(vacinaBebe.getId_vacina_bebe());
            oldUser.setTipo_vacina_bebe(vacinaBebe.getTipo_vacina_bebe());
            oldUser.setData_hora_vacina_bebe(vacinaBebe.getData_hora_vacina_bebe());
            oldUser.setLocal_vacina_bebe(vacinaBebe.getLocal_vacina_bebe());
            vacinaBebeRepository.save(oldUser);
        } else {
            return new VacinaBebe();
        }
        return oldUser;
    }

    /**
     * Deleta uma Vacina para Bebê pelo ID.
     *
     * @param id_vacina_bebe O ID da Vacina para Bebê a ser deletada.
     * @return Uma mensagem indicando que a Vacina para Bebê foi deletada.
     */
    public String deleteVacinaBebeById(int id_vacina_bebe) {
        vacinaBebeRepository.deleteById(id_vacina_bebe);
        return "Vacina do Bebê deletada!";
    }
}
