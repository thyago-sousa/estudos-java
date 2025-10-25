package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a nota entre zero e dez: ");
        double nota = sc.nextDouble();

        while (nota >= 10 || nota < 1) {
            System.out.println("\nVocê não informou uma nota entre zero e dez");

            System.out.print("Informe a nota entre zero e dez: ");
            nota = sc.nextInt();
        }

        System.out.println("A nota informado foi " + nota);

        sc.close();
    }
}
