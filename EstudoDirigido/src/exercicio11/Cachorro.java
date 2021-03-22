package Exercicio11;

public class Cachorro {
    private String corPelo;
    private String especie; 

  
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString(){
        return  "A cor do pelo do cachorro é: " + this.corPelo + "\n" + 
                "A Espécie do cachorro é: " + this.especie;
    }


}