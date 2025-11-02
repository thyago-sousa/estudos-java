package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];

        int totalPar = 0;
        int totalImpar = 0;

        for(int i=0; i<A.length; i++) {
            System.out.println("Entre com o valor da posição: " + i);
            A[i] = sc.nextInt();

            if(A[i] % 2 == 0) {
                totalPar++;
            }
            else {
                totalImpar++;
            }
        }

        System.out.println("Vetor A");
        for(int i=0; i<A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        double percPar = (totalPar * 100.0) / A.length;
        double percImpar = (totalImpar * 100.0) / A.length;

        System.out.println("Percentual de elementos pares: " + percPar + "%");
        System.out.println("Percentual de elementos impares: " + percImpar + "%");

        sc.close();
    }
}