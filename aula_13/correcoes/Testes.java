package aula_13.correcoes;

public class Testes {
    public static void main(String[] args) {
        String[] saboresPizza = {"queijo", "calabresa", "pepperoni", "abacaxi"};
        Pizza p1 = new Pizza(TamanhoPizza.GG, saboresPizza, false);
        p1.setStatus(StatusPizza.EM_COZIMENTO);

        double precoCalculado = p1.getPrecoFinal();
        System.out.println(precoCalculado);

        System.out.println("-------------------------");

        Sistema s1 = new Sistema();
        s1.setStatus(StatusSistema.EXECUCAO);
        s1.notificar();

        // O valor padrão em variáveis de objeto é null
        Sistema s2 = null;
        // NullPointerException = erro de nulo
        if(s2 != null) { // Garantir que não haverá erros
            s2.notificar();
        }
    }
}
