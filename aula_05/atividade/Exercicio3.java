package aula_05.atividade;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        String[] arquivos = new String[5];
        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            arquivos[i] = entrada.nextLine();
        }

        for(String arquivo : arquivos) {
            if(arquivo.endsWith("mp3") || arquivo.endsWith("wav")) {
                System.out.println(arquivo + " é um arquivo de aúdio!");
            } else if(arquivo.endsWith("mp4") || arquivo.endsWith("mkv")) {
                System.out.println(arquivo + " é um arquivo de vídeo!");
            } else {
                System.out.println(arquivo + " é outro tipo de arquivo.");
            }
        }
    }
}
