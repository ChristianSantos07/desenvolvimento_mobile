/*
Crie um programa que leia um número inteiro e retorne se o mesmo é positivo ou negativo.
Observação: Para a resolução deste problema considera que o número zero é um valor positivo.
 */
package exercicios3;
import java.util.Scanner;

public class Exercicios01 {
    double n;
    static Scanner ler = new Scanner(System.in);
   
    public static void main(String[] args){
    System.out.println("Digite um número: ");
    double n = ler.nextDouble();
    
        if(n <= 0){
            System.out.println("o número " + n + " é negativo");
        }else{
            System.out.println("o número " + n + " é positivo");
        }
    }
}