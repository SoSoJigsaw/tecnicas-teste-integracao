package main.java;

/**
 * Classe responsável pela interface da aplicação.
 * Interage com a lógica de negócios para exibir os dados processados.
 */
public class Interface {
    
    private Logic logic;

    public Interface(Logic logic) {
        this.logic = logic;
    }

    /**
     * Explicação detalhada do método:
     * 
     * São necessários dois parâmetros integers chamados a e b e retorna um integer. 
     * O método simplesmente chama o método add do objeto logic, passando os mesmos dois parâmetros, e retorna o resultado.
     */
    public int add(int a, int b) {
        return logic.add(a, b);
    }

    /**
     * Explicação detalhada do método:
     * 
     * São necessários dois parâmetros integers chamados a e b e retorna um integer. 
     * O método simplesmente chama o método subtract do objeto logic, passando os mesmos dois parâmetros, e retorna o resultado.
     */
    public int subtract(int a, int b) {
        return logic.subtract(a, b);
    }

    /**
     * Explicação detalhada do método:
     * 
     * São necessários dois parâmetros integers chamados a e b e retorna um integer. 
     * O método simplesmente chama o método de multiply do objeto logic, passando os mesmos dois parâmetros, e retorna o resultado.
     */
    public int multiply(int a, int b) {
        return logic.multiply(a, b);
    }

    /**
     * Explicação detalhada do método:
     * 
     * São necessários dois parâmetros integers chamados a e b e retorna um integer. 
     * O método simplesmente chama o método de divide do objeto logic, passando os mesmos dois parâmetros, e retorna o resultado.
     */
    public int divide(int a, int b) {
        return logic.divide(a, b);
    }
}


