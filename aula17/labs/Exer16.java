package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer16 {
    public static void main(String[] args) {
        int limite = 500;

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
    }
}
