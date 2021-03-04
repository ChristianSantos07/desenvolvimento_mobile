/*
 Faça um programa que leia uma variável real "A" digitada pelo usuário
e apresente o resultado dos seguintes cálculos:
- o dobro de "A"
- o triplo do dobro de "A"
- a metade do triplo do dobro de "A"
- o quadrado da variável "A"
- a quinta parte do dobro de "A"
 */

import java.util.Scanner;
public class Exercicio3 
{
    int a;
    
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Escolha o valor da várial A: ");
        int x = ler.nextInt();
        
        System.out.println("O dobro de A é "+ (a*2));
        System.out.println("O triplo do dobro de A é "+ ((a*2)*3));
        System.out.println("A metade do triplo do dobro de A é "+ (((a*2)*3)/2));
        System.out.println("O quadrado da variável A é "+ (a*a));
        System.out.println("A quinta parte do dobro de A é "+ ((a*2)/5));
        
    }
    
}
