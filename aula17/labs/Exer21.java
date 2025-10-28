package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número de turmas: ");
        int qtdTurmas = sc.nextInt();

        int somaAlunos = 0;
        double media;

        if (qtdTurmas > 0) {

            for(int i = 1; i <= qtdTurmas; i++) {

                int alunosAtual;

                do {
                    System.out.print("Digite a quantidade de alunos da " + i + "° turma: ");
                    alunosAtual = sc.nextInt();

                    if (alunosAtual > 40) {
                        System.out.println("Valor inválido! A turma não pode ter mais que 40 alunos. Tente novamente.");
                    }
                } while (alunosAtual > 40); // 6. Condição de REPETIÇÃO

                somaAlunos += alunosAtual;

            }
            media = (double)somaAlunos / qtdTurmas;

            System.out.println("A media de alunos por turma é igual a: " + media);

        } else {
            System.out.println("Número de turmas inválido.");
        }

        sc.close();
    }
}
