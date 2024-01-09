package aula_09.exercicios;

public class Veiculo {
    boolean ligado;
    int ano;
    String marca; 
    double kmRodados;
    double consumo; // km/L
    double tanqueAtual;

    public void ligar() {
        System.out.println("Ligando o veículo...");
        ligado = true;
    }

    public void desligar() {
        System.out.println("Desligando o veículo...");
        ligado = false;
    }

    public void viajar(double distancia) {
        double litrosGastos = distancia / consumo;
        
        // Atualizamos o status do Veiculo
        // BUG: Checar se o combustível no tanque
        // dá para a viagem
        tanqueAtual -= litrosGastos;
        kmRodados += distancia;
    }

    public void revisao() {
        consumo = consumo + consumo * 0.10;
    }

    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        v1.ano = 2023;
        v1.marca = "Fiat";
        v1.kmRodados = 0;
        v1.tanqueAtual = 90;
        v1.consumo = 30; // 30 km com 1L

        v1.ligar();
        v1.viajar(60);

        System.out.println("Tanque atual: " + v1.tanqueAtual);
        System.out.println("KM Rodados: " + v1.kmRodados);

        v1.revisao();
        System.out.println("Consumo atual: " + v1.consumo);
    }
}
