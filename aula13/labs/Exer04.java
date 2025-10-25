package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---MEDIA ALUNO---");
        System.out.println("Digite a nota de cada bimestre");
        System.out.print("Primeiro bimestre: ");
        double nota1 = sc.nextDouble();
        System.out.print("Segundo bimestre: ");
        double nota2 = sc.nextDouble();
        System.out.print("Terceiro bimestre: ");
        double nota3 = sc.nextDouble();
        System.out.print("Quarto bimestre: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;

        System.out.println("A média do aluno é: " + media);

        sc.close();
    }
}
