package aula_07.exercicios;

// Crie um método para converter valores entre diferentes 
// moedas (por exemplo, Real para Dólar). O método deve 
// receber a cotação atual e o valor para conversão;

public class Exercicio4 {
    public static double realParaDolar(double cotacao, double valorReais) {
        double valorDolares = valorReais / cotacao;
        return valorDolares;
    }
}
