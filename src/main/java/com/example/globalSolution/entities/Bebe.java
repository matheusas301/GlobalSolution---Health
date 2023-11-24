package com.example.globalSolution.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 * Entidade que representa informações sobre um bebê.
 * Esta classe é mapeada para a tabela "bebe" no banco de dados.
 */
@Entity(name = "TB_BEBE")
public class Bebe {

	/**
     * Identificador único para o bebê.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_bebe;

    /**
     * Nome do bebê.
     */
    private String nome_bebe;

    /**
     * Idade do bebê.
     */
    private String idade_bebe;

    /**
     * Peso do bebê.
     */
    private String peso_bebe;

    /**
     * Tipo sanguíneo do bebê.
     */
    private String tipo_sanguineo_bebe;

    /**
     * Responsável associado ao bebê.
     */
    @ManyToOne
    @JoinColumn(name = "id_responsavel")
    private Responsavel responsavel;
    
    /**
     * Contrutor padrão(vazio)
     */
    public Bebe() {
		
	}
    
    /**
     * Obtém o ID do bebê.
     *
     * @return O ID do bebê.
     */
    public int getId_bebe() {
        return id_bebe;
    }

    /**
     * Define o ID do bebê.
     *
     * @param id_bebe O novo ID do bebê.
     */
    public void setId_bebe(int id_bebe) {
        this.id_bebe = id_bebe;
    }

    /**
     * Obtém o nome do bebê.
     *
     * @return O nome do bebê.
     */
    public String getNome_bebe() {
        return nome_bebe;
    }

    /**
     * Define o nome do bebê.
     *
     * @param nome_bebe O novo nome do bebê.
     */
    public void setNome_bebe(String nome_bebe) {
        this.nome_bebe = nome_bebe;
    }

    /**
     * Obtém a idade do bebê.
     *
     * @return A idade do bebê.
     */
    public String getIdade_bebe() {
        return idade_bebe;
    }

    /**
     * Define a idade do bebê.
     *
     * @param idade_bebe A nova idade do bebê.
     */
    public void setIdade_bebe(String idade_bebe) {
        this.idade_bebe = idade_bebe;
    }

    /**
     * Obtém o peso do bebê.
     *
     * @return O peso do bebê.
     */
    public String getPeso_bebe() {
        return peso_bebe;
    }

    /**
     * Define o peso do bebê.
     *
     * @param peso_bebe O novo peso do bebê.
     */
    public void setPeso_bebe(String peso_bebe) {
        this.peso_bebe = peso_bebe;
    }

    /**
     * Obtém o tipo sanguíneo do bebê.
     *
     * @return O tipo sanguíneo do bebê.
     */
    public String getTipo_sanguineo_bebe() {
        return tipo_sanguineo_bebe;
    }

    /**
     * Define o tipo sanguíneo do bebê.
     *
     * @param tipo_sanguineo_bebe O novo tipo sanguíneo do bebê.
     */
    public void setTipo_sanguineo_bebe(String tipo_sanguineo_bebe) {
        this.tipo_sanguineo_bebe = tipo_sanguineo_bebe;
    }
}
