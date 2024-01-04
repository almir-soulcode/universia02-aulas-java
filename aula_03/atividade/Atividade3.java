/*
 *  Faça um programa que solicite ao usuário um número e calcule a soma de todos os números pares de 0 até o número inserido, utilizando um loop for. Se for digitado o número 20, será somado 0 + 2 + 4 + 8 + ... + 18 + 20.
 */

package atividade;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int numero = entrada.nextInt();
        int soma = 0;

        for(int i = 0; i <= numero; i += 2) {
            soma += i;
        }

        System.out.println(soma);
    }
}
