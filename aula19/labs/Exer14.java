package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];

        int somaElementos = 0;
        int impar = 0;
        for(int i=0; i<A.length; i++) {
            System.out.println("Entre com o valor da posição " + i);
            A[i] = sc.nextInt();

            if(A[i] % 2 != 0) {
                somaElementos += A[i];
                impar++;
            }
        }

        int media = somaElementos / impar;

        System.out.println("Vetor A");
        for(int i=0; i<A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println("Soma dos elementos impares do vetor: " + somaElementos);
        System.out.println("Média dos elementos impares do vetor: " + media);

        sc.close();
    }
}
