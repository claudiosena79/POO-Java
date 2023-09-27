package edu.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int numero1 = leitor.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = leitor.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int numero3 = leitor.nextInt();

        calcularMedia(numero1, numero2, numero3);

        System.out.println("O valor da média dos numeros digitados é " + calcularMedia(numero1, numero2, numero3));

        leitor.close();

    }

    public static double calcularMedia(int numero1, int numero2, int numero3) {
        double media = (numero1 + numero2 + numero3) / 3;
        return media;

    }
}