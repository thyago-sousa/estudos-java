package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota do aluno: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a primeira nota do aluno: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2.0;

        if (media == 10.0) {
            System.out.println("Aprovado com distinção");
        }
        else if (media < 7.0) {
            System.out.println("O aluno foi reprovado");
        }
        else if (media >= 7.0) {
            System.out.println("O aluno foi aprovado");
        }

        sc.close();

    }
}
