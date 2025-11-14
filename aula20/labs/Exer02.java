package com.loiane.cursojava.aula20.labs;

import java.util.Random;

public class Exer02
{
    public static void main(String[] args) {
        int[][] M = new int[10][10];
        Random random = new Random();
        for(int i=0; i<M.length; i++) {
            for (int j=0; j<M[i].length; j++) {
                M [i][j] = random.nextInt(10);
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
        int maior = M[4][0];
        int menor = maior;

        for (int j = 1; j < M[4].length; j++) {
            if (M[4][j] > maior) {
                maior = M[4][j];
            }
            else if (M[4][j] < menor) {
                menor = M[4][j];
            }
        }
        int maiorColuna = M[0][8];
        int menorColuna = maiorColuna;
        for (int j = 1; j < M.length; j++) {
            if (M[j][8] > maiorColuna) {
                maiorColuna = M[j][8];
            }
            else if (M[j][8] < menorColuna) {
                menorColuna = M[j][8];
            }
        }
        System.out.println("\nO maior valor da quinta linha é: " + maior);
        System.out.println("O menor valor da quinta linha é: " + menor);
        System.out.println("O maior valor da nona coluna é: " + maiorColuna);
        System.out.println("O menor valor da nona coluna é: " + menorColuna);

    }
}