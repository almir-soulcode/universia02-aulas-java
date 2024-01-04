/*
 * Peça ao usuário para inserir um número e exiba a tabuada desse número de 1 a 10 usando um loop for
 */
package atividade;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int numero = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d \n", numero, i, numero * i);
        }
    }
}
