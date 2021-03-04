/* 
Criar um programa onde é solicitado a digitação do nome do aluno mais 3 notas.
O programa deverá retornar o nome e clacular a média aritmética deste aluno.
nota1 + nota2 + nota 3 / 3.
*/

 import java.util.Scanner;
public class Exercicio1
{
String nome;
int n1, n2, n3;

 static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Digite o nome do aluno: ");
        String nome = ler.nextLine();
        
        System.out.println("Digite a nota N1: ");
        int n1 = ler.nextInt();
        
         System.out.println("Digite a nota N2: ");
        int n2 = ler.nextInt();
        
         System.out.println("Digite a nota N3: ");
        int n3 = ler.nextInt();
        
        System.out.println("O aluno "+ nome+ "tem a média de: "+ ((n1 + n2+ n3)/3));
    }
    
}
