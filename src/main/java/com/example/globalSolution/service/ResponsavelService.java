package com.example.globalSolution.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.globalSolution.dao.ResponsavelRepository;
import com.example.globalSolution.entities.Responsavel;

/**
 * Serviço para manipulação de informações relacionadas a Responsáveis.
 */
@Service
public class ResponsavelService {

    @Autowired
    private ResponsavelRepository responsavelRepository;

    /**
     * Cria um novo Responsável.
     *
     * @param responsavel O Responsável a ser criado.
     * @return O Responsável criado.
     */
    public Responsavel createResponsavel(Responsavel responsavel) {
        return responsavelRepository.save(responsavel);
    }

    /**
     * Cria vários Responsáveis.
     *
     * @param responsaveis A lista de Responsáveis a ser criada.
     * @return A lista de Responsáveis criada.
     */
    public List<Responsavel> createResponsaveis(List<Responsavel> responsaveis) {
        return responsavelRepository.saveAll(responsaveis);
    }

    /**
     * Obtém um Responsável pelo ID.
     *
     * @param id_responsavel O ID do Responsável a ser obtido.
     * @return O Responsável encontrado ou null se não existir.
     */
    public Responsavel getResponsavelById(int id_responsavel) {
        return responsavelRepository.findById(id_responsavel).orElse(null);
    }

    /**
     * Obtém todos os Responsáveis.
     *
     * @return A lista de todos os Responsáveis.
     */
    public List<Responsavel> getResponsaveis() {
        return responsavelRepository.findAll();
    }

    /**
     * Atualiza as informações de um Responsável.
     *
     * @param responsavel As novas informações do Responsável.
     * @return O Responsável atualizado ou um novo Responsável se o ID não existir.
     */
    public Responsavel updateResponsavel(Responsavel responsavel) {
        Responsavel oldUser = null;
        Optional<Responsavel> optionalUser = responsavelRepository.findById(responsavel.getId_responsavel());
        if (optionalUser.isPresent()) {
            oldUser = optionalUser.get();
            oldUser.setId_responsavel(responsavel.getId_responsavel());
            oldUser.setCpf_responsavel(responsavel.getCpf_responsavel());
            oldUser.setNome_responsavel(responsavel.getNome_responsavel());
            oldUser.setBirthday_responsavel(responsavel.getBirthday_responsavel());
            oldUser.setTelefone_responsavel(responsavel.getTelefone_responsavel());
            oldUser.setCep_responsavel(responsavel.getCep_responsavel());
            oldUser.setRua_responsavel(responsavel.getRua_responsavel());
            oldUser.setBairro_responsavel(responsavel.getBairro_responsavel());
            oldUser.setCidade_responsavel(responsavel.getCidade_responsavel());
            responsavelRepository.save(oldUser);
        } else {
            return new Responsavel();
        }
        return oldUser;
    }

    /**
     * Deleta um Responsável pelo ID.
     *
     * @param id_responsavel O ID do Responsável a ser deletado.
     * @return Uma mensagem indicando que o Responsável foi deletado.
     */
    public String deleteResponsavelById(int id_responsavel) {
        responsavelRepository.deleteById(id_responsavel);
        return "Responsavel deletado!";
    }
}
