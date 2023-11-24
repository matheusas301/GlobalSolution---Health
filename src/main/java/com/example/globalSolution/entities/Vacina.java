package com.example.globalSolution.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 * Entidade que representa informações sobre uma vacina.
 * Esta classe é mapeada para a tabela "vacina" no banco de dados.
 */
@Entity(name = "TB_VACINA")
public class Vacina {
    /**
     * Identificador único da vacina.
     * @return O ID da vacina.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_vacina;

    /**
     * Tipo da vacina.
     * @return O tipo da vacina.
     */
    private String tipo_vacina;

    /**
     * Data e hora da administração da vacina.
     * @return A data e hora da vacinação.
     */
    private String data_hora_vacina;

    /**
     * Local onde a vacina foi administrada.
     * @return O local da vacinação.
     */
    private String local_vacina;
    
    /**
     * Contrutor padrão(vazio)
     */
    
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
    public Vacina() {
		
	}
    
    /**
     * Obtém o ID da vacina.
     * @return O ID da vacina.
     */
    public int getId_vacina() {
        return id_vacina;
    }

    /**
     * Define o ID da vacina.
     * @param id_vacina O novo ID da vacina.
     */
    public void setId_vacina(int id_vacina) {
        this.id_vacina = id_vacina;
    }

    /**
     * Obtém o tipo da vacina.
     * @return O tipo da vacina.
     */
    public String getTipo_vacina() {
        return tipo_vacina;
    }

    /**
     * Define o tipo da vacina.
     * @param tipo_vacina O novo tipo da vacina.
     */
    public void setTipo_vacina(String tipo_vacina) {
        this.tipo_vacina = tipo_vacina;
    }

    /**
     * Obtém a data e hora da vacinação.
     * @return A data e hora da vacinação.
     */
    public String getData_hora_vacina() {
        return data_hora_vacina;
    }

    /**
     * Define a data e hora da vacinação.
     * @param data_hora_vacina A nova data e hora da vacinação.
     */
    public void setData_hora_vacina(String data_hora_vacina) {
        this.data_hora_vacina = data_hora_vacina;
    }

    /**
     * Obtém o local da vacinação.
     * @return O local da vacinação.
     */
    public String getLocal_vacina() {
        return local_vacina;
    }

    /**
     * Define o local da vacinação.
     * @param local_vacina O novo local da vacinação.
     */
    public void setLocal_vacina(String local_vacina) {
        this.local_vacina = local_vacina;
    }
}
