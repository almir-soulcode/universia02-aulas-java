package aula_13;

import java.time.LocalDate;

public class Carne extends Comida {
    private String categoria;

    public Carne(String nome, float preco, String codigo, LocalDate dataValidade, float qtCalorias, String categoria) {
        super(nome, preco, codigo, dataValidade, qtCalorias);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
