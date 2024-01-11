package aula_13;

import java.time.LocalDate;

public class Testes {
    public static void main(String[] args) {
        // Objeto muito genérico
        Produto p1 = new Produto("Batata", 15.0f, "p-101");
        System.out.println(p1.getCodigo());
        System.out.println(p1.getPreco());
        System.out.println(p1.getNome());

        // Instância da subclasse
        Livro l1 = new Livro("O Hobbit", 35.0f, "p-102", 331, "J.R.R Tolkien");
        System.out.println(l1.getCodigo());
        System.out.println(l1.getPreco());
        System.out.println(l1.getNome());
        System.out.println(l1.getNumPaginas());
        System.out.println(l1.getAutor());

        Comida c1 = new Comida("Tapioca", 5.0f, "p-103", LocalDate.of(2024, 1, 13), 400.0f);
        System.out.println(c1.getNome());
        System.out.println(c1.getPreco());
        System.out.println(c1.getCodigo());
        System.out.println(c1.getQtCalorias());
        System.out.println(c1.getDataValidade());

        Carne carne1 = new Carne("Picanha", 60.0f, "p-104", LocalDate.of(2024, 4, 15), 1500.0f, "Bovina");

        System.out.println(carne1.getNome());
        System.out.println(carne1.getPreco());
        System.out.println(carne1.getCodigo());
        System.out.println(carne1.getQtCalorias());
        System.out.println(carne1.getDataValidade());
        System.out.println(carne1.getCategoria());
    }
}
