package Exercicio2;

public class Desconto {
    
    private String nome;
    private double valor;


    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public double getValor() {
        return valor;
    }

    
    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcularDesconto(){
        if(valor > 0){
          return valor-(valor * 0.025);      
        }else return valor;
    }

}