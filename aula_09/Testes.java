package aula_09;

public class Testes {
    public static void main(String[] args) {
        // Criar um objeto a partir da classe
        // Operador new = gera o objeto
        Estudante e1 = new Estudante();
        // Acessando atributos do objeto (usamos o .)
        e1.nome = "Ana";
        e1.idade = 8;
        e1.serie = "3º Ano";
        e1.emAula = false;

        // O método será executado com base no objeto que
        // chamou o método
        // e1.seApresentar();
        
        Estudante e2 = new Estudante();
        e2.nome = "Alvin";
        e2.idade = 11;
        e2.serie = "5º Ano";
        e2.emAula = true;

        // e2.seApresentar();
        // e2.idade++;
        // e2.seApresentar();
        
        // e2.estudar("Geografia");
        e2.estudar("Matemática");
        e2.fazerProva("Matemática");

        e1.fazerProva("Geografia");
    }
}
