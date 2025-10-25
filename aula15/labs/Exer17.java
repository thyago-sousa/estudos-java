package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer17 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe algum ano: ");
        int ano = sc.nextInt();

        if (ano % 100 == 0) {
            if (ano % 400 == 0) {
                System.out.println(ano + " é um ano bissexto");
            }
            else {
                System.out.println(ano + " não é um ano bissexto");
            }
        }
        else {
            if (ano % 4 == 0) {
                System.out.println(ano + " é um ano bissexto");
            }
            else {
                System.out.println(ano + " não é um ano bissexto");
            }
        }
        sc.close();
    }
}
