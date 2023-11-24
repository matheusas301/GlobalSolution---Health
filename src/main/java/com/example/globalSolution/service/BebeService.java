package com.example.globalSolution.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.globalSolution.dao.BebeRepository;
import com.example.globalSolution.entities.Bebe;

/**
 * Serviço para manipulação de informações relacionadas a Bebês.
 */
@Service
public class BebeService {

    @Autowired
    private BebeRepository bebeRepository;

    /**
     * Cria um novo bebê.
     *
     * @param bebe O bebê a ser criado.
     * @return O bebê criado.
     */
    public Bebe createBebe(Bebe bebe) {
        return bebeRepository.save(bebe);
    }

    /**
     * Cria vários bebês.
     *
     * @param bebes A lista de bebês a ser criada.
     * @return A lista de bebês criada.
     */
    public List<Bebe> createBebes(List<Bebe> bebes) {
        return bebeRepository.saveAll(bebes);
    }

    /**
     * Obtém um bebê pelo ID.
     *
     * @param id_bebe O ID do bebê a ser obtido.
     * @return O bebê encontrado ou null se não existir.
     */
    public Bebe getBebeById(int id_bebe) {
        return bebeRepository.findById(id_bebe).orElse(null);
    }

    /**
     * Obtém todos os bebês.
     *
     * @return A lista de todos os bebês.
     */
    public List<Bebe> getBebes() {
        return bebeRepository.findAll();
    }

    /**
     * Atualiza as informações de um bebê.
     *
     * @param bebe As novas informações do bebê.
     * @return O bebê atualizado ou um novo bebê se o ID não existir.
     */
    public Bebe updateBebe(Bebe bebe) {
        Bebe oldUser = null;
        Optional<Bebe> optionalUser = bebeRepository.findById(bebe.getId_bebe());
        if (optionalUser.isPresent()) {
            oldUser = optionalUser.get();
            oldUser.setId_bebe(bebe.getId_bebe());
            oldUser.setNome_bebe(bebe.getNome_bebe());
            oldUser.setIdade_bebe(bebe.getIdade_bebe());
            oldUser.setPeso_bebe(bebe.getPeso_bebe());
            oldUser.setTipo_sanguineo_bebe(bebe.getTipo_sanguineo_bebe());
            bebeRepository.save(oldUser);
        } else {
            return new Bebe();
        }
        return oldUser;
    }

    /**
     * Deleta um bebê pelo ID.
     *
     * @param id_bebe O ID do bebê a ser deletado.
     * @return Uma mensagem indicando que o bebê foi deletado.
     */
    public String deleteBebeById(int id_bebe) {
        bebeRepository.deleteById(id_bebe);
        return "Bebe deletado!";
    }
}
