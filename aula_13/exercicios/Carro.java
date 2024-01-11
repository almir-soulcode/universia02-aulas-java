package aula_13.exercicios;

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(int numeroRodas, String tipoCombustivel, double consumo, double valor, double quilometragem,
            String marca, String modelo, int numeroPortas) {
        super(numeroRodas, tipoCombustivel, consumo, valor, quilometragem, marca, modelo);
        this.numeroPortas = numeroPortas;
    }

    // Isto é uma anotação, é uma boa prática usá-la para
    // indicar ao compilador a sobrescrita (não obrigatório)
    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Chamamos o método da classe-pai
        System.out.println("Número de portas: " + numeroPortas);
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}
