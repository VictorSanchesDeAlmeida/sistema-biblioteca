# Sistema de Gerenciamento de Livros

Este é um sistema simples em Java para gerenciar uma lista de livros. Ele permite que os usuários adicionem livros à lista e visualizem os livros cadastrados.

## Funcionalidades

- Adicionar livros com título, autor e gênero.
- Visualizar a lista de livros cadastrados.
- Encerrar o sistema após visualizar a lista.

## Como executar o programa

### Pré-requisitos

- [Java JDK](https://www.oracle.com/java/technologies/javase-jdk-downloads.html) instalado (versão 8 ou superior).

### Passos para execução

1. Clone este repositório ou copie o código para o seu ambiente de desenvolvimento local.
2. Certifique-se de que você tenha o arquivo `Livro.java` no pacote `livro`. Este arquivo deve conter a classe `Livro` com os atributos `titulo`, `autor` e `genero`, além do método `toString()` para retornar uma representação formatada do livro.
3. Compile o programa:

```bash
javac Main.java livro/Livro.java
