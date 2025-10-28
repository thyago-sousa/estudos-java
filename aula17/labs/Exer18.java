package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        boolean primo = true;

        if (num <= 1) {
            primo = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        if(primo) {
            System.out.println(num + " é número primo");
        } else {
            System.out.println(num + " não é primo");
        }

        sc.close();
    }
}
