// Package = pasta / organizar os códigos
    // Permite que vários arquivos de um mesmo pacote
    // possam se comunicar
package aula_02;

public class EstudoOperadores {
    public static void main(String[] args) {
        // Operadores matemáticos (+, -, *, /, %)
        int a = 10;
        int b = 15;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        double divisao = b / a;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        // ATENÇÃO: No java dividir 2 inteiros resulta num valor inteiro (ignorar a parte decimal!)
        // Ao realizar divisão pelo menos uma das variáveis deve ser double!
        int c = 10;
        double d = 15.0;
        double divisao2 = d / c;

        System.out.println("Resultado: " + divisao2);

        // Operadores de incremento/decremento
        int valor = 5;
        valor++; // valor = valor + 1
        valor++; // valor = valor + 1
        valor--;

        // Operadores de atribuição (+=, -=, *=, /=)
        valor += 5; // valor = valor + 5
        valor -= 2; // valor = valor - 2

        // Operadores relacionais (>, <, >=, <=, ==, !=)
        // Para comparar números (double, int)
        boolean test1 = 10 > 5; // true
        boolean test2 = 5 < 1; // false
        boolean test3 = 5 >= 5; // true
        boolean test4 = 4 <= 6; // true
        boolean test5 = 10 == 10.0; // true
        boolean test6 = 2 != 1; // true

        // Operadores lógicos (&&, ||, !)
        boolean test7 = true && false; // false
        boolean test8 = true || false; // true
        boolean test9 = (5 > 10) && (8 > 4); // false
        boolean test10 = (10 >= 0) || (1 < 5); // true
        boolean test11 = !test1; // false

        // Exercício I: Crie duas variáveis peso e altura.
        // Calcule o IMC = peso / (altura * altura).
        // Mostre na tela o resultado.
        double altura = 1.75;
        double peso = 83.5;

        double imc = peso / (altura * altura);
        System.out.println("O IMC é " + imc);
    }
}
