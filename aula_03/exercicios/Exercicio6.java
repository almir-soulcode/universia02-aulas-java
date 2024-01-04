package exercicios;
/*
 * Faça um programa que receba uma nota de 0 a 100 e converta para conceitos (A, B, C, D, F) usando estruturas condicionais.
 */

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma nota (0 a 100)");
        int nota = entrada.nextInt();

        // PROCESSAMENTO
        if(nota >= 80 && nota <= 100) {
            System.out.println("A"); // SAÍDA
        } else if(nota >= 60 && nota <= 79) {
            System.out.println("B");
        } else if(nota >= 40 && nota <= 59) {
            System.out.println("C");
        } else if(nota >= 20 && nota <= 39) {
            System.out.println("D");
        } else if(nota >= 0 && nota <= 19) {
            System.out.println("F");
        } else {
            System.out.println("Nota inválida. Digite 0-100.");
        }
    }
}
