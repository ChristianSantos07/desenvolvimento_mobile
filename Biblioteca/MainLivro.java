package Biblioteca;

import java.util.Scanner;

public class MainLivro {

   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Livro l1 = new Livro();
        Cliente c1 = new Cliente();
       
        System.out.println("Digite o nome do cliente: ");
        c1.setNome(ler.nextLine());
        System.out.println("Digite a idade do cliente: ");
        c1.setIdade(ler.nextInt());
        
        System.out.println(c1);
       
        System.out.println("Digite o nome do livro: ");
        l1.setNome(ler.nextLine());
        System.out.println("Digite o genero do livro: ");
        l1.setGenero(ler.nextLine());
        System.out.println("Digite o valor do livro: ");
        l1.setValor(ler.nextDouble());
        
        System.out.println(l1);
        
       
        
    }
    
}
