package com.example.globalSolution.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 * Entidade que representa informações sobre um exame.
 * Esta classe é mapeada para a tabela "exame" no banco de dados.
 */
@Entity(name = "TB_EXAME")
public class Exame {

	/**
     * Identificador único para o exame.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_exame;

    /**
     * Tipo do exame.
     */
    private String tipo_exame;

    /**
     * Data e hora do exame.
     */
    private String data_hora_exame;

    /**
     * Local do exame.
     */
    private String local_exame;

    /**
     * Paciente associado ao exame.
     */
    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;

    /**
     * Prestador de saúde associado ao exame.
     */
    @ManyToOne
    @JoinColumn(name = "id_prestador_saude")
    private PrestadorSaude prestadorSaude;

    /**
     * Contrutor padrão(vazio)
     */
    public Exame() {
		
	}
    
    /**
     * Obtém o ID do exame.
     *
     * @return O ID do exame.
     */
    public int getId_exame() {
        return id_exame;
    }

    /**
     * Define o ID do exame.
     *
     * @param id_exame O novo ID do exame.
     */
    public void setId_exame(int id_exame) {
        this.id_exame = id_exame;
    }

    /**
     * Obtém o tipo do exame.
     *
     * @return O tipo do exame.
     */
    public String getTipo_exame() {
        return tipo_exame;
    }

    /**
     * Define o tipo do exame.
     *
     * @param tipo_exame O novo tipo do exame.
     */
    public void setTipo_exame(String tipo_exame) {
        this.tipo_exame = tipo_exame;
    }

    /**
     * Obtém a data e hora do exame.
     *
     * @return A data e hora do exame.
     */
    public String getData_hora_exame() {
        return data_hora_exame;
    }

    /**
     * Define a data e hora do exame.
     *
     * @param data_hora_exame A nova data e hora do exame.
     */
    public void setData_hora_exame(String data_hora_exame) {
        this.data_hora_exame = data_hora_exame;
    }

    /**
     * Obtém o local do exame.
     *
     * @return O local do exame.
     */
    public String getLocal_exame() {
        return local_exame;
    }

    /**
     * Define o local do exame.
     *
     * @param local_exame O novo local do exame.
     */
    public void setLocal_exame(String local_exame) {
        this.local_exame = local_exame;
    }
}
