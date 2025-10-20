# Orientação a Objetos

Implementando diagramas de classes UML e validando por meio de testes

---

## **Sobre o projeto**

Este repositório contém exercícios de **modelagem e implementação** em **Java**, partindo de diagramas de classes para construir hierarquias, relacionamentos e regras de negócio.  
Há dois tipos de pastas principais:

- **Projetos Maven (VS Code / IntelliJ)**: Possuem `pom.xml` e seguem a convenção `src/main/java` e `src/test/java`.
- **Exercícios sem build tool (BlueJ / pasta simples)**: Classes isoladas para treinar conceitos (podem não ter `main`).

O objetivo é consolidar os **princípios de POO** (encapsulamento, herança, polimorfismo, abstração), além de boas práticas de projeto (coesão, baixo acoplamento e uso adequado de coleções).

---

## **Conteúdo e tópicos trabalhados**

- **Classes, atributos e métodos** (construtores, getters/setters, `toString`)
- **Relacionamentos**: associação, agregação e composição
- **Generalização/Especialização**: **herança** e **polimorfismo**
- **Interfaces e classes abstratas**
- **Pacotes e visibilidade** (`public`, `protected`, `private`)
- **Coleções** (`List`, `Set`, `Map`) e sobrecarga de `equals`/`hashCode`

Pastas importantes:

- `Exercicios/ExerciciosInteliJ` (Maven) — Contém `pom.xml`, entidades em `src/main/java` e testes em `src/test/java`
- `Exercicios/Exercicio01`..`Exercicio04`, `ExercicioProfessor`, `Heranca` — Exercícios isolados (BlueJ/sem Maven)

Os exercícios estão nomeados de forma descritiva e seguem a estrutura sugerida em aula, facilitando a navegação e o entendimento progressivo dos conceitos.

---

## **Execução dos Projetos**

Cada pasta representa um projeto independente, podendo ser aberta e executada no ambiente de preferência do desenvolvedor. As implementações foram desenvolvidas e testadas principalmente no **IntelliJ IDEA**, mas podem ser executadas também em outros ambientes como **VS Code** ou **Eclipse**, desde que estejam devidamente configurados com o **JDK 17+** e com o **Maven**, quando aplicável.

### Opções de execução

O ambiente de execução é flexível, ficando a critério do desenvolvedor a escolha da IDE e das ferramentas utilizadas. Irei expor como faço utilizando IDE.

1. Abra a pasta correspondente ao exercício desejado.

2. Execute a classe principal (`Main.java`) diretamente pela IDE.

3. Se a pasta possuir testes (`*Test.java`), rode-os pela interface de testes integrada.

Muitos exercícios incluem **testes automatizados** escritos em **JUnit 5**, com o intuito de reforçar a prática de **desenvolvimento orientado a testes** e validar o comportamento das classes implementadas.

---

## **Objetivo pedagógico e Motivação**

Este projeto tem caráter **didático e prático**, buscando desenvolver a **capacidade de abstração, modelagem e implementação de sistemas orientados a objetos.** As atividades foram elaboradas para estimular o raciocínio de projeto, incentivando o uso de **boas práticas, organização modular e clareza de código.**

Além do aprendizado técnico, este repositório também reflete a aplicação de **padrões fundamentais de design** e de **conceitos essenciais** para o desenvolvimento em linguagens orientadas a objetos, além de servir como material de apoio e referência para estudos futuros.

A diversidade de exercícios permitiu-me exercitar tanto a **análise conceitual** de problemas quanto a **implementação prática** das soluções em um ambiente **real** de desenvolvimento.
