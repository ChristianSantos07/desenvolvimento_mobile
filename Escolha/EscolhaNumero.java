package Escolha;
import java.util.Scanner;

public class EscolhaNumero {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um número entre 1 e 4:");
        int n1;
        n1 = ler.nextInt();
       
        switch (n1) {
            case 1:
                System.out.println("Você escolheu 1");
                break;
            case 2:
                System.out.println("Você escolheu 2");
                break;
            case 3:
                System.out.println("Você escolheu o 3");
                break;
            case 4:
                System.out.println("Você escolheu o 4");
                break;
            default:
                System.out.println("Ops!!! esse número é diferente");
        }    
        
        
    }
    
}
