package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a medida de um lado do quadrado? ");
        double ladoQuadrado = sc.nextDouble();

        double areaQuadrado = Math.pow(ladoQuadrado, 2);
        double dobroArea = areaQuadrado * 2;

        System.out.println("Área do quadrado: " + areaQuadrado);
        System.out.println("Dobro da área do quadrado: " + dobroArea);

        sc.close();

    }
}
