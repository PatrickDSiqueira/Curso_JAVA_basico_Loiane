// 2. Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9. Após isso indique qual é o maior e o menor valor da linha 5 e qual é o maior e o menor valor da coluna 7.

package com.br.exercicios.aula20;

import java.util.Random;

public class Exercicio2 {
    public static void main(String[]args){

        int matriz[][] = new int [10][10], maiorNumero = 0, menorNumero = 100;
        Random aleatorio = new Random();


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = aleatorio.nextInt(10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    for (int i = 0; i < matriz.length; i++) {

        if(matriz[5][i] > maiorNumero){
            maiorNumero = matriz[5][i];
        }

        if (matriz[5][i] < menorNumero) {
            menorNumero = matriz[5][i];
            System.out.println(menorNumero);
        }   
    }
    System.out.println("o menor numero da linha 5 é "+ menorNumero +" e o maior é "+ maiorNumero);

    maiorNumero = 0; menorNumero = 100;

    for (int i = 0; i < matriz[0].length; i++) {

        if(matriz[i][7] > maiorNumero){
            maiorNumero = matriz[i][7];
        }

        if (matriz[5][i] < menorNumero) {
            menorNumero = matriz[i][7];
            System.out.println(menorNumero);
        }   
    }
    System.out.println("o menor numero da linha 7 é "+ menorNumero +" e o maior é "+ maiorNumero);




        
    }

}
