package Exercicio11;

import java.util.Scanner;

public class Animal {

    public static void main(String[] args) {
        
        
        Scanner ler = new Scanner(System.in);
        Cachorro ca = new Cachorro();
        Papagaio pa = new Papagaio();
        Mosca mo = new Mosca();
       
        //cachorro
        System.out.println("Digite a cor do Cachorro: ");
        ca.setCorPelo(ler.nextLine());
        
        System.out.println("Digite a espécie do Cachorro: ");
        ca.setEspecie(ler.nextLine());
       
        //papagaio
        System.out.println("Digite a cor da pena do Papagaio: ");
        pa.setCorPena(ler.nextLine());
        
        System.out.println("Digite a espécie do Papagaio: ");
        pa.setEspecie(ler.nextLine());
      
        //mosca
        System.out.println("Digite a cor da mosca: ");
        mo.setCor(ler.nextLine());
        
        System.out.println("Digite a quantidade de patas da mosca: ");
        mo.setQtdPatas(ler.nextInt());
        
        System.out.println("Digite a espécie da mosca: ");
        mo.setEspecie(ler.nextLine());
    
        
        
    }
    
}
