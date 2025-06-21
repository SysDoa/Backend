# Sysdoa - Backend

SysDoa, um sistema móvel que permite não só uma gestão virtual de candidatos de uma agência de banco de sangue, como também possibilita análises estatísticas das informações coletadas.

Análago ao desenvolvimento de software, este repositório contém o backend do projeto, responsável por gerenciar os dados e suportar as funcionalidades do aplicativo.

## Tecnologias usadas

- Spring - Java
- PostgreSQL - SQL

## Configurações em localhost
    
  - instale o JDK21; 
  - Instale o Maven na sua máquina;
  - Instale o PostgreSQL na sua máquina;
  - Crie um usuário chamado postgres no postgres, se não houver;
  - Altere a senha de usuário para postgres também;
  - Crie um banco de dados chamado "sysdoa";

## Dependências implantadas

- Spring Web
- Spring Data JPA
- Lombok
- Validation
- Spring Boot DevTools
- PostgreSQL Driver

## Inicialização

Este projeto pode ser limpo, reconstruído e executado facilmente usando comandos Maven em diferentes sistemas operacionais. Veja alguns exemplos abaixo:

### No Linux
        
  - Execute o comando para limpar e reconstruir o projeto spring no linux:
    - mvn clean
    
  - Execute o comando para rodar o projeto no linux:
    - mvn spring-boot:run


### No Windows

  - Execute o comando para limpar e reconstruir o projeto spring no windows:
    -  ./mvnw clean
        
  - Execute o comando para rodar o projeto no windows:
    - ./mvnw spring-boot:run

## Documentação do Projeto

Leia a [_documentação do projeto_](https://github.com/SysDoa/Documentos), para seguir padrões pré-definidos, evitando conflitos de códigos e manter a conformidade com a qualidade de software. 