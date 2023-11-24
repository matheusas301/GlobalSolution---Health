package com.example.globalSolution.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Entidade que representa informações sobre uma consulta.
 * Esta classe é mapeada para a tabela "consulta" no banco de dados.
 */
@Entity(name = "TB_CONSULTA")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_consulta;
    private String tipo_consulta;
    private String data_hora_consulta;
    private String local_consulta;

    /**
     * Contrutor padrão(vazio)
     */
    public Consulta() {
		
	}
    
    /**
     * Obtém o ID da consulta.
     *
     * @return O ID da consulta.
     */
    public int getId_consulta() {
        return id_consulta;
    }

    /**
     * Define o ID da consulta.
     *
     * @param id_consulta O novo ID da consulta.
     */
    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }

    /**
     * Obtém o tipo de consulta.
     *
     * @return O tipo de consulta.
     */
    public String getTipo_consulta() {
        return tipo_consulta;
    }

    /**
     * Define o tipo de consulta.
     *
     * @param tipo_consulta O novo tipo de consulta.
     */
    public void setTipo_consulta(String tipo_consulta) {
        this.tipo_consulta = tipo_consulta;
    }

    /**
     * Obtém a data e hora da consulta.
     *
     * @return A data e hora da consulta.
     */
    public String getData_hora_consulta() {
        return data_hora_consulta;
    }

    /**
     * Define a data e hora da consulta.
     *
     * @param data_hora_consulta A nova data e hora da consulta.
     */
    public void setData_hora_consulta(String data_hora_consulta) {
        this.data_hora_consulta = data_hora_consulta;
    }

    /**
     * Obtém o local da consulta.
     *
     * @return O local da consulta.
     */
    public String getLocal_consulta() {
        return local_consulta;
    }

    /**
     * Define o local da consulta.
     *
     * @param local_consulta O novo local da consulta.
     */
    public void setLocal_consulta(String local_consulta) {
        this.local_consulta = local_consulta;
    }
}
