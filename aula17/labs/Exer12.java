package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Você quer a tabuada de qual número: ");
        int num = sc.nextInt();

        int calculo = 0;

        if (num < 1 || num > 10) {
            System.out.println("Você só pode digitar números de 1 à 10");
        }
        else {

            System.out.println("\nTabuada de " + num + ":");

            for (int i = 1; i <= 10; i++) {

                calculo = num * i;
                System.out.println(num + " X " + i + " = " + calculo);
            }
        }

        sc.close();
    }
}
