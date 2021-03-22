package Biblioteca;

public class Cliente {
    private String nome;
    private int idade;    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Cliente() {
    }
    
    @Override
    public String toString() {
        return "Cadastro realizado com sucesso " + "\n" +
                "Seu nome: " + this.nome + "\n" +
                "Sua idade: " + this.idade;
    }
}
