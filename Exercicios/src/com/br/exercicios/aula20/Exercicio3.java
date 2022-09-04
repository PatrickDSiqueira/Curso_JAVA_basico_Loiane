// 3. Capture do teclado valores para preenchimento de uma matriz M 3x3. Após a captura imprima a matriz criada e encontre a quantidade de números pares, a quantidade de números ímpares

package com.br.exercicios.aula20;

import java.util.Random;
// import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        // Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random();
        int matriz[][] = new int [3][3], qtdPares = 0, qtdImpar = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = aleatorio.nextInt(10);
                if ((matriz[i][j] % 2) == 0) {
                    qtdPares ++;
                }else{
                    qtdImpar ++;}
            }
        }

        System.out.println("A quantidade de numeros pares é : " +qtdPares+ ", e a quantidade de numeros impares é "+ qtdImpar );
    }
}
