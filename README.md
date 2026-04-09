# Bank Account Service (Spring Boot)

API de gerenciamento de contas bancárias desenvolvida com Java e Spring Boot, seguindo boas práticas de arquitetura backend e preparada para evolução em um ambiente de microsserviços.

---

## Objetivo

Este projeto tem como objetivo simular um serviço bancário responsável pela criação e gerenciamento de contas, aplicando conceitos como separação de responsabilidades, arquitetura em camadas e uso de tecnologias modernas do ecossistema Java.

---

## Arquitetura

A aplicação segue uma arquitetura em camadas:

- **Controller** → recebe requisições HTTP  
- **Service** → contém regras de negócio  
- **Repository** → acesso ao banco de dados  
- **Entity** → representação do domínio  
- **DTO** → objetos de transferência de dados  

---

## Tecnologias utilizadas

- Java 17  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- PostgreSQL  
- Lombok  
- Bean Validation  
- Maven  

---

## Tecnologias planejadas (em evolução)

- Redis → cache de dados e otimização de performance  
- Docker → containerização da aplicação  
- Kubernetes → orquestração de containers  
- Kafka → comunicação assíncrona entre microsserviços  

---

## Funcionalidades

- Criação de conta bancária  
- Geração automática de número da conta  
- Definição de saldo inicial  
- Persistência de dados em banco relacional  

---

## Modelo de dados (Account)

A entidade principal da aplicação representa uma conta bancária contendo:

- `id`
- `accountNumber`
- `holderName`
- `balance`
- `createdAt`

---

## Fluxo da aplicação

```text
Request HTTP
   ↓
DTO (entrada)
   ↓
Controller
   ↓
Service (regras de negócio)
   ↓
Entity
   ↓
Repository
   ↓
Banco de dados
   ↓
Response DTO

---

## CI/CD e Deploy

O projeto está preparado para evolução com pipeline de integração e entrega contínua (CI/CD), permitindo automatizar o processo de build, testes e deploy.

### Fluxo de CI/CD

```text
Commit no código
   ↓
Push para o GitHub
   ↓
Pipeline CI/CD (GitHub Actions)
   ↓
Build da aplicação
   ↓
Execução de testes
   ↓
Build da imagem Docker
   ↓
Push da imagem para registry (Docker Hub)
   ↓
Deploy (container atualizado)
