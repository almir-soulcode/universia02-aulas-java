package aula_04;

public class Textos {
    public static void main(String[] args) {
        // String => não é um tipo primitivo
        // String => objetos de texto
        // String => imutáveis
        char[] palavra = {'J', 'A', 'V', 'A'}; // representação antiga
        String java = "Java";
        // J(0), a(1), v(2), a(3)
        System.out.println(java.length()); // tamanho do texto
        System.out.println(java.toUpperCase()); // letras maiusculas
        System.out.println(java.toLowerCase()); // letras minúsculas
        System.out.println(java.charAt(1)); // java[1]
        System.out.println(java.indexOf("jlsabndlasbdiu")); // busca letra na string, -1 caso não encontre
        System.out.println(java.lastIndexOf("a")); // busca do final p/ começo
        System.out.println(java.replace("v", "xo")); // substitui um texto por outro
        System.out.println(java.replaceAll("a", "i")); // substitui um texto por outro
        
        String arquivo = "musica_legal.mp3";

        if(arquivo.endsWith(".mp3")) { // true ou false
            System.out.println("O arquivo é mp3!");
        }

        if(arquivo.startsWith("musica")) {
            System.out.println("Arquivo da minha playlist!");
        }

        // String é um objeto de texto (comparação)
        // ==, != -> apenas para primitivos
        // equals -> forma adequada de comparar objetos

        String nome1 = "Victor";
        String nome2 = "victor";

        if(nome1.equals(nome2)) { // comparação entre strings
            System.out.println("São iguais!");
        } else {
            System.out.println("São diferentes!");
        }

        if(nome1.equalsIgnoreCase(nome2)) {
            System.out.println("São iguais! Ignorando maiusculas e minusculas!");
        }
    }
}
