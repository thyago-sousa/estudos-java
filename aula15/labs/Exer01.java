package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite um número: ");
        double num2 = sc.nextDouble();

        if(num1 > num2) {
            System.out.println(num1 + " é o maior");
        }
        else if (num1 < num2) {
            System.out.println(num2 + "é o maior");
        }
        else{
            System.out.println("Os números são iguais");
        }

        sc.close();
    }
}
