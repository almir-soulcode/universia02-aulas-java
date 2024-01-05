package aula_04;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Datas {
    public static void main(String[] args) {
        // LocalDate (dia-mês-ano)
        LocalDate dataAtual = LocalDate.now(); // a data de agora
        System.out.println("Hoje: " + dataAtual);

        // LocalTime (hora-minuto-segundo)
        LocalTime horaAtual = LocalTime.now();
        System.out.println("Hora: " + horaAtual);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String dataFormatada = formatador.format(dataAtual);
        System.out.println(dataFormatada);

        DateTimeFormatter formatador2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(formatador2.format(horaAtual));

        // LocalDateTime (dia-mês-ano + hora-minuto-segundo)
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println(dataHoraAtual);

        DateTimeFormatter formatador3 = DateTimeFormatter.ofPattern("dd/MM, HH:mm");
        System.out.println(formatador3.format(dataHoraAtual));

        // Criando datas, horários
        LocalDate natal = LocalDate.of(2023, 12, 25);
        LocalTime horaAlmoco = LocalTime.of(12, 0, 0);

        System.out.println(formatador.format(natal));
        String data = "2024-01-01"; // formato ISO yyyy-MM-dd

        LocalTime meiaNoite = LocalTime.parse("00:00:00");
        meiaNoite = meiaNoite.plusHours(2);
        meiaNoite = meiaNoite.plusMinutes(45);
        meiaNoite = meiaNoite.minusSeconds(30);
        System.out.println(meiaNoite);

        natal = natal.plusDays(6);
        natal = natal.plusMonths(2);
        natal = natal.plusYears(5);

        System.out.println(natal);

        LocalDate data1 = LocalDate.of(2023, 12, 7);
        LocalDate data2 = data1.plusDays(9);

        if(data2.isAfter(data1)) {
            System.out.println("Data 2 é após a Data 1");
        }

        if(data1.isBefore(data2)) {
            System.out.println("Data 1 é antes da Data 2");
        }

        if(data1.isEqual(data2)) {
            System.out.println("Datas 1 e 2 são iguais!");
        } else {
            System.out.println("São datas diferentes!");
        }

        LocalDate anoNovo = LocalDate.parse(data);
        System.out.println(anoNovo);

        System.out.println(anoNovo.getDayOfMonth()); // dia do mês (int)
        System.out.println(anoNovo.getMonthValue()); // número do mês
        System.out.println(anoNovo.getYear()); // ano (int)
        System.out.println(anoNovo.getDayOfWeek());
    }
}
