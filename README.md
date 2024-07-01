# Técnicas de Testes em Nível de Integração

- O objetivo deste projeto é exemplificar a aplicação de diferentes tipos de testes de integração, especificamente as variações Big Bang, Top-Down e Bottom-Up. Esses testes foram implementados para validar as interações entre três classes principais (`Data`, `Logic` e `Interface`), assegurando que os métodos e operações definidos funcionem corretamente quando integrados.

## Descrição das Classes

### Classe `Data`

A classe `Data` é uma classe de encapsulamento simples (bean) que armazena um único valor inteiro. Ela fornece métodos para obter (`getValue()`) e definir (`setValue()`) esse valor. A simplicidade dessa classe facilita a manipulação de dados e a sua integração com outras classes no sistema.

### Classe `Logic`

A classe `Logic` implementa operações matemáticas básicas, incluindo adição, subtração, multiplicação e divisão. Cada método executa uma operação específica:

- `add(int a, int b)`: Soma dois inteiros.
- `subtract(int a, int b)`: Subtrai o segundo inteiro do primeiro.
- `multiply(int a, int b)`: Multiplica dois inteiros.
- `divide(int a, int b)`: Divide o primeiro inteiro pelo segundo, lançando uma exceção `ArithmeticException` se o divisor for zero para evitar a divisão por zero.

### Classe `Interface`

A classe `Interface` serve como uma camada intermediária que integra as funcionalidades das classes `Logic` e `Data`. Ela contém métodos que expõem as operações matemáticas de `Logic` e métodos para acessar e modificar o valor encapsulado na instância de `Data`. Isso permite a combinação das operações matemáticas com a manipulação de dados de forma coesa.

## Relação entre as Classes

A relação entre as classes `Data`, `Logic` e `Interface` justifica a realização de testes de integração devido à forma como elas interagem para fornecer funcionalidades completas. A `Interface` utiliza `Logic` para realizar operações matemáticas e `Data` para armazenar e manipular valores. Testar essas interações assegura que as classes funcionem corretamente quando integradas, identificando problemas que podem não ser evidentes quando as classes são testadas isoladamente.

## Documentação dos Testes de Integração

### Big Bang Integration Test

#### Intenção do Teste Big Bang aplicado

O Big Bang Integration Test visa testar todas as funcionalidades do sistema como um todo, após integrar todos os componentes (`Data`, `Logic` e `Interface`).

#### Importância do Teste Big Bang nesse projeto

Este tipo de teste é importante para verificar a interação global entre todos os componentes do sistema de uma só vez. No contexto deste projeto, ele valida se a `Interface` consegue utilizar corretamente os métodos de `Logic` e manipular o valor de `Data` conforme esperado. Embora possa ser difícil isolar a causa exata dos problemas devido à integração simultânea de todos os componentes, este teste oferece uma visão abrangente da funcionalidade do sistema integrado.

### Bottom-Up Integration Test

#### Intenção do Teste Bottom-up aplicado

O Bottom-Up Integration Test testa os componentes de nível mais baixo (`Logic` e `Data`) primeiro e, gradualmente, integra e testa os componentes de nível mais alto (`Interface`).

#### Importância do Teste Bottom-Up nesse projeto

Este tipo de teste é essencial para garantir que os componentes básicos funcionem corretamente antes de testar os componentes que dependem deles. No contexto deste projeto, ele valida inicialmente as operações matemáticas de `Logic` e a manipulação de valores em `Data`, assegurando que estas funcionalidades fundamentais estejam corretas. Após isso, a `Interface` é testada para verificar se consegue integrar corretamente essas funcionalidades básicas. Este método facilita a localização e correção de problemas nos componentes de baixo nível antes de avançar para os níveis superiores.

### Top-Down Integration Test

#### Intenção do Teste Top-Down aplicado

O Top-Down Integration Test testa os componentes de nível mais alto (`Interface`) primeiro e, gradualmente, integra e testa os componentes de nível mais baixo (`Logic` e `Data`).

#### Importância do Teste Top-Down nesse projeto

Este tipo de teste é crucial para assegurar que as interfaces e fluxos de controle de alto nível funcionem corretamente antes de se concentrar nos detalhes dos componentes de baixo nível. No contexto deste projeto, ele valida inicialmente se a `Interface` pode executar operações matemáticas e manipular valores corretamente, utilizando os métodos de `Logic` e `Data`. Este método garante que a lógica de negócio principal seja testada primeiro, proporcionando uma visão clara do comportamento do sistema a partir de um nível mais abstrato. 

### Importância dos Testes de Integração

Os testes de integração são fundamentais para validar a correta interação entre diferentes componentes de um sistema, identificando problemas que podem surgir quando módulos individualmente funcionais são combinados. Cada tipo de teste de integração (Big Bang, Top-Down, Bottom-Up) oferece uma abordagem distinta para assegurar a qualidade e a funcionalidade do sistema:

- **Big Bang:** Fornece uma visão global da funcionalidade do sistema integrado.
- **Bottom-Up:** Garante que os componentes básicos funcionem corretamente antes de testar as integrações superiores.
- **Top-Down:** Assegura que a lógica de negócio principal funcione corretamente antes de detalhar os componentes inferiores.

Em projetos de software em geral, a combinação dessas abordagens oferece uma cobertura abrangente e robusta, facilitando a detecção e correção de problemas em diferentes estágios de integração e garantindo a qualidade do sistema como um todo.
