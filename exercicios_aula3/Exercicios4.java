/*
 Faça um algoritmo que leia dois valores reais e exiba ao final qual dos dois é o maior.
 */
package exercicios3;
import java.util.Scanner;

public class Exercicios4 {
double n1, n2;
static Scanner ler = new Scanner(System.in);
        
    public static void main(String[] args) {
    System.out.println("digite o primeiro número");
    double n1 = ler.nextDouble();
    
    System.out.println("digite o segundo número");
    double n2 = ler.nextDouble();
    
        
        if (n1 < n2){
            System.out.println("O número "+ n2 +" é maior que o número "+ n1);
        }else if (n1 == n2) {
            System.out.println("Nenhum número é maior, os dois número são iguais");
        }else{
            System.out.println("O número "+ n1 +" é maior que o número "+ n2);
        }
    }
}
    