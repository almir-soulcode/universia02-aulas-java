package aula_05.atividade;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do paciente: ");
        String nome = entrada.nextLine();

        System.out.println("Digite a data (ano-mês-dia): ");
        String dataTexto = entrada.nextLine();

        LocalDate data = LocalDate.parse(dataTexto);
        LocalDate hoje = LocalDate.now();

        DateTimeFormatter dtm = DateTimeFormatter.ofPattern("dd/MM");

        if(data.isBefore(hoje)) {
            System.out.println("Reagendando " + nome);
            data = data.plusDays(4);
            System.out.println("Nova data de agendamento: " + dtm.format(data));
        }
    }
}
