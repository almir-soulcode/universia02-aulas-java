package aula_13;

import java.time.LocalDate;

public class Comida extends Produto {
    private LocalDate dataValidade;
    private float qtCalorias;

    public Comida(String nome, float preco, String codigo, LocalDate dataValidade, float qtCalorias) {
        super(nome, preco, codigo);
        this.dataValidade = dataValidade;
        this.qtCalorias = qtCalorias;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public float getQtCalorias() {
        return qtCalorias;
    }

    public void setQtCalorias(float qtCalorias) {
        this.qtCalorias = qtCalorias;
    }
}
