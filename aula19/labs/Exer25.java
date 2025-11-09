package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[A.length];

        for(int i=0; i<A.length; i++) {
            System.out.print("Entre com o valor da posição " + i + ": ");
            A[i] = sc.nextInt();

            if(A[i] % 2 == 0) {
                B[i] = 1;
            }
            else {
                B[i] = 0;
            }
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

        sc.close();
    }
}
