// 1. Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. Após isso determine o maior número da matriz e a sua posição (linha, coluna).

package com.br.exercicios.aula20;

import java.util.Random;

public class Exercicio1 {
     
    public static void main(String[] args) {

    int matriz [][] = new int [4][4], linhaMaiorNumero = 0, colunaMaiorNumero = 0, maiorNumero = 0;
    Random aleatorio = new Random();

    for (int i = 0; i < matriz.length; i++) {    // linha
        System.out.println();
        for (int j = 0; j < matriz[0].length; j++) { // coluna
            matriz[i][j] = aleatorio.nextInt(10);
            System.out.print(matriz[i][j] + " ");

            }
        }

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[0].length; j++) {
            if (i != 0 && j != 0) {
                if (matriz[i][j] > maiorNumero) {
                    maiorNumero = matriz[i][j];
                    linhaMaiorNumero = i;
                    colunaMaiorNumero = j;
                }
            } 
        }
    }

    System.out.println("\nO maior número dessa matriz é " + maiorNumero + ", e sua coluna é " + colunaMaiorNumero + " e linha " + linhaMaiorNumero + ".");

}


    
}
