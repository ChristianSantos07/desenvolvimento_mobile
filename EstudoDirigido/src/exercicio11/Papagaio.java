package Exercicio11;

public class Papagaio {
    private String corPena;
    private String especie;
   
    

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

  
    @Override
    public String toString(){
        return  "A cor da pena do papagaio é: " + this.corPena + "\n" +
                "A espécie do papagaio é " + this.especie;
    }
}
