package Exercicio11;

public class Mosca {
    private String cor;
    private int qtdPatas;
    private String especie;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQtdPatas() {
    return qtdPatas;
    }

    public void setQtdPatas(int qtdPatas) {
        this.qtdPatas = qtdPatas;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    

      
    @Override
    public String toString(){
        return "A cor da mosca é: " + this.cor + "\n"+
               "A idade quantidade de patas da mosca è de : " + this.qtdPatas + "patas" +
               "A especieda msoca é :" + this.especie;
    }
}
