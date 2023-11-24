package com.example.globalSolution.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Entidade que representa informações sobre uma consulta de um bebê.
 * Esta classe é mapeada para a tabela "consulta_bebe" no banco de dados.
 */
@Entity(name = "TB_CONSULTA_BEBE")
public class ConsultaBebe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_consulta_bebe;
    private String tipo_consulta_bebe;
    private String data_hora_consulta_bebe;
    private String local_consulta_bebe;

    /**
     * Contrutor padrão(vazio)
     */
    public ConsultaBebe() {
		
	}
    
    /**
     * Obtém o ID da consulta do bebê.
     *
     * @return O ID da consulta do bebê.
     */
    public int getId_consulta_bebe() {
        return id_consulta_bebe;
    }

    /**
     * Define o ID da consulta do bebê.
     *
     * @param id_consulta_bebe O novo ID da consulta do bebê.
     */
    public void setId_consulta_bebe(int id_consulta_bebe) {
        this.id_consulta_bebe = id_consulta_bebe;
    }

    /**
     * Obtém o tipo de consulta do bebê.
     *
     * @return O tipo de consulta do bebê.
     */
    public String getTipo_consulta_bebe() {
        return tipo_consulta_bebe;
    }

    /**
     * Define o tipo de consulta do bebê.
     *
     * @param tipo_consulta_bebe O novo tipo de consulta do bebê.
     */
    public void setTipo_consulta_bebe(String tipo_consulta_bebe) {
        this.tipo_consulta_bebe = tipo_consulta_bebe;
    }

    /**
     * Obtém a data e hora da consulta do bebê.
     *
     * @return A data e hora da consulta do bebê.
     */
    public String getData_hora_consulta_bebe() {
        return data_hora_consulta_bebe;
    }

    /**
     * Define a data e hora da consulta do bebê.
     *
     * @param data_hora_consulta_bebe A nova data e hora da consulta do bebê.
     */
    public void setData_hora_consulta_bebe(String data_hora_consulta_bebe) {
        this.data_hora_consulta_bebe = data_hora_consulta_bebe;
    }

    /**
     * Obtém o local da consulta do bebê.
     *
     * @return O local da consulta do bebê.
     */
    public String getLocal_consulta_bebe() {
        return local_consulta_bebe;
    }

    /**
     * Define o local da consulta do bebê.
     *
     * @param local_consulta_bebe O novo local da consulta do bebê.
     */
    public void setLocal_consulta_bebe(String local_consulta_bebe) {
        this.local_consulta_bebe = local_consulta_bebe;
    }
}
