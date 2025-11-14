package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] M = new int[3][3];
        System.out.println("Digite os valores da matriz 3x3:");

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                M[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nMatriz digitada:");
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print(M[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}