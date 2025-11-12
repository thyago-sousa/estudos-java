package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer35
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int [10];

        for(int i=0; i<A.length; i++) {
            System.out.println("Entre com o valor da posição " + i + ": ");
            A[i] = sc.nextInt();

        }

        System.out.println("Vetor-A");

        System.out.println();

        for(int i=0; i < A.length; i++) {
            System.out.println("Número " + A[i]);

            for(int j=1; j <= A[i]; j++) {

                if(A[i] % j == 0){
                    System.out.println(A[i] + " é divisivel por " + j);
                }
            }

            System.out.println();
        }

        sc.close();
    }
}