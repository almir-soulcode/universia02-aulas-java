package aula_07.exercicios;

// Crie métodos para converter temperaturas de Celsius para 
// Fahrenheit e vice-versa;

public class Exercicio2 {
    public static double celsiusParaFahrenheit(double c) {
        return c * 1.8 + 32;
    }

    public static double fahrenheitParaCelsius(double f) {
        return (f - 32) / 1.8;
    }
}
