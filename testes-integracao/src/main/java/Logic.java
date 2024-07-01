package main.java;

/**
 * Classe responsável pela lógica de negócios da aplicação.
 * Processa os dados fornecidos pela camada de dados (Data).
 */
public class Logic {
    
    private Data data;

    public Logic(Data data) {
        this.data = data;
    }

    /**
     * Explicação detalhada do método:
     * 
     * São necessários dois parâmetros integers chamados a e b e retorna um valor integer da mesma forma. 
     * O método simplesmente chama o método add do objeto data, passando os mesmos dois parâmetros, e retorna o resultado.
     */
    public int add(int a, int b) {
        int result = a + b;
        data.save(result);
        return result;
    }

    /**
     * Explicação detalhada do método:
     * 
     * São necessários dois parâmetros integers chamados a e b e retorna um valor integer da mesma forma. 
     * O método simplesmente chama o método subtract do objeto data, passando os mesmos dois parâmetros, e retorna o resultado.
     */
    public int subtract(int a, int b) {
        int result = a - b;
        data.save(result);
        return result;
    }

    /**
     * Explicação detalhada do método:
     * 
     * São necessários dois parâmetros integers chamados a e b e retorna um valor integer da mesma forma. 
     * O método simplesmente chama o método multiply do objeto data, passando os mesmos dois parâmetros, e retorna o resultado.
     */
    public int multiply(int a, int b) {
        int result = a * b;
        data.save(result);
        return result;
    }

    /**
     * Explicação detalhada do método:
     * 
     * São necessários dois parâmetros integers chamados a e b e retorna um valor integer da mesma forma. 
     * O método simplesmente chama o método divide do objeto data, passando os mesmos dois parâmetros, e retorna o resultado.
     * Retorna o quociente da divisão. Se b for zero, lança uma ArithmeticException. 
     * O resultado da divisão também é salvo em um objeto data.
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        int result = a / b;
        data.save(result);
        return result;
    }
}

