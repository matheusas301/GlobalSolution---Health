package com.example.globalSolution.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 * Entidade que representa informações sobre um exame relacionado a um bebê.
 * Esta classe é mapeada para a tabela "exame_bebe" no banco de dados.
 */
@Entity(name = "TB_EXAME_BEBE")
public class ExameBebe {

	/**
     * Identificador único para o exame do bebê.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_exame_bebe;

    /**
     * Tipo do exame para o bebê.
     */
    private String tipo_exame_bebe;

    /**
     * Data e hora do exame para o bebê.
     */
    private String data_hora_exame_bebe;

    /**
     * Local do exame para o bebê.
     */
    private String local_exame_bebe;

    /**
     * Prestador de saúde associado ao exame do bebê.
     */
    @ManyToOne
    @JoinColumn(name = "id_prestador_saude")
    private PrestadorSaude prestadorSaude;

    /**
     * Bebê associado ao exame.
     */
    @ManyToOne
    @JoinColumn(name = "id_bebe")
    private Bebe bebe;
    
    /**
     * Contrutor padrão(vazio)
     */
    public ExameBebe() {
		
	}
    
    /**
     * Obtém o ID do exame relacionado ao bebê.
     *
     * @return O ID do exame relacionado ao bebê.
     */
    public int getId_exame_bebe() {
        return id_exame_bebe;
    }

    /**
     * Define o ID do exame relacionado ao bebê.
     *
     * @param id_exame_bebe O novo ID do exame relacionado ao bebê.
     */
    public void setId_exame_bebe(int id_exame_bebe) {
        this.id_exame_bebe = id_exame_bebe;
    }

    /**
     * Obtém o tipo do exame relacionado ao bebê.
     *
     * @return O tipo do exame relacionado ao bebê.
     */
    public String getTipo_exame_bebe() {
        return tipo_exame_bebe;
    }

    /**
     * Define o tipo do exame relacionado ao bebê.
     *
     * @param tipo_exame_bebe O novo tipo do exame relacionado ao bebê.
     */
    public void setTipo_exame_bebe(String tipo_exame_bebe) {
        this.tipo_exame_bebe = tipo_exame_bebe;
    }

    /**
     * Obtém a data e hora do exame relacionado ao bebê.
     *
     * @return A data e hora do exame relacionado ao bebê.
     */
    public String getData_hora_exame_bebe() {
        return data_hora_exame_bebe;
    }

    /**
     * Define a data e hora do exame relacionado ao bebê.
     *
     * @param data_hora_exame_bebe A nova data e hora do exame relacionado ao bebê.
     */
    public void setData_hora_exame_bebe(String data_hora_exame_bebe) {
        this.data_hora_exame_bebe = data_hora_exame_bebe;
    }

    /**
     * Obtém o local do exame relacionado ao bebê.
     *
     * @return O local do exame relacionado ao bebê.
     */
    public String getLocal_exame_bebe() {
        return local_exame_bebe;
    }

    /**
     * Define o local do exame relacionado ao bebê.
     *
     * @param local_exame_bebe O novo local do exame relacionado ao bebê.
     */
    public void setLocal_exame_bebe(String local_exame_bebe) {
        this.local_exame_bebe = local_exame_bebe;
    }
}
