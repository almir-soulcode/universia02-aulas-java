package pacote;

import aula_07.exercicios.Exercicio1;
import aula_07.exercicios.Exercicio2;
import aula_07.exercicios.Exercicio3;
import aula_07.exercicios.Exercicio4;
import aula_07.exercicios.Exercicio5;

public class ExerciciosAula07 {
    public static void main(String[] args) {

        // Exercício 1
        double resultado1 = Exercicio1.multiplicar(4, 5);
        double resultado2 = Exercicio1.soma(2, 3);
        double resultado3 = Exercicio1.subtracao(4, 3);

        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);

        // Exercício 2

        double tempF = Exercicio2.celsiusParaFahrenheit(36);
        double tempC = Exercicio2.fahrenheitParaCelsius(tempF);

        System.out.println(tempC);
        System.out.println(tempF);

        // Exercício 3
        System.out.println(Exercicio3.contarVogais("ARARA"));
        System.out.println(Exercicio3.inverterString("BATATA"));
        System.out.println(Exercicio3.isPalindromo("ARARA"));

        // Exercício 4
        System.out.println(Exercicio4.realParaDolar(4.88, 300));

        // Exercício 5
        int[] vetor = {1, 45, 88, 0, -99, 5500};
        System.out.println("Máximo: " + Exercicio5.maximoVetor(vetor));
        System.out.println("Mínimo: " + Exercicio5.minimoVetor(vetor));
    }
}
