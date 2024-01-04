/*
 * Desenvolva um jogo em que o computador gera um número aleatório e o usuário tenta adivinhar. Use um loop para permitir um número fixo de tentativas (use a classe Random para gerar números aleatórios).
 */

package atividade;

import java.util.Random;
import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rnd = new Random();

        int numeroEscolhido = rnd.nextInt(100) + 1; // 1 até 100
        int totalChances = 5;

        do {
            System.out.println("Chute (1 a 100): ");
            int chute = entrada.nextInt();

            if(chute == numeroEscolhido) {
                System.out.println("Parabéns! Você acertou!");
                break; // encerra o loop
            } else {
                System.out.println("Errou!");
                totalChances--;
            }
        } while(totalChances > 0);
    
        if(totalChances == 0) {
            System.out.println("Você esgotou todas as suas chances!");
        }
    }
}
