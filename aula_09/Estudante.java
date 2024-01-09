package aula_09;

// Usamos as classes para representar os objetos
// Por meio dela geramos as instâncias
public class Estudante {
    // Atributos = características
    String nome;
    int idade;
    String serie;
    boolean emAula;

    // Métodos = comportamento
    // Dentros dos métodos podemos acessar os atributos
    public void seApresentar() {
        System.out.println(nome + ": " + "Olá, me chamo " + nome);
        System.out.println(nome + ": " + "Tenho " + idade + " anos.");
        System.out.println(nome + ": " + "Estou no " + serie);
    }

    public void estudar(String disciplina) {
        emAula = true; // o aluno está em aula agora
        System.out.println(nome + ": " + "Estou estudando " + disciplina);
    }

    public void fazerProva(String disciplina) {
        // Regra: o aluno só vai fazer prova se
        // ele estiver em aula

        if (emAula == true) {
            System.out.println(nome + ": " + "Hora da prova de " + disciplina + "!");
        } else {
            System.out.println(nome + ": " + "Não estou em aula no momento!");
        }
    }
}
