package aula_07;

public class Metodos {
    // [public = todos podem ver]
    // [static = método da classe]
    // [void = vazio = não tem retorno]
    // dizOla = identificador (nome)
    public static void dizOla() {
        System.out.println("Olá, tudo bem?");
        System.out.println("Um ótimo dia!");
    }

    // Parâmetros = informações fornecidas pelo invocador
    public static void cumprimentar(String nome) {
        System.out.println("Olá, " + nome + ", tudo bem?");
    }

    public static void somar(int a, int b, int c) {
        int resultado = a + b + c;
        System.out.println("A soma dos números é: " + resultado);
    }

    public static double calcularMedia(double n1, double n2, double n3) {
        double media = (n1 + n2 + n3) / 3;
        return media; // Retorno = valor externalizado
    }

    public static void avaliarAluno(String nome, double media) {
        if(media >= 7) {
            System.out.println("O aluno " + nome + " está aprovado. Média: " + media);
        } else {
            System.out.println("O aluno " + nome + " está reprovado. Média: " + media);
        }
    }

    public static void main(String[] args) {
        dizOla(); // invocação do método
        cumprimentar("Victor");
        cumprimentar("Adriano");
        cumprimentar("Gabriel");
        somar(5, 7, 15);
        somar(4, 3, 6);

        // Retorno = para usar o valor salvamos numa variável
            // - calculam algo
            // - acessam dados
            // - geram dados
        double mediaAluno = calcularMedia(7.5, 8.0, 9.1);
        double mediaAluno2 = calcularMedia(4.5, 6.5, 9.0);
        
        avaliarAluno("Victor", mediaAluno);
        avaliarAluno("Almir", mediaAluno2);
    }
}
