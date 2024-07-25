# Saiko Product Order System

## Sumário

- [Descrição](#descrição)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Pré-requisitos](#pré-requisitos)
- [Instalação](#instalação)
- [Uso](#uso)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [API Endpoints](#api-endpoints)
- [Contribuição](#contribuição)
- [Licença](#licença)

## Descrição

O Saiko Product Order System é um sistema de gerenciamento de pedidos de produtos, desenvolvido utilizando Spring Boot.
O projeto permite a gestão de usuários, produtos, categorias, pedidos e itens de pedidos, integrando essas
funcionalidades em uma API RESTful.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- H2 Database
- Maven

## Pré-requisitos

- JDK 17 ou superior
- Maven 3.8 ou superior

## Instalação

1. Clone o repositório:
    ```sh
    git clone https://github.com/SAIKO9X/workshop-spring.git
    cd saiko-product-order
    ```

2. Execute o projeto utilizando o Maven:
    ```sh
    ./mvnw spring-boot:run
    ```

## Uso

Após iniciar o aplicativo, a API estará disponível em `http://localhost:8080`.

### Acessar H2 Console

Para acessar o console do H2 Database, vá para `http://localhost:8080/h2-console`. Utilize as seguintes credenciais:

- JDBC URL: `jdbc:h2:mem:testdb`
- User Name: `sa`
- Password: `password`

### Descrição dos Pacotes

- **config**: Configurações do projeto, como `TestConfig` para popular o banco de dados.
- **controllers**: Endpoints da API.
- **entities**: Definição das entidades do banco de dados.
- **enums**: Definições de enums utilizados nas entidades.
- **exceptions**: Tratamento de exceções.
- **repositories**: Interfaces de repositório para acesso ao banco de dados.
- **services**: Lógica de negócios.

## API Endpoints

### Categories

- `GET /categories` - Retorna todas as categorias.
- `GET /categories/{id}` - Retorna uma categoria pelo ID.

### Products

- `GET /products` - Retorna todos os produtos.
- `GET /products/{id}` - Retorna um produto pelo ID.

### Orders

- `GET /orders` - Retorna todos os pedidos.
- `GET /orders/{id}` - Retorna um pedido pelo ID.

### Users

- `GET /users` - Retorna todos os usuários.
- `GET /users/{id}` - Retorna um usuário pelo ID.
- `POST /users` - Insere um novo usuário.
- `DELETE /users/{id}` - Deleta um usuário pelo ID.
- `PUT /users/{id}` - Atualiza um usuário pelo ID.

## Contribuição

1. Fork este repositório.
2. Crie um branch para sua feature (`git checkout -b feature/fooBar`).
3. Commit suas mudanças (`git commit -am 'Add some fooBar'`).
4. Push para o branch (`git push origin feature/fooBar`).
5. Crie um novo Pull Request.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.


