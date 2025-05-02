# 🧬 Herança e Polimorfismo em Java
---

🚀 **Plataforma:** [DIO - Digital Innovation One](https://www.dio.me)  
📚 **Módulo 3:** Programação Orientada a Objetos  
🎓 **Curso 4:** Herança e Polimorfismo em Java  

---
## 👨‍🏫 Projeto desenvolvido com apoio de:  
**José Luiz Abreu Cardoso Junior**

---
## 📂 Classes
**Main:**
É a classe principal que testa o comportamento das subclasses (Manager e Salesman).
Cria objetos usando polimorfismo: Employee employee = new Manager() ou new Salesman().
Usa switch com padrões (pattern matching)` para processar cada tipo específico de funcionário.
Chama getFullSalary(double extra) para mostrar o salário completo com acréscimos.

**Employee:**
Marcada como sealed: só pode ser estendida por Manager e Salesman.
Define a estrutura básica de um funcionário:
Atributos: code, name, address, age, salary
Método abstrato: getFullSalary() — implementado nas subclasses.
Método concreto: getFullSalary(double extra) — soma adicional ao salário calculado.

**Manager:**
Subclasse de Employee, marcada como non-sealed:
Atributos adicionais: login, password, comission.
Implementa getFullSalary(): salário base + comissão.
Sobrescreve getCode() para prefixar com "MN".

**Salesman:**
Outra subclasse de Employee:
Atributos: percentPerSold (comissão em %), soldAmount (total vendido).
getFullSalary() calcula: salário base + comissão sobre vendas.
Sobrescreve getCode() para prefixar com "SL"

**Client:**
Classe sem relação direta ao Employee. 
Simples teste.

---

## 📌 Descrição  

Este projeto foi desenvolvido como parte do módulo de **Programação Orientada a Objetos** e explora os conceitos fundamentais de **Herança** e **Polimorfismo** em Java.

💡 Conceitos abordados:
- Reutilização de código com herança 🧱
- Especialização de comportamentos com polimorfismo 🧠
- Práticas de encapsulamento e abstração 📦

---
