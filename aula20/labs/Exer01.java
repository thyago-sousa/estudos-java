package com.loiane.cursojava.aula20.labs;

import java.util.Random;

public class Exer01
{
    public static void main(String[] args) {
        int[][] M = new int[4][4];
        Random random = new Random();
        for(int i=0; i<M.length; i++) {
            for (int j=0; j<M[i].length; j++) {
                M[i][j] = random.nextInt(10);
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }
}