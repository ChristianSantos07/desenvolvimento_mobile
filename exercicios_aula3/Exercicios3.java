/*
  Faça um algoritmo que leia um valor inteiro e retorne se este valor é PAR ou ÍMPAR.
 */
package exercicios3;
import java.util.Scanner;

public class Exercicios3 {
    double n;
    static Scanner ler = new Scanner(System.in);
        
    public static void main(String[] args) {
    System.out.println("digite um número");
    double n = ler.nextDouble();
        double media = n %2;
    
       if (media == 0){
            System.out.println("O número "+ n + " é par");
        }else{
            System.out.println("O número "+ n + " é impar");    
        }
    }
    
}