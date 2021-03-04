/* 
Criar um programa ondeo  usuário que digite o valor do raio de
uma circunferência. E o programa retorna o valor do diâmetro e de
1 quadrante desta circunferência.
 */

import java.util.Scanner;
public class exercicio2
{
    
    int a;

    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Digite o valor do raio: ");
        int a = ler.nextInt();
        
        System.out.println("O valor do diametro é: "+ a*2);
        System.out.println("O valor de 1 quadrante da circunferência é: "+ a/2);
    }
    
}
