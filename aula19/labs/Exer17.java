package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];

        int somaIdades = 0;
        for(int i=0; i<A.length; i++) {
            System.out.print("Digite a idade da pessoa: ");
            A[i] = sc.nextInt();

            if(A[i] > 35) {
                somaIdades++;
            }
        }

        System.out.println("Vetor A");
        for(int i=0; i<A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println("Quantidade de pessoas que possuiem idade superior a 35 anos: " + somaIdades);

        sc.close();

    }
}
