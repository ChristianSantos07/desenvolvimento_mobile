package Escolha;
import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {
        float n1, n2;
        char resultado;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Qual operação desejas?: [+ - * /]: ");
        resultado = ler.nextLine().charAt(0);
        
        System.out.println("Digite um valor: ");
        n1 = ler.nextFloat();
        System.out.println("Digite outro valor: ");
        n2 = ler.nextFloat();
       
        switch(resultado) 
        {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", n1, n2, n1 + n2);
                break;
            case '-':
                System.out.printf("%.2f - %.2f = %.2f", n1, n2, n1 - n2);
                break;
            case '*':
                System.out.printf("%.2f * %.2f = %.2f", n1, n2, n1 * n2);
                break;
            case '/':
                System.out.printf("%.2f / %.2f = %.2f", n1, n2, n1 / n2);
                break;
            default:
                System.out.printf("operação inválida");
                           
        }     
        
    }
    
}
