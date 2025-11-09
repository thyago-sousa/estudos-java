package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[5];

        for(int i=0; i<A.length; i++) {
            System.out.print("Digite o " + (i + 1) + "° número que você quer a tabuada: ");
            A[i] = sc.nextInt();
        }

        System.out.println();

        for(int i = 0; i<A.length; i++){
            System.out.println("Tabuada do número: " + A[i]);

            for(int j = 1; j<=10; j++) {
                System.out.println(A[i] + " X " + j + " = " + A[i] * j);
            }

            System.out.println();
        }

        sc.close();
    }
}
