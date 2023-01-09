package br.com.dio.exercicios.arrays;

/*
Exercício 04: Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

import java.util.Random;

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4]; //O Primeiro [] é a linha e o segundo par representa a coluna.

        for (int i = 0; i < M.length; i++) {// i representa cada linha.
            for (int j = 0; j < M[i].length; j++) { // j representa cada coluna.
                M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha: M ) {
            for (int coluna: linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();

        }
    }
}
