package com.example.globalSolution.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.globalSolution.dao.PrestadorSaudeRepository;
import com.example.globalSolution.entities.PrestadorSaude;

/**
 * Serviço para manipulação de informações relacionadas a Prestadores de Saúde.
 */
@Service
public class PrestadorSaudeService {

    @Autowired
    private PrestadorSaudeRepository prestadorSaudeRepository;

    /**
     * Cria um novo Prestador de Saúde.
     *
     * @param prestadorSaude O Prestador de Saúde a ser criado.
     * @return O Prestador de Saúde criado.
     */
    public PrestadorSaude createPrestadorSaude(PrestadorSaude prestadorSaude) {
        return prestadorSaudeRepository.save(prestadorSaude);
    }

    /**
     * Cria vários Prestadores de Saúde.
     *
     * @param prestadoresSaude A lista de Prestadores de Saúde a ser criada.
     * @return A lista de Prestadores de Saúde criada.
     */
    public List<PrestadorSaude> createPrestadoresSaude(List<PrestadorSaude> prestadoresSaude) {
        return prestadorSaudeRepository.saveAll(prestadoresSaude);
    }

    /**
     * Obtém um Prestador de Saúde pelo ID.
     *
     * @param id_prestador O ID do Prestador de Saúde a ser obtido.
     * @return O Prestador de Saúde encontrado ou null se não existir.
     */
    public PrestadorSaude getPrestadorSaudeById(int id_prestador) {
        return prestadorSaudeRepository.findById(id_prestador).orElse(null);
    }

    /**
     * Obtém todos os Prestadores de Saúde.
     *
     * @return A lista de todos os Prestadores de Saúde.
     */
    public List<PrestadorSaude> getPrestadoresSaude() {
        return prestadorSaudeRepository.findAll();
    }

    /**
     * Atualiza as informações de um Prestador de Saúde.
     *
     * @param prestadorSaude As novas informações do Prestador de Saúde.
     * @return O Prestador de Saúde atualizado ou um novo Prestador de Saúde se o ID não existir.
     */
    public PrestadorSaude updatePrestadorSaude(PrestadorSaude prestadorSaude) {
        PrestadorSaude oldUser = null;
        Optional<PrestadorSaude> optionalUser = prestadorSaudeRepository.findById(prestadorSaude.getId_prestador());
        if (optionalUser.isPresent()) {
            oldUser = optionalUser.get();
            oldUser.setId_prestador(prestadorSaude.getId_prestador());
            oldUser.setNome_prestador(prestadorSaude.getNome_prestador());
            oldUser.setCpf_prestador(prestadorSaude.getCpf_prestador());
            oldUser.setCrm_prestador(prestadorSaude.getCrm_prestador());
            oldUser.setBirthday_prestador(prestadorSaude.getBirthday_prestador());
            oldUser.setTelefone_prestador(prestadorSaude.getTelefone_prestador());
            oldUser.setCep_prestador(prestadorSaude.getCep_prestador());
            oldUser.setRua_prestador(prestadorSaude.getRua_prestador());
            oldUser.setBairro_prestador(prestadorSaude.getBairro_prestador());
            oldUser.setCidade_prestador(prestadorSaude.getCidade_prestador());
            prestadorSaudeRepository.save(oldUser);
        } else {
            return new PrestadorSaude();
        }
        return oldUser;
    }

    /**
     * Deleta um Prestador de Saúde pelo ID.
     *
     * @param id_prestador O ID do Prestador de Saúde a ser deletado.
     * @return Uma mensagem indicando que o Prestador de Saúde foi deletado.
     */
    public String deletePrestadorSaudeById(int id_prestador) {
        prestadorSaudeRepository.deleteById(id_prestador);
        return "Prestador da Saude deletado!";
    }
}
