package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Exercício 01: Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
 */
public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //fluxo de entrada através do teclado.

        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break; //O programa PARA quando o 0 é inserido em nome.

            System.out.println("Idade:");
            idade = scan.nextInt();
        }

        System.out.println("Continua aqui...");
    }
}
