package edu.exercicios;

import java.util.Scanner;

// Crie um metodo para contar as vogais de uma palavra
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a palavra");
        String palavra = leitor.nextLine();

        contadorVogais(palavra);        

        System.out.println("O numero de vogais é " + contadorVogais(palavra) + "\n");
        leitor.close();
    }
    public static int contadorVogais(String palavra){
        int contador = 0;
        for (int i = 0; i < palavra.length(); i++){
            if (palavra.charAt(i) == 'a'|| palavra.charAt(i)=='e'|| palavra.charAt(i)=='i'
            || palavra.charAt(i)=='o'|| palavra.charAt(i)=='u'|| palavra.charAt(i) == 'A'||
             palavra.charAt(i)=='E'|| palavra.charAt(i)=='I'
            || palavra.charAt(i)=='O'|| palavra.charAt(i)=='U')
            contador++;            
        }
        return contador;    
    }
}
