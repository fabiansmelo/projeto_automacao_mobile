# Gerenciador de Finanças - Automação de Testes

Este projeto consiste em um **sistema de automação de testes** para um aplicativo de gestão de despesas pessoais, desenvolvido utilizando **Appium**, **Java**, e o framework de testes **Cucumber**. A aplicação permite organizar finanças adicionando e gerenciando despesas de diferentes categorias.

### Principais Pacotes:

- **pageobjects**: Contém a classe `AdicionarDespesasPage`, que mapeia os elementos e ações do aplicativo para as funcionalidades de adicionar despesas.
- **runners**: O `RunnerTest` é responsável por executar os cenários definidos nos arquivos `.feature`.
- **steps**: Contém as definições dos passos (steps) dos testes, como interações do usuário e validações.
- **utils**: Inclui classes utilitárias como `Utils`, para inicializar o Appium e configurar os capabilities do driver.

---

## 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem principal para implementação dos testes.
- **Appium**: Framework para automação de testes em dispositivos móveis.
- **Cucumber**: Framework para escrita de cenários de testes em formato Gherkin.
- **Maven**: Gerenciador de dependências.

---

## 🚀 Funcionalidades Testadas

### Funcionalidade: Gerenciador de Orçamento - Despesas
Os testes cobrem a funcionalidade de adicionar e gerenciar despesas no aplicativo.

#### Cenários Implementados:
1. **Adicionar despesas**
   - O usuário pode adicionar uma nova despesa especificando o valor e a categoria (ex: família, exercício).
   - Exemplo de cenário:
     ```gherkin
     Dado que o usuário esteja na página principal do aplicativo
     E o usuário adiciona uma despesa de '2000' da categoria 'família'
     Então o aplicativo adiciona uma nova despesa
     ```

2. **Soma de transações**
   - O sistema calcula e exibe a soma total das despesas adicionadas.
   - Exemplo de cenário:
     ```gherkin
     Dado que o usuário esteja na página principal do aplicativo
     E o usuário adiciona uma despesa de '2000' da categoria 'família'
     E o usuário adiciona uma despesa de exercício
     Então o sistema exibe a soma das transações: '2120'
     ```

#### Cenários em Desenvolvimento:
- Alterar uma despesa.
- Remover uma despesa.

---

## 📜 Configuração do Ambiente

1. **Requisitos**:
   - JDK 11+
   - Appium instalado e configurado.
   - Dispositivo Android ou emulador configurado.

2. **Setup**:
   - Clone o repositório:
     ```bash
     git clone https://github.com/usuario/gerenciador-financas-teste.git
     ```
   - Instale as dependências:
     ```bash
     mvn clean install
     ```

3. **Execução dos Testes**:
   - Inicie o servidor Appium.
   - Execute o runner dos testes:
     ```bash
     mvn test
     ```

---

## 📝 Considerações Finais

Este projeto visa garantir a qualidade do aplicativo de gestão de finanças através da automação de testes. Ainda há funcionalidades em desenvolvimento, como editar e remover despesas, que serão implementadas futuramente.

---
