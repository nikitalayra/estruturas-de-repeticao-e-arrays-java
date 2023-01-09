package br.com.dio.exercicios.loops;

/*
Exercício 04: Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        System.out.println("Quantidade de números: ");
        quantidadeNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número:");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantidadePares++;//se um numero for dividido por 2 e o resultado for 0, é par.
            else quantidadeImpares++;

            count++;
        } while (count < quantidadeNumeros);

        System.out.println("Quantidade pares: " + quantidadePares);
        System.out.println("Quantidade impares: " + quantidadeImpares);

    }
}
