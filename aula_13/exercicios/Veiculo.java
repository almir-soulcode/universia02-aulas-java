package aula_13.exercicios;

public class Veiculo {
    private int numeroRodas;
    private String tipoCombustivel;
    private double consumo;
    private double valor;
    private double quilometragem;
    private String marca;
    private String modelo;

    public Veiculo(int numeroRodas, String tipoCombustivel, double consumo, double valor, double quilometragem,
            String marca, String modelo) {
        this.numeroRodas = numeroRodas;
        this.tipoCombustivel = tipoCombustivel;
        this.consumo = consumo;
        this.valor = valor;
        this.quilometragem = quilometragem;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibirInfo() {
        System.out.println("Número de Rodas: " + numeroRodas);
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
        System.out.println("Consumo: " + consumo + " km/l");
        System.out.println("Valor: R$ " + valor);
        System.out.println("Quilometragem: " + quilometragem + " km");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

    public int getNumeroRodas() {
        return numeroRodas;
    }

    public void setNumeroRodas(int numeroRodas) {
        this.numeroRodas = numeroRodas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
