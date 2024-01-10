package aula_11;

import java.time.DayOfWeek;

public class Testes {
    public static void main(String[] args) {
        // Para usar um valor de enum,
        // faça Enum.VALOR
        NivelDev nv = NivelDev.JUNIOR;

        Desenvolvedor dev1 = new Desenvolvedor("Gabriel Vieira", "gabriel.vieira@dev.com", 9000, true, NivelDev.JUNIOR);

        dev1.pedirAumento();
        dev1.pedirAumento();
        dev1.pedirAumento();
        System.out.println(dev1.salario);

        dev1.nivel = NivelDev.PLENO;
        dev1.pedirAumento();

        System.out.println(dev1.salario);

        DayOfWeek diaSemana = DayOfWeek.WEDNESDAY;

        switch(diaSemana) {
            case FRIDAY:
                break;
            case MONDAY:
                break;
            case SATURDAY:
                break;
            case SUNDAY:
                break;
            case THURSDAY:
                break;
            case TUESDAY:
                break;
            case WEDNESDAY:
                break;
        }
    }
}
