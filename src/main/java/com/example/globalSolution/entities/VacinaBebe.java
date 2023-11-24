package com.example.globalSolution.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 * Entidade que representa informações sobre uma vacina para bebê.
 * Esta classe é mapeada para a tabela "vacina_bebe" no banco de dados.
 */
@Entity(name = "TB_VACINA_BEBE")
public class VacinaBebe {
    
    /**
     * Identificador único da vacina para bebê.
     * @return O ID da vacina para bebê.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_vacina_bebe;

    /**
     * Tipo da vacina para bebê.
     * @return O tipo da vacina para bebê.
     */
    private String tipo_vacina_bebe;

    /**
     * Data e hora da administração da vacina para bebê.
     * @return A data e hora da vacinação para bebê.
     */
    private String data_hora_vacina_bebe;

    /**
     * Local onde a vacina para bebê foi administrada.
     * @return O local da vacinação para bebê.
     */
    private String local_vacina_bebe;
    
    /**
     * Contrutor padrão(vazio)
     */
    
    /**
     * Prestador Saude associado ao Vacina bebê.
     */
    @ManyToOne
    @JoinColumn(name = "id_prestador_saude") 
    private PrestadorSaude prestadorSaude;
    
    /**
     * Bebê associado ao Vacina bebê.
     */
    @ManyToOne
    @JoinColumn(name = "id_bebe") 
    private Bebe bebe;
    
    public VacinaBebe() {
		
	}
    
    /**
     * Obtém o ID da vacina para bebê.
     * @return O ID da vacina para bebê.
     */
    public int getId_vacina_bebe() {
        return id_vacina_bebe;
    }

    /**
     * Define o ID da vacina para bebê.
     * @param id_vacina_bebe O novo ID da vacina para bebê.
     */
    public void setId_vacina_bebe(int id_vacina_bebe) {
        this.id_vacina_bebe = id_vacina_bebe;
    }

    /**
     * Obtém o tipo da vacina para bebê.
     * @return O tipo da vacina para bebê.
     */
    public String getTipo_vacina_bebe() {
        return tipo_vacina_bebe;
    }

    /**
     * Define o tipo da vacina para bebê.
     * @param tipo_vacina_bebe O novo tipo da vacina para bebê.
     */
    public void setTipo_vacina_bebe(String tipo_vacina_bebe) {
        this.tipo_vacina_bebe = tipo_vacina_bebe;
    }

    /**
     * Obtém a data e hora da vacinação para bebê.
     * @return A data e hora da vacinação para bebê.
     */
    public String getData_hora_vacina_bebe() {
        return data_hora_vacina_bebe;
    }

    /**
     * Define a data e hora da vacinação para bebê.
     * @param data_hora_vacina_bebe A nova data e hora da vacinação para bebê.
     */
    public void setData_hora_vacina_bebe(String data_hora_vacina_bebe) {
        this.data_hora_vacina_bebe = data_hora_vacina_bebe;
    }

    /**
     * Obtém o local da vacinação para bebê.
     * @return O local da vacinação para bebê.
     */
    public String getLocal_vacina_bebe() {
        return local_vacina_bebe;
    }

    /**
     * Define o local da vacinação para bebê.
     * @param local_vacina_bebe O novo local da vacinação para bebê.
     */
    public void setLocal_vacina_bebe(String local_vacina_bebe) {
        this.local_vacina_bebe = local_vacina_bebe;
    }
}
