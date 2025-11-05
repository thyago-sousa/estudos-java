package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas1 = new double [10];
        double[] notas2 = new double [notas1.length];
        double[] resultados = new double [notas1.length];

        double media;

        for(int i=0; i < notas1.length; i++) {
            do {
                System.out.print("Digite a primeira nota do aluno " + (i + 1) + ": ");
                notas1[i] = sc.nextDouble();

                if(notas1[i] < 0 || notas1[i] > 10) {
                    System.out.println("A nota pode ser apenas de 0 até 10\n");
                }
            }
            while(notas1[i] < 0 || notas1[i] > 10);


            do {
                System.out.print("Digite a segunda nota do aluno " + (i + 1) + ": ");
                notas2[i] = sc.nextDouble();

                if(notas2[i] < 0 || notas2[i] > 10) {
                    System.out.println("A nota pode ser apenas de 0 até 10\n");
                }
            }
            while(notas2[i] < 0 || notas2[i] > 10);

            System.out.println();

            media = (notas1[i] + notas2[i]) / 2;

            resultados[i] = media;
        }

        String situacaoAluno;

        for(int i=0; i < notas1.length; i++) {
            if(resultados[i] >= 7) {
                situacaoAluno  = "Aprovado";
            }
            else {
                situacaoAluno  = "Reprovado";
            }

            System.out.println("Nota do aluno " + (i + 1) + ": " + resultados[i] + " - Situação: " + situacaoAluno);
        }

        sc.close();
    }
}
