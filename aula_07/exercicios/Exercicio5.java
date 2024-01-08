package aula_07.exercicios;

// Crie um método que recebe um vetor de números como 
// parâmetro e indica qual o maior valor e qual o menor valor;

public class Exercicio5 {
    public static int maximoVetor(int[] numeros) {
        int maior = numeros[0];

        for(int num : numeros) {
            if(num > maior) {
                maior = num;
            }
        }

        return maior;
    }

    public static int minimoVetor(int[] numeros) {
        int menor = numeros[0];

        for(int num : numeros) {
            if(num < menor) {
                menor = num;
            }
        }

        return menor;
    }

}
