package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[A.length];
        int[] C = new int[A.length];

        for(int i=0; i<A.length; i++) {
            System.out.println("Entre com o valor do Vetor A da posição: " + i);
            A[i] = sc.nextInt();
        }

        for(int i=0; i<B.length; i++) {
            System.out.println("Entre com o valor do Vetor B da posição: " + i);
            B[i] = sc.nextInt();
        }

        for(int i=0; i<C.length; i++) {
            C[i] = A[i] * B[i];
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

        System.out.println("Vetor C");
        for(int i=0; i<C.length; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println();
    }
}
