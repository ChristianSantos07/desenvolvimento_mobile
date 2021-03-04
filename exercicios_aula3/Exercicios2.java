/*
  Faça um algoritmo que leia dois valores reais e informe se estes valores são iguais ou diferentes.
 */
package exercicios3;
import java.util.Scanner;

public class Exercicios2 { 
    double n1, n2;
    static Scanner ler = new Scanner(System.in);
        
    public static void main(String[] args) {
    System.out.println("digite um número");
    double n1 = ler.nextDouble();
    
    System.out.println("digite um número");
    double n2 = ler.nextDouble();
        
        if (n1 == n2){
            System.out.println("Os números são iguais");
        }else{
            System.out.println("Os números são diferentes");
            
        }
    }
    
}
