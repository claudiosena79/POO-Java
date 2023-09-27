package edu.exercicios;

import java.util.Scanner;

public class Exercicio06 {
  
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite o número inteiro: ");
    int numero = leitor.nextInt();

    somadorDigitos(numero);

    System.out.println("A soma dos digitos é "+ somadorDigitos(numero));
    leitor.close();
  }
   
    public static int somadorDigitos(int numero){
        int somador = 0;
        while (numero > 0){
            somador += numero % 10;
            numero /= 10;
        }
           return somador;
    }
}  
  
   
 
