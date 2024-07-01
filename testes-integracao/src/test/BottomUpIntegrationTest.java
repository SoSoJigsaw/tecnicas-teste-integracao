package main.test;

import main.java.Data;
import main.java.Interface;
import main.java.Logic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Classe de teste de integração do tipo Bottom-Up.
 * Este teste verifica a integração entre as camadas de dados (Data), lógica (Logic) e interface (Interface)
 * da aplicação utilizando a abordagem Bottom-Up.
 */
public class BottomUpIntegrationTest {

    /**
     * Detalhamento do caso de teste:
     * 
     *** 1. Cria instâncias das classes Data, Logic e Interface.
     *** 2. Testa a interação entre Data e Logic salvando um valor no objeto 'Data' e realizando o assert de que ele foi salvo corretamente.
     *** 3. Testa a interação entre Logic e Interface chamando o método add no objeto Logic e realizando o assert de que o resultado é o esperado.
     *** 4. Por fim, testa a funcionalidade integrada de todas as três classes chamando o método add no objeto Interface e realizando o assert de que o resultado é o esperado.
     * 
     */
    @Test
    public void testBottomUpIntegration() {
        Data data = new Data();
        Logic logic = new Logic(data);
        Interface ui = new Interface(logic);

        /**
         * Testa a integração entre a classe Data e a classe Logic.
         * Verifica se os dados são corretamente processados pela lógica de negócios.
         */
        data.save(5);
        assertEquals(5, data.getResults().get(0));

        /**
         * Testa a integração entre a classe Logic e a classe Interface.
         * Garante que a interface pode exibir corretamente os dados processados pela lógica de negócios.
         */
        int result = logic.add(2, 3);
        assertEquals(5, result);

        // Testa por fim a funcionalidade integrada de todas as três classes através de um assert
        int finalResult = ui.add(2, 3);
        assertEquals(5, finalResult);
    }
}