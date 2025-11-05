package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] vetorA = new double[20];
        double cotacao;

        System.out.print("Entre com a cotação do dólar: ");
        cotacao = sc.nextDouble();

        for(int i=0; i<vetorA.length; i++) {
            vetorA[i] = cotacao * (i+1);
        }

        System.out.print("Vetor A = ");
        for(int i=0; i<vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
