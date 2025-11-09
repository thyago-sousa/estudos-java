package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];

        for(int i = 0; i < A.length; i++) {
            System.out.println("Entre com o valor da posição " + i + ": ");
            A[i] = sc.nextInt();
        }

        System.out.println("\n--- Verificando os números ---");

        for (int i=0; i < A.length; i++){

            boolean ehPrimo = true;

            if (A[i] <= 1) {
                ehPrimo = false;
            } else {
                for (int j = 2; j <= A[i] / 2; j++) {
                    if (A[i] % j == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
            }

            if (ehPrimo) {
                System.out.println(A[i] + " é um número PRIMO.");
            } else {
                System.out.println(A[i] + " NÃO é um número primo.");
            }
        }
    }
}