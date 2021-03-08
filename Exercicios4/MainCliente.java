/*

 */
package Exercicios4;
import java.util.Scanner;

public class MainCliente {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cliente x = new Cliente();
        
        
        System.out.println("Nome do Cliente: ");
        x.setNome(ler.nextLine());
        
        System.out.println("Digite a idade do cliente: ");
        x.setIdade(ler.nextInt());
        
        System.out.println("Digite a renda do cliente: ");
        x.setRenda(ler.nextDouble());
        
       
        
        System.out.println(x.getNome());
        System.out.println(x.getIdade());
        System.out.println(x.getRenda());
        System.out.println("Consultando o cliente");
        System.out.println(x.classificarRenda());
        System.out.println(x.classificarIdade());       
        
    }
    
}
