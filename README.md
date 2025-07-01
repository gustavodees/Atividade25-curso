# Calculadora de Divisão

## Visão Geral

Este programa Java solicita ao usuário que digite o número de vezes que uma operação de divisão será realizada. Para cada operação, o usuário deverá inserir um valor para o numerador e outro para o denominador. O programa então calcula e exibe o resultado da divisão. Adicionalmente, o programa verifica se o denominador é zero e, nesse caso, informa que a divisão é impossível.

## Como Usar

Para executar este programa, você precisará ter o Java Development Kit (JDK) instalado em seu computador.

**Passos para executar o programa:**

1.  **Salve o código:** Salve o código Java fornecido em um arquivo chamado `Main.java` dentro de uma pasta chamada `principal`. A estrutura de pastas deve ser:
    ```
    seu_projeto/
    └── principal/
        └── Main.java
    ```

2.  **Compile o código:** Abra o terminal ou prompt de comando, navegue até a pasta raiz do seu projeto e execute o seguinte comando para compilar o código Java:
    ```bash
    javac principal/Main.java
    ```
    Isso irá gerar um arquivo chamado `Main.class` dentro da pasta `principal`.

3.  **Execute o programa:** No mesmo terminal ou prompt de comando, execute o programa com o comando:
    ```bash
    java principal.Main
    ```
    O programa abrirá caixas de diálogo para solicitar o número de operações e, em seguida, o numerador e o denominador para cada operação.

## Explicação do Código

O código Java realiza as seguintes operações:

* **Importa `javax.swing.*`:** Importa as classes necessárias para criar janelas de diálogo gráficas.
* **Declaração da classe `Main`:** Define a classe principal do programa.
* **Método `main`:** O ponto de entrada da execução do programa.
* **Solicita o número de repetições:**
    * `int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de vezes que é para repetir: "))`: Abre uma caixa de diálogo para o usuário inserir o número de divisões que serão realizadas. A entrada (uma `String`) é convertida para um inteiro usando `Integer.parseInt()` e armazenada na variável `n`. **Esta é uma operação de conversão de tipo (parsing).**
* **Loop `for`:** Um loop `for` é executado `n` vezes.
    * **Solicita o numerador:**
        * `double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "))`: Solicita ao usuário que digite o valor do numerador. A entrada (uma `String`) é convertida para um número de ponto flutuante de precisão dupla (`double`) usando `Double.parseDouble()` e armazenada na variável `a`. **Ocorre outra operação de parsing.**
    * **Solicita o denominador:**
        * `double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do denominador "))`: Solicita ao usuário que digite o valor do denominador. A entrada (uma `String`) é convertida para um `double` e armazenada na variável `b`. **Mais uma operação de parsing.**
    * **Calcula a diferença (quociente):**
        * `double diferenca = a / b;`: Calcula o resultado da divisão de `a` (numerador) por `b` (denominador) e armazena o resultado na variável `diferenca`.
    * **Exibe o resultado:**
        * `JOptionPane.showMessageDialog(null, "O resultado é: " + diferenca);`: Exibe uma caixa de diálogo mostrando o resultado da divisão.
    * **Verifica divisão por zero:**
        * `if (b == 0)`: Verifica se o valor do denominador (`b`) é igual a zero.
        * `JOptionPane.showMessageDialog(null, "Divisão impossivel");`: Se o denominador for zero, exibe uma mensagem informando que a divisão é impossível.

## Conversão de Tipos (Parsing)

Este programa utiliza a conversão de tipos (parsing) para trabalhar com os valores inseridos pelo usuário através das caixas de diálogo. Os métodos `Integer.parseInt()` e `Double.parseDouble()` são usados para converter as `Strings` de entrada para os tipos numéricos `int` e `double`, respectivamente. Isso permite que o programa realize operações matemáticas com os valores fornecidos pelo usuário.

## Requisitos

* Java Development Kit (JDK) instalado no sistema.

## Como Executar

1.  Certifique-se de ter o JDK instalado.
2.  Salve o código em `seu_projeto/principal/Main.java`.
3.  Abra o terminal e navegue até a pasta `seu_projeto`.
4.  Compile o código com: `javac principal/Main.java`
5.  Execute o programa com: `java principal.Main`

## Exemplo de Uso

1.  Ao executar o programa, a primeira caixa de diálogo perguntará "Digite o numero de vezes que é para repetir: ". Se você digitar `2` e clicar em "OK".
2.  Para a primeira operação, aparecerá uma caixa de diálogo pedindo o "primeiro valor" (numerador). Digite, por exemplo, `10` e clique em "OK".
3.  Em seguida, aparecerá uma caixa de diálogo pedindo o "valor do denominador". Digite, por exemplo, `2` e clique em "OK". Uma caixa de diálogo mostrará "O resultado é: 5.0".
4.  Para a segunda operação, o programa pedirá novamente o numerador. Digite, por exemplo, `7`.
5.  Em seguida, digite o denominador. Se você digitar `0` e clicar em "OK", uma caixa de diálogo mostrará "O resultado é: Infinity" (resultado da divisão por zero em ponto flutuante) e outra caixa de diálogo mostrará "Divisão impossivel".

## Autor

gustavodees

gustavoemartins@gmail.com
