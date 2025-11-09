package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[A.length];
        int[] C = new int[20];

        for(int i=0; i<A.length; i++) {
            System.out.print("Digite o valor da posição " + i + " do vetor A: ");
            A[i] = sc.nextInt();

            System.out.print("Digite o valor da posição " + i + " do vetor B: ");
            B[i] = sc.nextInt();

            C[i] = A[i];
            C[i + 10] = B[i];
        }

        System.out.println("Vetor A: ");
        for(int i=0; i<A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor B: ");
        for(int i=0; i<B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor C: ");
        for(int i=0; i<C.length; i++) {
            System.out.print(C[i] + " ");
        }

        sc.close();
    }
}
