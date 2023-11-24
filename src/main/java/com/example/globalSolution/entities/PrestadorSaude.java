package com.example.globalSolution.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Entidade que representa informações sobre um prestador de saúde.
 * Esta classe é mapeada para a tabela "prestador_saude" no banco de dados.
 */
@Entity(name = "TB_PRESTADOR_SAUDE")
public class PrestadorSaude {
    /**
     * Identificador único do prestador de saúde.
     *
     * @return O ID do prestador de saúde.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_prestador;

    /**
     * Nome do prestador de saúde.
     *
     * @return O nome do prestador de saúde.
     */
    private String nome_prestador;

    /**
     * CPF do prestador de saúde.
     *
     * @return O CPF do prestador de saúde.
     */
    private String cpf_prestador;

    /**
     * CRM (Conselho Regional de Medicina) do prestador de saúde.
     *
     * @return O CRM do prestador de saúde.
     */
    private String crm_prestador;

    /**
     * Data de aniversário do prestador de saúde.
     *
     * @return A data de aniversário do prestador de saúde.
     */
    private String birthday_prestador;

    /**
     * Telefone do prestador de saúde.
     *
     * @return O telefone do prestador de saúde.
     */
    private String telefone_prestador;

    /**
     * CEP do endereço do prestador de saúde.
     *
     * @return O CEP do prestador de saúde.
     */
    private String cep_prestador;

    /**
     * Rua do endereço do prestador de saúde.
     *
     * @return A rua do prestador de saúde.
     */
    private String rua_prestador;

    /**
     * Bairro do endereço do prestador de saúde.
     *
     * @return O bairro do prestador de saúde.
     */
    private String bairro_prestador;

    /**
     * Cidade do endereço do prestador de saúde.
     *
     * @return A cidade do prestador de saúde.
     */
    private String cidade_prestador;

    /**
     * Obtém o ID do prestador de saúde.
     *
     * @return O ID do prestador de saúde.
     */
    
    /**
     * Contrutor padrão(vazio)
     */
    public PrestadorSaude() {
		
	}
    
    public int getId_prestador() {
        return id_prestador;
    }

    /**
     * Define o ID do prestador de saúde.
     *
     * @param id_prestador O novo ID do prestador de saúde.
     */
    public void setId_prestador(int id_prestador) {
        this.id_prestador = id_prestador;
    }

    /**
     * Obtém o nome do prestador de saúde.
     *
     * @return O nome do prestador de saúde.
     */
    public String getNome_prestador() {
        return nome_prestador;
    }

    /**
     * Define o nome do prestador de saúde.
     *
     * @param nome_prestador O novo nome do prestador de saúde.
     */
    public void setNome_prestador(String nome_prestador) {
        this.nome_prestador = nome_prestador;
    }

    /**
     * Obtém o CPF do prestador de saúde.
     *
     * @return O CPF do prestador de saúde.
     */
    public String getCpf_prestador() {
        return cpf_prestador;
    }

    /**
     * Define o CPF do prestador de saúde.
     *
     * @param cpf_prestador O novo CPF do prestador de saúde.
     */
    public void setCpf_prestador(String cpf_prestador) {
        this.cpf_prestador = cpf_prestador;
    }

    /**
     * Obtém o CRM do prestador de saúde.
     *
     * @return O CRM do prestador de saúde.
     */
    public String getCrm_prestador() {
        return crm_prestador;
    }

    /**
     * Define o CRM do prestador de saúde.
     *
     * @param crm_prestador O novo CRM do prestador de saúde.
     */
    public void setCrm_prestador(String crm_prestador) {
        this.crm_prestador = crm_prestador;
    }

    /**
     * Obtém a data de aniversário do prestador de saúde.
     *
     * @return A data de aniversário do prestador de saúde.
     */
    public String getBirthday_prestador() {
        return birthday_prestador;
    }

    /**
     * Define a data de aniversário do prestador de saúde.
     *
     * @param birthday_prestador A nova data de aniversário do prestador de saúde.
     */
    public void setBirthday_prestador(String birthday_prestador) {
        this.birthday_prestador = birthday_prestador;
    }

    /**
     * Obtém o telefone do prestador de saúde.
     *
     * @return O telefone do prestador de saúde.
     */
    public String getTelefone_prestador() {
        return telefone_prestador;
    }

    /**
     * Define o telefone do prestador de saúde.
     *
     * @param telefone_prestador O novo telefone do prestador de saúde.
     */
    public void setTelefone_prestador(String telefone_prestador) {
        this.telefone_prestador = telefone_prestador;
    }

    /**
     * Obtém o CEP do prestador de saúde.
     *
     * @return O CEP do prestador de saúde.
     */
	
	public String getCep_prestador() {
		return cep_prestador;
	}
	
	/**
     * Define o CEP do prestador de saúde.
     *
     * @param CEP_prestador O novo CEP do prestador de saúde.
     */
	public void setCep_prestador(String cep_prestador) {
		this.cep_prestador = cep_prestador;
	}
	
	/**
     * Obtém o Rua do prestador de saúde.
     *
     * @return O Rua do prestador de saúde.
     */
	public String getRua_prestador() {
		return rua_prestador;
	}
	
	/**
     * Define o Rua do prestador de saúde.
     *
     * @param Rua_prestador O novo telefone do prestador de saúde.
     */
	public void setRua_prestador(String rua_prestador) {
		this.rua_prestador = rua_prestador;
	}
	
	/**
     * Obtém o Bairro do prestador de saúde.
     *
     * @return O Bairro do prestador de saúde.
     */
	public String getBairro_prestador() {
		return bairro_prestador;
	}
	
	/**
     * Define o Bairro do prestador de saúde.
     *
     * @param Bairro_prestador O novo telefone do prestador de saúde.
     */
	public void setBairro_prestador(String bairro_prestador) {
		this.bairro_prestador = bairro_prestador;
	}
	
	/**
     * Obtém o Cidade do prestador de saúde.
     *
     * @return O Cidade do prestador de saúde.
     */
	public String getCidade_prestador() {
		return cidade_prestador;
	}
	
	/**
     * Define o Cidade do prestador de saúde.
     *
     * @param Cidade_prestador O novo Cidade do prestador de saúde.
     */
	public void setCidade_prestador(String cidade_prestador) {
		this.cidade_prestador = cidade_prestador;
	}
}
