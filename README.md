# Instruções para executar a API no back-end
## Pré-requisitos
Antes de executar a API, certifique-se de ter os seguintes pré-requisitos instalados:

 - Docker
 - VS Code ou outro editor de sua preferência
## Banco de Dados
A API utiliza o MySQL como banco de dados. O arquivo `dump.sql` contém um banco completo que será criado e populado com seus respectivos dados assim que a API for iniciada.

Além disso, há um arquivo `schema.sql` que contém o esquema do banco. Certifique-se de que o banco de dados foi iniciado antes de executar a API.

Para iniciar o banco de dados, abra o terminal na pasta do projeto e execute o seguinte comando:

```
docker-compose up --build
```
## Rotas da API
A API possui três rotas funcionais:

- POST /login: realiza a autenticação do usuário. O corpo da requisição deve conter os seguintes campos em formato JSON:

```
{
    "name": "nome do usuário cadastrado",
    "password": "senha do usuário"
}
```

- POST /signin: realiza o cadastro do usuário. O corpo da requisição deve conter os seguintes campos em formato JSON:

```
{
    "name": "nome do usuário",
    "password": "senha do usuário",
    "email": "email do usuário",
    "cep": "cep do usuário"
}
```

- GET /house: retorna todas as casas cadastradas.
## Executando a API
Para executar a API, abra o arquivo App.java em seu editor de preferência e inicie a aplicação.

# Instruções para executar o front-end no locateProperties
## Pré-requisitos
Antes de executar o front-end, certifique-se de ter os seguintes pré-requisitos instalados:

- Node.js
- Angular CLI
## Executando o front-end
Para executar o front-end, abra o terminal na pasta locateProperties e execute o seguinte comando:
```
ng serve
```
Note que ainda não há integração entre o front-end e a API.