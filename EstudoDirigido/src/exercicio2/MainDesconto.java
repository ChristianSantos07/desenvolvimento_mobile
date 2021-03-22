package Exercicio2;

import java.util.Scanner;

public class MainDesconto {
  
    String nome;
    double valor = 0;
  
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        Desconto des = new Desconto();
        System.out.println("Digite o nome do Produto: ");
        des.setNome(ler.nextLine());

        System.out.println("Digite o valor do Produto: ");
        des.setValor(ler.nextDouble());
        
        System.out.println("Voce esta comprando o produto: "+ des.getNome());
        System.out.println("Com 2,5% de desconto que vai ficar o alor de: R$  "+ des.calcularDesconto());
       
    
    }    

}