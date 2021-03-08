/*
 Classe (normal)
Criar uma classe "Cliente" com as seguintes informações:
Atributos:
Nome (de tipo String)
Idade (de tipo int)
renda (de tipo double)
Métodos:
getNome (método acessor)
setNome (método acessor)
getIdade (método acessor)
setIdade (método acessor)
getRenda (método acessor)
setRenda (método acessor)
classificarIdade (com retorno String informando se o cliente é maior de idade ou não)
classificarRenda (com retorno String informando se o cliente é rico (renda superior a 15000) ou não).
 */
package Exercicios4;

public class Cliente {

    private String nome;
    private int idade;
    private double renda;

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
    public double getRenda() {
        return renda;
    }
    public void setRenda(double renda) {
        this.renda = renda;
    }

    public String classificarIdade() {
        String resultado;
        if (this.idade <= 18) {
            resultado = "Cliente é menor de idade";
        } else {
            resultado = "Cliente é maior de idade";
        }
        return resultado;
    }

    public String classificarRenda() {
        String valor;
        if (this.renda > 15000) {
            valor = "Cliente é Pobre";
        } else {
            valor = "Cliente é Rico";
        }
        return valor;
    }

}
