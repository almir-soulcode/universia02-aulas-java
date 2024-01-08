package aula_07.exercicios;

// Crie método para: contar quantas vogais tem em uma string, 
// inverter uma string e verificar se a palavra é um 
// palíndromo (um palíndromo é uma palavra que inversa se lê igual);

public class Exercicio3 {
    public static int contarVogais(String palavra) {
        int contador = 0;

        for (int i = 0; i < palavra.length(); i++) {
            // Converte char para String
            String letra = String.valueOf(palavra.charAt(i));

            if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
                    || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
                contador++;
            }
        }

        return contador;
    }

    public static String inverterString(String palavra) {
        String palavraInversa = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            // Converte char para String
            String letra = String.valueOf(palavra.charAt(i));
            palavraInversa += letra;
        }

        return palavraInversa;
    }

    public static boolean isPalindromo(String palavra) {
        return inverterString(palavra).equals(palavra);
    }
}
