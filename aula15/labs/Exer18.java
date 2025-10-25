package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro menor que mil: ");

        System.out.println("Entre com um número");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("par");
        } else {
            System.out.println("ímpar");
        }

        sc.close();
    }
}
