package aula_07;

// Quando as classes estão no mesmo PACOTE
// não precisamos usar import;


// Import de um pacote dentro de outro pacote
import aula_07.interno.Teste;

public class Testes {
    public static void main(String[] args) {
        Metodos.dizOla();
        Metodos.cumprimentar("João");
    }
}
