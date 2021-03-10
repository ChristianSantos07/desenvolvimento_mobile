package Escolha;
import java.util.Scanner;

public class DigiteVogal {
    public static void main(String[] args) {
        char vogal;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma vogal: ");
        vogal = entrada.nextLine().charAt(0);
               
        switch( vogal )
        {
            case 'a':
                System.out.println("Você escolheu a vogal 'a'");
            case 'e':
                System.out.println("Você escolheu a vogal 'e'");
            case 'i':
                System.out.println("Você escolheu a vogal 'i'");
            case 'o':
                System.out.println("Você escolheu a vogal 'o'");
            case 'u':
                System.out.println("Você escolheu a vogal 'u'");
        
            default:
                System.out.println("fim '-'");        
            
        }
        

    }
}
    
