package aula_13.exercicios;

public class Moto extends Veiculo {
    private String tipoFreio;

    public Moto(int numeroRodas, String tipoCombustivel, double consumo, double valor, double quilometragem,
            String marca, String modelo, String tipoFreio) {
        super(numeroRodas, tipoCombustivel, consumo, valor, quilometragem, marca, modelo);
        this.tipoFreio = tipoFreio;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tipo de freio: " + tipoFreio);
    }

    public String getTipoFreio() {
        return tipoFreio;
    }

    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }
}
