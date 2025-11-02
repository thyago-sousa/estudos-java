package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];

        int somaElementos = 0;
        for(int i=0; i<A.length; i++) {
            System.out.println("Entre com o valor da posição " + i);
            A[i] = sc.nextInt();

            if(A[i] % 5 ==0) {
                somaElementos += A[i];
            }
        }

        System.out.println("Vetor A");
        for(int i=0; i<A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println("Soma dos elementos do vetor que são múltiplos de 5: " + somaElementos);

        sc.close();

    }
}
