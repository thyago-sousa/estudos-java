package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor de a: ");
        double a = sc.nextDouble();
        System.out.print("Informe o valor de b: ");
        double b = sc.nextDouble();
        System.out.print("Informe o valor de c: ");
        double c = sc.nextDouble();

        double calculo = Math.pow(a, 2) + b + c;
        double calculoDelta = Math.pow(b, 2) - 4 * a * c;
        double bhaskara1 = (-b + Math.sqrt(calculoDelta)) / (2 * a);
        double bhaskara2 = (-b - Math.sqrt(calculoDelta)) / (2 * a);

        if (a == 0) {
            System.out.println("O valor de a não pode ser zero.");
        }
        else if (calculoDelta < 0) {
            System.out.println("A equação não possui raízes");
        }
        else if (calculoDelta == 0) {
            System.out.println("Delta: " + calculoDelta);
            System.out.println("X: " + bhaskara1);
        }
        else {
            System.out.println("Delta: " + calculoDelta);
            System.out.println("X1: " + bhaskara1);
            System.out.println("X2: " + bhaskara2);
        }

        sc.close();
    }
}
