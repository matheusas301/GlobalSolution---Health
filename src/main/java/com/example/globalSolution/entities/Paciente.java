package com.example.globalSolution.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Entidade que representa informações sobre um paciente.
 * Esta classe é mapeada para a tabela "paciente" no banco de dados.
 */
@Entity(name = "TB_PACIENTE")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_paciente;
    private String cpf_paciente;
    private String nome_paciente;
    private String birthday_paciente;
    private String telefone_paciente;
    private String uf_paciente;
    private String cep_paciente;
    private String rua_paciente;
    private String bairro_paciente;
    private String cidade_paciente;
    private String email_paciente;
    private String senha_paciente;
    private String tipo_sanguineo_paciente;   

	public Paciente(String email_paciente, String senha_paciente) {
		this.email_paciente = email_paciente;
		this.senha_paciente = senha_paciente;
	}

	public Paciente() {
		
	}

	/**
     * Obtém o ID do paciente.
     *
     * @return O ID do paciente.
     */
    public int getId_paciente() {
        return id_paciente;
    }

    /**
     * Define o ID do paciente.
     *
     * @param id_paciente O novo ID do paciente.
     */
    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    /**
     * Obtém o CPF do paciente.
     *
     * @return O CPF do paciente.
     */
    public String getCpf_paciente() {
        return cpf_paciente;
    }

    /**
     * Define o CPF do paciente.
     *
     * @param cpf_paciente O novo CPF do paciente.
     */
    public void setCpf_paciente(String cpf_paciente) {
        this.cpf_paciente = cpf_paciente;
    }

    /**
     * Obtém o nome do paciente.
     *
     * @return O nome do paciente.
     */
    public String getNome_paciente() {
        return nome_paciente;
    }

    /**
     * Define o nome do paciente.
     *
     * @param nome_paciente O novo nome do paciente.
     */
    public void setNome_paciente(String nome_paciente) {
        this.nome_paciente = nome_paciente;
    }

    /**
     * Obtém a data de aniversário do paciente.
     *
     * @return A data de aniversário do paciente.
     */
    public String getBirthday_paciente() {
        return birthday_paciente;
    }

    /**
     * Define a data de aniversário do paciente.
     *
     * @param birthday_paciente A nova data de aniversário do paciente.
     */
    public void setBirthday_paciente(String birthday_paciente) {
        this.birthday_paciente = birthday_paciente;
    }

    /**
     * Obtém o telefone do paciente.
     *
     * @return O telefone do paciente.
     */
    public String getTelefone_paciente() {
        return telefone_paciente;
    }

    /**
     * Define o telefone do paciente.
     *
     * @param telefone_paciente O novo telefone do paciente.
     */
    public void setTelefone_paciente(String telefone_paciente) {
        this.telefone_paciente = telefone_paciente;
    }

    /**
     * Obtém a UF (Unidade Federativa) do paciente.
     *
     * @return A UF do paciente.
     */
    public String getUf_paciente() {
        return uf_paciente;
    }

    /**
     * Define a UF do paciente.
     *
     * @param uf_paciente A nova UF do paciente.
     */
    public void setUf_paciente(String uf_paciente) {
        this.uf_paciente = uf_paciente;
    }

    /**
     * Obtém o CEP do paciente.
     *
     * @return O CEP do paciente.
     */
    public String getCep_paciente() {
        return cep_paciente;
    }

    /**
     * Define o CEP do paciente.
     *
     * @param cep_paciente O novo CEP do paciente.
     */
    public void setCep_paciente(String cep_paciente) {
        this.cep_paciente = cep_paciente;
    }

    /**
     * Obtém a rua do paciente.
     *
     * @return A rua do paciente.
     */
    public String getRua_paciente() {
        return rua_paciente;
    }

    /**
     * Define a rua do paciente.
     *
     * @param rua_paciente A nova rua do paciente.
     */
    public void setRua_paciente(String rua_paciente) {
        this.rua_paciente = rua_paciente;
    }

    /**
     * Obtém o bairro do paciente.
     *
     * @return O bairro do paciente.
     */
    public String getBairro_paciente() {
        return bairro_paciente;
    }

    /**
     * Define o bairro do paciente.
     *
     * @param bairro_paciente O novo bairro do paciente.
     */
    public void setBairro_paciente(String bairro_paciente) {
        this.bairro_paciente = bairro_paciente;
    }

    /**
     * Obtém a cidade do paciente.
     *
     * @return A cidade do paciente.
     */
    public String getCidade_paciente() {
        return cidade_paciente;
    }

    /**
     * Define a cidade do paciente.
     *
     * @param cidade_paciente A nova cidade do paciente.
     */
    public void setCidade_paciente(String cidade_paciente) {
        this.cidade_paciente = cidade_paciente;
    }

    /**
     * Obtém o email do paciente.
     *
     * @return O email do paciente.
     */
    public String getEmail_paciente() {
        return email_paciente;
    }

    /**
     * Define o email do paciente.
     *
     * @param email_paciente O novo email do paciente.
     */
    public void setEmail_paciente(String email_paciente) {
        this.email_paciente = email_paciente;
    }

    /**
     * Obtém a senha do paciente.
     *
     * @return A senha do paciente.
     */
    public String getSenha_paciente() {
        return senha_paciente;
    }

    /**
     * Define a senha do paciente.
     *
     * @param senha_paciente A nova senha do paciente.
     */
    public void setSenha_paciente(String senha_paciente) {
        this.senha_paciente = senha_paciente;
    }
    
    /**
     * Obtém a senha do paciente.
     *
     * @return A senha do paciente.
     */
	public String getTipo_sanguineo_paciente() {
		return tipo_sanguineo_paciente;
	}
	
	/**
     * Define o tipo sanguineo do paciente.
     *
     * @param tipo_sanguineo_paciente o novo tipo sanguineo do paciente.
     */
	public void setTipo_sanguineo_paciente(String tipo_sanguineo_paciente) {
		this.tipo_sanguineo_paciente = tipo_sanguineo_paciente;
	}
    
    
}