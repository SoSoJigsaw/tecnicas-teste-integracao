package main.java;

import java.util.ArrayList;
import java.util.List;


/**
 * Classe responsável por gerenciar os dados da aplicação.
 * Fornece métodos para acessar e modificar os dados.
 */
public class Data {

    private List<Integer> results = new ArrayList<>();

    /**
     * Adiciona o resultado fornecido à lista de resultados.
     *
     * @param result o resultado a ser adicionado
     * 
     * Explicação detalhada do método:
     *  
     * Pega um parâmetro integer chamado result e o adiciona a uma lista 'results'. 
     * A lista 'results' é um atributo privado na classe. 
     */
    public void save(int result) {
        results.add(result);
    }

    /**
     * @return Retorna uma lista de integers que representam os resultados salvos neste objeto Data.
     * 
     * Explicação detalhada do método:
     *  
     * A lista de integers é armazenada em um atributo privado denominado 'results' na classe Data.
     */
    public List<Integer> getResults() {
        return results;
    }
}

