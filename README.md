# 📋 Sistema de Cadastro de Funcionários

Sistema de gerenciamento de funcionários desenvolvido em **Java 21 (LTS)**, utilizando **Programação Orientada a Objetos (POO)** e uma **arquitetura em camadas**, com separação clara entre entidades, repositório e serviços.

O projeto é executado via **console** e foi criado com foco em aprendizado, organização de código e boas práticas de backend.

---

## Tecnologias utilizadas

- **Java 21 (LTS)**
- Programação Orientada a Objetos (POO)
- Collections (`List`, `ArrayList`)
- Gradle
- Scanner (entrada de dados via console)
- Git & GitHub

---

## Estrutura do projeto

src/
└── main
└── java
├── entities
│ └── Funcionario.java
├── repository
│ └── RepositorioFuncionario.java
├── services
│ ├── FuncionarioService.java
│ └── CadastroDeFuncionarios.java
└── Program
└── Programa.java


---

## 🧠 Conceitos aplicados

- Encapsulamento
- Separação de responsabilidades (Entity / Repository / Service)
- Arquitetura em camadas
- Regras de negócio centralizadas na camada de Service
- Validações de domínio
- Boas práticas de organização e nomenclatura
- Controle de versão com Git

---

## ⚙️ Funcionalidades

- ✅ Cadastrar funcionário
- ❌ Remover funcionário pelo ID
- 🔍 Buscar funcionário pelo ID
- 📃 Listar todos os funcionários
- 💰 Aplicar aumento salarial com validações
- 🚫 Impede cadastro de funcionários com ID duplicado

---

## 🧩 Regras de negócio

- Não permite cadastro de funcionários com **ID duplicado**
- O aumento salarial:
  - Deve ser **maior que 0**
  - Não pode ser **maior que 100%**
- Operações inválidas exibem mensagens claras no console

---

## ▶️ Como executar o projeto

### Pré-requisitos
- **Java 21** instalado
- IDE Java (IntelliJ IDEA, Eclipse ou VS Code)

### Passos
1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/sistema-cadastro-funcionarios.git
Abra o projeto na IDE

Execute a classe:

Program/Programa.java
Interaja com o menu pelo console

🖥️ Exemplo de menu
Escolha uma das opções a seguir
1- adicionar funcionario
2- apagar funcionario
3- buscar funcionario
4- listar funcionarios
5- aumentar salario
0- sair
🚀 Possíveis melhorias futuras
Persistência de dados em arquivo (CSV ou TXT)

Busca de funcionários por nome

Ordenação por salário

Uso de Optional

Exceções customizadas

Testes unitários com JUnit

Conversão do projeto para API REST com Spring Boot

 Autor
Projeto desenvolvido por Cícero, estudante de Análise e Desenvolvimento de Sistemas, com foco em Backend Java.

 Observação
Este projeto faz parte do meu processo de aprendizado e evolução em Java e Programação Orientada a Objetos.
Sugestões e feedbacks são sempre bem-vindos!

