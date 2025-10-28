package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas notas você quer calcular a média: ");
        int qtdNotas = sc.nextInt();
        double somaNotas = 0;
        double media;

        for(int i=1; i <= qtdNotas; i++) {
            System.out.print("Digite a " + i + "° nota: ");
            double notaAtual = sc.nextDouble();

            somaNotas += notaAtual;

        }

        media = somaNotas / qtdNotas;

        System.out.println("Soma total das notas: " + somaNotas);
        System.out.println("A media das " + qtdNotas + " é igual à: " + media);
    }
}
