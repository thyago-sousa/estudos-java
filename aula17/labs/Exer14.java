package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int par = 0;
        int impar = 0;

        for (int i = 1 ;i <= 10; i++) {
            System.out.print("Digite o " + i + "° número: ");
            num = sc.nextInt();

            if (num % 2 == 0) {
                par++;
            }
            else{
                impar++;
            }
        }

        System.out.println("\nQuantidade de números pares: " + par);
        System.out.println("Quantidade de números impares: " + impar);

        sc.close();
    }
}
