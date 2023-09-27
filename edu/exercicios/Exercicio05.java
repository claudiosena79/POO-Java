package edu.exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a frase que terá as palavras contadas: ");
        String frase = leitor.nextLine();

        contadorPalavras(frase);

        System.out.println("A frase acima digitada tem " + contadorPalavras(frase) + " palavras");
        leitor.close();

    }

    public static int contadorPalavras(String frase){
        int contador = 0;
        for (int i = 0; i < frase.length(); i++){
            if (frase.charAt(i) == ' ')
            contador++;            
        }
        contador++;
        return contador; 
    }
}
