package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite até qual número você quer que a Sequência de Fibonacci vá? ");
        int limite = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Sequência de Fibonacci até " + limite + ":");

        while (a <= limite) {

            System.out.print(a + " ");

            int proximo = a + b;

            a = b;
            b = proximo;
        }
        
        System.out.println();

        sc.close();
    }
}
