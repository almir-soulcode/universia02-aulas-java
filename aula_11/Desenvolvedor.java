package aula_11;

public class Desenvolvedor {
    // Atributos
    public String nome;
    public String email;
    public double salario;
    public boolean estaEmpregado;
    public NivelDev nivel;

    // Construtor
    public Desenvolvedor(String nome, String email, double salario, boolean estaEmpregado, NivelDev nivel) {
        this.nome = nome;
        this.email = email;
        this.salario = salario;
        this.estaEmpregado = estaEmpregado;
        this.nivel = nivel;
    }

    // Podemos ainda criar objetos sem passar propriedades
    // como antes
    public Desenvolvedor() {
    }

    // Métodos
    public void pedirAumento() {
        switch(nivel) {
            case JUNIOR:
                salario += 150;
                break;
            case PLENO:
                salario += 250;
                break;
            case SENIOR:
                salario += 500;
                break;
        }
    }
}

// O tipo 'NivelDev' aceita apenas os valores listados
enum NivelDev {
    JUNIOR, // 0
    PLENO, // 1
    SENIOR // 2
}
