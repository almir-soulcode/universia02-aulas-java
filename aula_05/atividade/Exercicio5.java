package aula_05.atividade;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a data (ano-mês-dia): ");
        String dataTexto = entrada.nextLine();

        LocalDate data = LocalDate.parse(dataTexto);
        DayOfWeek diaSemana = data.getDayOfWeek();

        if (diaSemana == DayOfWeek.SATURDAY || diaSemana == DayOfWeek.SUNDAY) {
            System.out.println("A data cai em final de semana!");
        } else {
            System.out.println("A data cai na semana útil!");
        }
    }
}
