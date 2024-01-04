/*
 * Escreva um programa que inicie uma contagem regressiva a partir de um número especificado pelo usuário até zero, utilizando um loop while.
 */

package atividade;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int contagem = entrada.nextInt();

        while(contagem >= 0) {
            System.out.println(contagem + "!!!!");
            contagem--;
        }
    }
}
