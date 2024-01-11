package aula_13.exercicios;

public class Testes {
    public static void main(String[] args) {
        System.out.println("-".repeat(32)); // Linha no terminal

        Veiculo veiculo1 = new Veiculo(3, "Querosene", 0.2, 5000000.0, 0.0, "Boeing", "747");

        veiculo1.exibirInfo();

        System.out.println("-".repeat(32)); // Linha no terminal

        Carro c1 = new Carro(4, "Gasolina", 12.5, 50000.0, 0.0, "Toyota", "Corolla", 4);

        c1.exibirInfo();

        System.out.println("-".repeat(32)); // Linha no terminal

        Moto moto = new Moto(2, "Gasolina", 20.0, 30000.0, 0.0, "Honda", "CBR", "Disco");

        moto.exibirInfo();

    }
}
