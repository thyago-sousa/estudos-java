package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base: ");
        double base = sc.nextDouble();
        System.out.print("Digite o expoente: ");
        int expoente = sc.nextInt();

        double resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado = resultado * base;
        }

        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}