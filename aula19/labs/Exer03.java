package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[15];
        int[] B = new int[A.length];

        for(int i=0; i<A.length; i++) {
            System.out.println("Entre com os valores da posição: " + i);
            A[i] = sc.nextInt();
            B[i] = A[i] * A[i];
        }

        System.out.println("Vetor A");
        for(int i=0; i<A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor B");
        for(int i=0; i<B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();

        sc.close();
    }

}
