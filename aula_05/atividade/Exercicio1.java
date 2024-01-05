package aula_05.atividade;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a data (dia mês ano):");

        int dia = entrada.nextInt();
        int mes = entrada.nextInt();
        int ano = entrada.nextInt();

        LocalDate data = LocalDate.of(ano, mes, dia);
        LocalDate natal = LocalDate.of(ano, 12, 25);

        if (data.isBefore(natal)) {
            System.out.println("Nasceu antes do natal do ano " + ano);
        } else {
            System.out.println("Nasceu após o natal do ano " + ano);
        }
    }
}
