package com.example.globalSolution.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.globalSolution.dao.VacinaRepository;
import com.example.globalSolution.entities.Vacina;

/**
 * Serviço para manipulação de informações relacionadas a Vacinas.
 */
@Service
public class VacinaService {

    @Autowired
    private VacinaRepository vacinaRepository;

    /**
     * Cria uma nova Vacina.
     *
     * @param vacina A Vacina a ser criada.
     * @return A Vacina criada.
     */
    public Vacina createVacina(Vacina vacina) {
        return vacinaRepository.save(vacina);
    }

    /**
     * Cria várias Vacinas.
     *
     * @param vacinas A lista de Vacinas a ser criada.
     * @return A lista de Vacinas criada.
     */
    public List<Vacina> createVacinas(List<Vacina> vacinas) {
        return vacinaRepository.saveAll(vacinas);
    }

    /**
     * Obtém uma Vacina pelo ID.
     *
     * @param id_vacina O ID da Vacina a ser obtida.
     * @return A Vacina encontrada ou null se não existir.
     */
    public Vacina getVacinaById(int id_vacina) {
        return vacinaRepository.findById(id_vacina).orElse(null);
    }

    /**
     * Obtém todas as Vacinas.
     *
     * @return A lista de todas as Vacinas.
     */
    public List<Vacina> getVacinas() {
        return vacinaRepository.findAll();
    }

    /**
     * Atualiza as informações de uma Vacina.
     *
     * @param vacina As novas informações da Vacina.
     * @return A Vacina atualizada ou uma nova Vacina se o ID não existir.
     */
    public Vacina updateVacina(Vacina vacina) {
        Vacina oldUser = null;
        Optional<Vacina> optionalUser = vacinaRepository.findById(vacina.getId_vacina());
        if (optionalUser.isPresent()) {
            oldUser = optionalUser.get();
            oldUser.setId_vacina(vacina.getId_vacina());
            oldUser.setTipo_vacina(vacina.getTipo_vacina());
            oldUser.setData_hora_vacina(vacina.getData_hora_vacina());
            oldUser.setLocal_vacina(vacina.getLocal_vacina());
            vacinaRepository.save(oldUser);
        } else {
            return new Vacina();
        }
        return oldUser;
    }

    /**
     * Deleta uma Vacina pelo ID.
     *
     * @param id_vacina O ID da Vacina a ser deletada.
     * @return Uma mensagem indicando que a Vacina foi deletada.
     */
    public String deleteVacinaById(int id_vacina) {
        vacinaRepository.deleteById(id_vacina);
        return "Vacina deletada!";
    }
}
