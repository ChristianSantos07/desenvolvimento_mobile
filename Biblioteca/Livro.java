package Biblioteca;

public class Livro {

    private String nome, genero;
    private double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Livro() {
    }

    @Override
    public String toString() {
        return " Dados do Livro " + "\n"
                + "nome do livro: " + this.nome + "\n"
                + "Genero do livro: " + this.genero + "\n"
                + "Valor do livro: " + this.valor + "\n";
    }

}
