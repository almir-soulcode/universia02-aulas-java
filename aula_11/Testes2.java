package aula_11;

public class Testes2 {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Victor", "000.000.000-00", "(99) 9-9999-9999", 4500);

        // Acesso direto => modificar e ler a vontade
        // Público => permito modificar sem restrição
        f1.nome = "Victor Icoma";
        // f1.salario = 5000;

        // Private => impedimos o acesso direto
        // não é possível alterar ou ler
        f1.addBonificacao(100);
        f1.addBonificacao(100);        
        f1.addBonificacao(100);        
        f1.addBonificacao(100);        
        f1.addBonificacao(100);        
        f1.addBonificacao(100);
    }
}
