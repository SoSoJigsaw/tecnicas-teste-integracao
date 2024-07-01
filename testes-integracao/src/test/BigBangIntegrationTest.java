package main.test;

import main.java.Data;
import main.java.Interface;
import main.java.Logic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Classe de teste de integração do tipo Big Bang.
 * Este teste verifica a integração completa entre todas as camadas da aplicação (Interface, Logic e Data)
 * ao mesmo tempo, garantindo que o sistema funcione corretamente como um todo.
 * Verifica a interação de ponta a ponta, desde a interface até a camada de dados.
 */
public class BigBangIntegrationTest {

    /**
     * Caso de teste para o método 'add' na classe 'Interface'.
     * 
     * Este caso de teste verifica se o método 'add' adiciona corretamente dois números e
     * salva o resultado no objeto 'Data'. Ele verifica se o resultado é igual a
     * o valor esperado, se o tamanho da lista 'results' no objeto 'Data' é 1,
     * e se o primeiro elemento da lista 'results' é igual ao valor esperado.
     *
     */
    @Test
    public void testAdd() {
        Data data = new Data();
        Logic logic = new Logic(data);
        Interface ui = new Interface(logic);

        int result = ui.add(2, 3);

        assertEquals(5, result);
        assertEquals(1, data.getResults().size());
        assertEquals(5, data.getResults().get(0));
    }

    /**
     * Caso de teste para o método 'subtract' na classe 'Interface'.
     * 
     * Este caso de teste verifica se o método 'subtract' subtrai corretamente dois números e
     * salva o resultado no objeto 'Data'. Ele verifica se o resultado é igual a
     * o valor esperado, se o tamanho da lista 'results' no objeto 'Data' é 1,
     * e se o primeiro elemento da lista 'results' é igual ao valor esperado.
     *
     */
    @Test
    public void testSubtract() {
        Data data = new Data();
        Logic logic = new Logic(data);
        Interface ui = new Interface(logic);

        int result = ui.subtract(5, 3);

        assertEquals(2, result);
        assertEquals(1, data.getResults().size());
        assertEquals(2, data.getResults().get(0));
    }

    /**
     * Caso de teste para o método 'multiply' na classe 'Interface'.
     * 
     * Este caso de teste verifica se o método 'multiply' multiplica corretamente dois números e
     * salva o resultado no objeto 'Data'. Ele verifica se o resultado é igual a
     * o valor esperado, se o tamanho da lista 'results' no objeto 'Data' é 1,
     * e se o primeiro elemento da lista 'results' é igual ao valor esperado.
     *
     */
    @Test
    public void testMultiply() {
        Data data = new Data();
        Logic logic = new Logic(data);
        Interface ui = new Interface(logic);

        int result = ui.multiply(3, 4);

        assertEquals(12, result);
        assertEquals(1, data.getResults().size());
        assertEquals(12, data.getResults().get(0));
    }

    /**
     * Caso de teste para o método 'divide' na classe 'Interface'.
     * 
     * Este caso de teste verifica se o método 'divide' divide corretamente dois números e
     * salva o resultado no objeto 'Data'. Ele verifica se o resultado é igual a
     * o valor esperado, se o tamanho da lista 'results' no objeto 'Data' é 1,
     * e se o primeiro elemento da lista 'results' é igual ao valor esperado.
     *
     */
    @Test
    public void testDivide() {
        Data data = new Data();
        Logic logic = new Logic(data);
        Interface ui = new Interface(logic);

        int result = ui.divide(12, 3);

        assertEquals(4, result);
        assertEquals(1, data.getResults().size());
        assertEquals(4, data.getResults().get(0));
    }


    /**
     * Caso de teste para o método 'divide' na classe 'Interface' ao dividir por zero.
     *
     * Este caso de teste verifica se o método 'divide' trata corretamente a divisão por zero
     * verificando se o resultado é zero, se o tamanho da lista 'results' no objeto 'Data' é 1,
     * e se o primeiro elemento da lista 'results' é zero.
     *
     */
    @Test
    public void testDivideByZero() {
        Data data = new Data();
        Logic logic = new Logic(data);
        Interface ui = new Interface(logic);

        int result = ui.divide(12, 0);

        assertEquals(0, result);
        assertEquals(1, data.getResults().size());
        assertEquals(0, data.getResults().get(0));
    }
}