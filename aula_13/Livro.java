package aula_13;

public class Livro extends Produto {
    private int numPaginas;
    private String autor;

    public Livro(String nome, float preco, String codigo, int numPaginas, String autor) {
        super(nome, preco, codigo);
        this.numPaginas = numPaginas;
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
