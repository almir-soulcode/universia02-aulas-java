package aula_05.atividade;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String frase = entrada.nextLine();
        String palavra = entrada.nextLine();

        System.out.println(frase.replaceAll(palavra, ""));
    }
}
