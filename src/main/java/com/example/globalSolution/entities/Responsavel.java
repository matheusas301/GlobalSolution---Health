package com.example.globalSolution.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Entidade que representa informações sobre um responsável.
 * Esta classe é mapeada para a tabela "responsavel" no banco de dados.
 */
@Entity(name = "TB_RESPONSAVEL")
public class Responsavel {

	
	
    /**
     * Identificador único do responsável.
     * @return O ID do responsável.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_responsavel;

    /**
     * CPF do responsável.
     * @return O CPF do responsável.
     */
    private String cpf_responsavel;

    /**
     * Nome do responsável.
     * @return O nome do responsável.
     */
    private String nome_responsavel;

    /**
     * Data de aniversário do responsável.
     * @return A data de aniversário do responsável.
     */
    private String birthday_responsavel;

    /**
     * Telefone do responsável.
     * @return O telefone do responsável.
     */
    private String telefone_responsavel;

    /**
     * CEP do responsável.
     * @return O CEP do responsável.
     */
    private String cep_responsavel;

    /**
     * Rua do responsável.
     * @return A rua do responsável.
     */
    private String rua_responsavel;

    /**
     * Bairro do responsável.
     * @return O bairro do responsável.
     */
    private String bairro_responsavel;

    /**
     * Cidade do responsável.
     * @return A cidade do responsável.
     */
    private String cidade_responsavel;

    /**
     * Obtém o ID do responsável.
     * @return O ID do responsável.
     */
    public int getId_responsavel() {
        return id_responsavel;
    }

    /**
     * Contrutor padrão(vazio)
     */
    public Responsavel() {
		
	}
    
    /**
     * Define o ID do responsável.
     * @param id_responsavel O novo ID do responsável.
     */
    public void setId_responsavel(int id_responsavel) {
        this.id_responsavel = id_responsavel;
    }

    /**
     * Obtém o CPF do responsável.
     * @return O CPF do responsável.
     */
    public String getCpf_responsavel() {
        return cpf_responsavel;
    }

    /**
     * Define o CPF do responsável.
     * @param cpf_responsavel O novo CPF do responsável.
     */
    public void setCpf_responsavel(String cpf_responsavel) {
        this.cpf_responsavel = cpf_responsavel;
    }

    /**
     * Obtém o nome do responsável.
     * @return O nome do responsável.
     */
    public String getNome_responsavel() {
        return nome_responsavel;
    }

    /**
     * Define o nome do responsável.
     * @param nome_responsavel O novo nome do responsável.
     */
    public void setNome_responsavel(String nome_responsavel) {
        this.nome_responsavel = nome_responsavel;
    }

    /**
     * Obtém a data de aniversário do responsável.
     * @return A data de aniversário do responsável.
     */
    public String getBirthday_responsavel() {
        return birthday_responsavel;
    }

    /**
     * Define a data de aniversário do responsável.
     * @param birthday_responsavel A nova data de aniversário do responsável.
     */
    public void setBirthday_responsavel(String birthday_responsavel) {
        this.birthday_responsavel = birthday_responsavel;
    }

    /**
     * Obtém o telefone do responsável.
     * @return O telefone do responsável.
     */
    public String getTelefone_responsavel() {
        return telefone_responsavel;
    }

    /**
     * Define o telefone do responsável.
     * @param telefone_responsavel O novo telefone do responsável.
     */
    public void setTelefone_responsavel(String telefone_responsavel) {
        this.telefone_responsavel = telefone_responsavel;
    }

    /**
     * Obtém o CEP do responsável.
     * @return O CEP do responsável.
     */
    public String getCep_responsavel() {
        return cep_responsavel;
    }

    /**
     * Define o CEP do responsável.
     * @param cep_responsavel O novo CEP do responsável.
     */
    public void setCep_responsavel(String cep_responsavel) {
        this.cep_responsavel = cep_responsavel;
    }

    /**
     * Obtém a rua do responsável.
     * @return A rua do responsável.
     */
    public String getRua_responsavel() {
        return rua_responsavel;
    }

    /**
     * Define a rua do responsável.
     * @param rua_responsavel A nova rua do responsável.
     */
    public void setRua_responsavel(String rua_responsavel) {
        this.rua_responsavel = rua_responsavel;
    }

    /**
     * Obtém o bairro do responsável.
     * @return O bairro do responsável
	 */
    
	public String getBairro_responsavel() {
		return bairro_responsavel;
	}
	
	/**
     * Define a bairoo do responsável.
     * @param bairro_responsavel A nova bairro do responsável.
     */
	public void setBairro_responsavel(String bairro_responsavel) {
		this.bairro_responsavel = bairro_responsavel;
	}
	
	/**
     * Obtém a cidade do responsável.
     * @return A cidade do responsável.
     */
	public String getCidade_responsavel() {
		return cidade_responsavel;
	}
	
	/**
     * Define a cidade do responsável.
     * @param cidade_responsavel A nova cidade do responsável.
     */
	public void setCidade_responsavel(String cidade_responsavel) {
		this.cidade_responsavel = cidade_responsavel;
	}
}
