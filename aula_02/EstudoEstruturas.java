package aula_02;

import java.util.Scanner;

public class EstudoEstruturas {
    public static void main(String[] args) {
        // Criando um scanner para o nosso programa utilizar
        // Instanciar
        // Scanner é uma classe do pacote java.util
        // Criamos a variavel entrada para utilizar as funções dentro da classe
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine(); // aguarda até o usuário digitar o valor

        System.out.println("O nome digitado foi: " + nome);

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("A idade digitada foi: " + idade);

        System.out.println("Digite sua nota: ");
        double nota = entrada.nextDouble(); // digite o número com vírgula

        System.out.println("A nota digitada foi: " + nota);

        // IF-ELSE = desvio condicional
        if(nota >= 7) {
            System.out.println("Está aprovado!");
        } else if(nota >= 5.5) {
            System.out.println("Está em recuperação!");
        } else {
            System.out.println("Está reprovado!");
        }

        String mensagem = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(mensagem);
    }
}
