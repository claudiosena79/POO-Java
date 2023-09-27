package edu.exercicios;

import java.util.Scanner;

public class Exercicio011 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numero1 = leitor.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = leitor.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int numero3 = leitor.nextInt();

    }

    public static int acharMenor(int numero1, int numero2, int numero3){
        int numero = 0;
        if (numero1 > numero2){
            numero = numero1;
            numero1 = numero2;
            numero2 = numero;
        }
        ifelse (numero)

    }
}
