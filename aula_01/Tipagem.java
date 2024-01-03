public class Tipagem {
    public static void main(String[] args) {
        // Tipagem estática = preciso definir o tipo
        // Tipagem forte = não posso mudar o tipo de uma variável

        // Tipos primitivos
        // int -> números inteiros
        // long -> números inteiros (gigantes)
        // float -> número decimal
        // double -> número decimal (dobro de precisão)
        // char -> caracteres
        // String -> sequência de caracteres
        // boolean -> lógico (true, false)

        // <tipo> <nome> = <valor>
        int totalEstoque = 150;
        totalEstoque = 200; // reatribuição

        // L = sufixo para indicar número do tipo long
        long populacaoTerra = 7900000000L;

        double salarioDev = 5500.99; // até 16 casas de precisão

        // F = sufixo para indicar número do tipo float
        float nota = 7.9F; // até 7 casas de precisão

        boolean ativo = false;

        String nome = "José"; // somente as aspas duplas!

        char letra = 'A'; // caracteres únicos

        // Tipagem forte
        int a = 1;
        a = 200;
        // a = "2000"; // não podemos alterar o tipo de uma variável
    }
}
