package com.example.globalSolution.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.globalSolution.dao.PacienteRepository;
import com.example.globalSolution.entities.Paciente;

/**
 * Serviço para manipulação de informações relacionadas a Pacientes.
 */
@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    /**
     * Cria um novo paciente.
     *
     * @param paciente O paciente a ser criado.
     * @return O paciente criado.
     */
    public Paciente createPaciente(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    /**
     * Cria vários pacientes.
     *
     * @param pacientes A lista de pacientes a ser criada.
     * @return A lista de pacientes criada.
     */
    public List<Paciente> createPacientes(List<Paciente> pacientes) {
        return pacienteRepository.saveAll(pacientes);
    }

    /**
     * Obtém um paciente pelo ID.
     *
     * @param id_paciente O ID do paciente a ser obtido.
     * @return O paciente encontrado ou null se não existir.
     */
    public Paciente getPacienteById(int id_paciente) {
        return pacienteRepository.findById(id_paciente).orElse(null);
    }
    
    /**
     * Verifica se o email existe, se existir ele retorna o Paciente.
     *
     * @param O Email do paciente a ser obtido.
     * @return O paciente encontrado ou false se não existir.
     */
    public Paciente getPacienteByEmail(String email_paciente) {
        return pacienteRepository.findByEmail(email_paciente);
    }
    
    /**
     * Verifica se o email existe, se existir ele retorna o Paciente.
     *
     * @param O Email do paciente a ser obtido.
     * @return O paciente encontrado ou false se não existir.
     */
    public Paciente getPacienteByCpf(String cpf_paciente) {
        Paciente paciente = pacienteRepository.findByCpf(cpf_paciente);
        return new Paciente(paciente.getEmail_paciente(), paciente.getSenha_paciente());
    }

    /**
     * Obtém todos os pacientes.
     *
     * @return A lista de todos os pacientes.
     */
    public List<Paciente> getPacientes() {
        return pacienteRepository.findAll();
    }

    /**
     * Atualiza as informações de um paciente.
     *
     * @param paciente As novas informações do paciente.
     * @return O paciente atualizado ou um novo paciente se o ID não existir.
     */
    public Paciente updatePaciente(Paciente paciente) {
        Paciente oldUser = null;
        Optional<Paciente> optionalUser = pacienteRepository.findById(paciente.getId_paciente());
        if (optionalUser.isPresent()) {
            oldUser = optionalUser.get();
            oldUser.setId_paciente(paciente.getId_paciente());
            oldUser.setCpf_paciente(paciente.getCpf_paciente());
            oldUser.setNome_paciente(paciente.getNome_paciente());
            oldUser.setBirthday_paciente(paciente.getBirthday_paciente());
            oldUser.setTelefone_paciente(paciente.getTelefone_paciente());
            oldUser.setUf_paciente(paciente.getUf_paciente());
            oldUser.setCep_paciente(paciente.getCep_paciente());
            oldUser.setRua_paciente(paciente.getRua_paciente());
            oldUser.setBairro_paciente(paciente.getBairro_paciente());
            oldUser.setCidade_paciente(paciente.getCidade_paciente());
            oldUser.setEmail_paciente(paciente.getEmail_paciente());
            oldUser.setSenha_paciente(paciente.getSenha_paciente());
            pacienteRepository.save(oldUser);
        } else {
            return new Paciente();
        }
        return oldUser;
    }

    /**
     * Deleta um paciente pelo ID.
     *
     * @param id_paciente O ID do paciente a ser deletado.
     * @return Uma mensagem indicando que o paciente foi deletado.
     */
    public String deletePacienteById(int id_paciente) {
        pacienteRepository.deleteById(id_paciente);
        return "Paciente deletado!";
    }
}
