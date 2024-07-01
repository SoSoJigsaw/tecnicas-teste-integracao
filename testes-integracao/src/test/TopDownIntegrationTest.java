package main.test;

import main.java.Data;
import main.java.Interface;
import main.java.Logic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Classe de teste de integração do tipo Top-Down.
 * Este teste verifica a integração entre as camadas de interface (Interface), lógica (Logic) e dados (Data)
 * da aplicação utilizando a abordagem Top-Down.
 */
public class TopDownIntegrationTest {

    /**
     * Testa a integração "de cima para baixo" das três classes: Data, Logic e Interface.
     * Este teste executa uma operação que envolve todas as três classes e afirma o resultado.
     *
     * @throws AssertionError se o resultado ou o primeiro elemento na lista 'results' do objeto 'Data' não for igual a 5.
     * 
     * Explicando o objetivo deste teste:
     * 
     * Este método testa a integração "de cima para baixo" de três classes: Data, Logic e Interface. 
     * Para isso, o teste cria instâncias dessas classes e executa uma operação que envolve todas as três classes 
     * chamando o método add (Logic.java) no objeto ui (Interface.java). 
     * Em seguida, realiza o assert de que o resultado da operação é igual a 5 e que o primeiro elemento na lista 'results' 
     * do objeto 'Data' também é igual a 5.
     *  
     * Se alguma dessas asserções falhar, um AssertionError será lançado.
     */
    @Test
    public void testTopDownIntegration() {
        Data data = new Data();
        Logic logic = new Logic(data);
        Interface ui = new Interface(logic);

        // Executa uma operação que envolve todas as três classes
        int result = ui.add(2, 3);

        // Afirma o resultado ou quaisquer outras condições para ter a certeza de que a integração está ocorrendo como esperado
        assertEquals(5, result);
        assertEquals(5, data.getResults().get(0));
    }
}