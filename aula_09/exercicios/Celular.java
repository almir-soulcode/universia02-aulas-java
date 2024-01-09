package aula_09.exercicios;

public class Celular {
    String marca;
    String modelo;
    String ano;
    double porcentagemBateria;

    public void tirarFoto() {
        if (this.porcentagemBateria >= 10) {
            this.porcentagemBateria -= 10;
            System.out.println("Foto tirada. Bateria restante: " + this.porcentagemBateria + "%");
        } else {
            System.out.println("Bateria insuficiente para tirar foto");
        }
    }

    public void recarregar() {
        this.porcentagemBateria = 100;
        System.out.println("Celular recarregado. Bateria atual: " + this.porcentagemBateria + "%");
    }

    public void rodarAplicativo(String nomeAplicativo) {
        if (this.porcentagemBateria >= 5) {
            this.porcentagemBateria -= 5;
            System.out.println("Rodando " + nomeAplicativo + ". Bateria restante: " + this.porcentagemBateria + "%");
        } else {
            System.out.println("Bateria insuficiente para rodar " + nomeAplicativo);
        }
    }

    public static void main(String[] args) {
        Celular meuCelular = new Celular();
        meuCelular.marca = "Samsung";
        meuCelular.modelo = "Galaxy S21";
        meuCelular.ano = "2021";
        meuCelular.porcentagemBateria = 50;

        meuCelular.tirarFoto();
        meuCelular.rodarAplicativo("Instagram");
        meuCelular.recarregar();
        meuCelular.rodarAplicativo("Facebook");
    }
}
