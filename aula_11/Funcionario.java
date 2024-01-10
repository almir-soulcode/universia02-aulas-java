package aula_11;

public class Funcionario {
    public String nome;
    public String cpf;
    public String telefone;
    // Atributo é visível/acessável apenas dentro da classe Funcionario
    private double salario;

    public Funcionario(String nome, String cpf, String telefone, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.salario = salario;
    }

    public void cumprimentar() {
        System.out.println("Olá, me chamo " + nome + " e recebo " + salario);
    }

    public void addBonificacao(double valor) {
        // REGRA: Não recebe bonificação quem já possui acima
        // de 5000 reais. O limite de bonificação é até 100.
        if (salario >= 5000) {
            System.out.println("Já está no teto máximo.");
        } else {
            if (valor <= 100) {
                salario += valor;
                System.out.println("Novo salário: " + salario);
            } else {
                System.out.println("Acréscimo inválido!");
            }
        }
    }
}
