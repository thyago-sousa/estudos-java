package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];
        char[] B = new char[A.length];

        for(int i=0; i<A.length; i++) {
            System.out.print("Digite o valor da posição " + i + " do vetor A: ");
            A[i] = sc.nextInt();

            if(A[i] < 7) {
                B[i] = 'a';
            }
            else if (A[i] == 7) {
                B[i] = 'b';
            }
            else if (A[i] > 7 && A[i] < 10) {
                B[i] = 'c';
            }
            else if (A[i] == 10) {
                B[i] = 'd';
            }
            else if (A[i] > 10) {
                B[i] = 'e';
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
        System.out.println();

        sc.close();
    }
}
