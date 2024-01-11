package aula_13.correcoes;

enum TamanhoPizza {
    P, M, G, GG
}

enum StatusPizza {
    PRONTA, EM_COZIMENTO, PENDENTE, ENTREGUE
}

public class Pizza {
    private TamanhoPizza tamanho;
    private String[] sabores;
    private StatusPizza status;
    private boolean comBorda;

    public Pizza(TamanhoPizza tamanho, String[] sabores, boolean comBorda) {
        this.tamanho = tamanho;
        this.sabores = sabores;
        this.comBorda = comBorda;
        this.status = StatusPizza.PENDENTE;
    }

    // Setter: permite alterar propriedades privadas
    public void setStatus(StatusPizza novoStatus) {
        status = novoStatus;
    }

    public double getPrecoFinal() {
        double preco = 0.0;
        // Sendo que o preço da P = 20, M = 40, G = 60 e GG = 80.
        switch (tamanho) {
            case P:
                preco = 20;
                break;
            case M:
                preco = 40;
                break;
            case G:
                preco = 60;
                break;
            case GG:
                preco = 80;
                break;
        }
        // Para cada sabor adicional na lista de sabores acrescente
        // 5 reais.
        preco += (sabores.length - 1) * 5;

        // Se a pizza tiver borda acrescente 3 reais;
        if (comBorda) {
            preco += 3;
        }

        return preco;
    }
}
