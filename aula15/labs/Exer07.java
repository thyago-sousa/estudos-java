package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double num3 = sc.nextDouble();

        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.println(num1 + " é o maior número e " + num3 + " é o menor número");
            }
            else {
                System.out.println(num1 + " é o maior número e " + num2 + " é o menor número");
            }
        }
        else if (num2 >= num3) {
            if (num1 >= num3) {
                System.out.println(num2 + " é o maior número e " + num3 + " é o menor número");
            }
            else {
                System.out.println(num2 + " é o maior número e " + num1 + " é o menor número");
            }
        }
        else {
            if (num2 >= num1) {
                System.out.println(num3 + " é o maior número e " + num1 + " é o menor número");
            }
            else {
                System.out.println(num3 + " é o maior número e " + num2 + " é o menor número");
            }
        }

        sc.close();

    }
}
