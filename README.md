📁 Projeto: Cálculo de Fatorial Duplo (Recursivo)

📌 Descrição: >
  Aplicação em Java que calcula o fatorial duplo de um número ímpar positivo utilizando recursividade.
  O fatorial duplo de um número ímpar N é definido como: N!! = N × (N - 2) × (N - 4) × ... × 1.

🗂️ Estrutura de Arquivos:
  - 📄 src/controller/FatorialDuplo.java: Contém o método recursivo responsável por calcular o fatorial duplo.
  - 📄 src/view/Principal.java: Responsável pela interação com o usuário, validação de entrada e exibição do resultado.

🧠 Lógica da Recursividade:
  método: CalcularFatorialDuplo(int n, int i)
  explicação:
    - ✋ Condição de parada: Quando `i == n`, o valor final da recursão é alcançado e o método retorna `i`.
    - 🔁 Relação recursiva: Retorna `i * CalcularFatorialDuplo(n, i + 2)`, avançando de dois em dois, somando apenas os ímpares.

💬 Exemplo de Execução:
  entrada:
    - Valor: 7
  saída:
    - O fatorial duplo de 7 é: 105

📥 Entrada:
  - O usuário insere um número ímpar positivo via `JOptionPane`.
  - Caso o número seja par ou negativo, a entrada é recusada até que seja válido.

📤 Saída:
  - Exibe o valor do fatorial duplo calculado com uma mensagem no `JOptionPane`.

📌 Observações:
  - A recursão avança somando dois a cada passo (1 → 3 → 5 → ...), garantindo a multiplicação apenas de números ímpares.
  - Entrada segura e validada: o código impede números negativos ou pares.
  - Estrutura limpa, modular e organizada para facilitar a leitura e manutenção.

👨‍💻 Autor:
  Criado por **Lucas Bezerra de Macedo**.
