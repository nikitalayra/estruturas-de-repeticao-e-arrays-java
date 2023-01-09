package br.com.dio.exercicios.loops;

/*
Exercício 03: Faça um programa que leia 5 números
e informe o maior número e a média desses números.
*/

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma= 0;

        int count = 0; //usar essa variavel para dizer quantas vezes o laço vai se repetir.
        do {
            System.out.println("Digite o numero: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero; //se o numero inserido for maior que a variavel numero, ambas terão o mesmo valor.

            count++;
        } while (count < 5); //contador (count) deve ser menor do que 5

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));
    }
}
