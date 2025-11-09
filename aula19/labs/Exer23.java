package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];

        for(int i=0; i < A.length; i++) {
            System.out.print("Digite o " + (i+1) + "° número: ");
            A[i] = sc.nextInt();

            if(A[i] % 2 != 0) {
                break;
            }
        }

        sc.close();
    }
}
