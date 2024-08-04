
# Sistema de Gerenciamento de Contas Bancárias

## Descrição

Este projeto é um sistema simples de gerenciamento de contas bancárias, desenvolvido em Java. O sistema permite criar contas, realizar depósitos, saques, transferências entre contas e listar todas as contas cadastradas. O objetivo é fornecer uma interface de linha de comando para simular operações bancárias básicas.

## Estrutura do Projeto

### Pacotes e Classes

- **Entities**:
  - `Menu`: Classe responsável pela interface de interação com o usuário. Contém métodos para exibir o menu, criar contas, realizar operações financeiras e listar contas.
  - `Pessoa`: Classe que representa uma pessoa. Contém informações como nome, CPF e e-mail.
  - `Conta`: Classe que representa uma conta bancária. Cada conta está associada a uma instância de `Pessoa` e contém informações como número da conta e saldo.
  
- **Utilitarios**:
  - `Utils`: Classe de utilitários que contém métodos para formatação de valores monetários.

- **program**:
  - `Main`: Classe principal que contém o método `main` para iniciar o programa.

## Funcionalidades

- **Criar Conta**: Permite criar uma nova conta bancária, solicitando nome, CPF e e-mail.
- **Depositar**: Permite realizar um depósito em uma conta existente.
- **Sacar**: Permite realizar um saque de uma conta existente.
- **Transferir**: Permite transferir fundos de uma conta para outra.
- **Listar Contas**: Exibe todas as contas cadastradas no sistema.

## Como Executar

1. **Pré-requisitos**:
   - Java JDK instalado.
   - IDE ou editor de texto de sua escolha.

2. **Compilação e Execução**:
   - Compile o projeto utilizando sua IDE ou linha de comando.
   - Execute a classe `Main` para iniciar o programa.

## Exemplo de Uso

```shell
------------------------------------------------------
************* Bem vindos à Agência *************
------------------------------------------------------
***** Selecione uma operação que deseja realizar *****
------------------------------------------------------
|   Opção 1 - Criar conta   |
|   Opção 2 - Depositar     |
|   Opção 3 - Sacar         |
|   Opção 4 - Transferir    |
|   Opção 5 - Listar        |
|   Opção 6 - Sair          |
```

## Contato

Para dúvidas ou sugestões, entre em contato através do e-mail: [ricktelles@gmail.com](mailto:ricktelles@gmail.com)

## Autor

- Henrique Telles Pires Garcia - [LinkedIn](https://www.linkedin.com/in/henrique-telles-dev/)
