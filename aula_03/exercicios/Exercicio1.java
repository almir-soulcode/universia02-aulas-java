package exercicios;
/*
 * Crie um programa que solicite dois números e realize operações básicas (+ - adição, - - subtração, * - multiplicação, / - divisão) com base na escolha do usuário.
 */

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        double n1 = entrada.nextDouble();
        
        System.out.println("Digite o segundo valor: ");
        double n2 = entrada.nextDouble();

        System.out.println("Digite a operação (+, -, *, /): ");

        entrada.nextLine();

        String operador = entrada.nextLine();
        
        // PROCESSAMENTO
        // Switch-case => escolhe valores
        switch(operador) {
            case "+":
                double soma = n1 + n2;
                System.out.println("A soma é: " + soma);
                break;
            case "-":
                double sub = n1 - n2;
                System.out.println("A subtração é: " + sub);
                break;
            case "*":
                double mult = n1 * n2;
                System.out.println("A multiplicação é: " + mult);
                break;
            case "/":
                double div = n1 / n2;
                System.out.println("A divisão é: " + div);
                break;
            default:
                System.out.printf("Você digitou %s. Está errado!\n", operador);
        }
    }
}
