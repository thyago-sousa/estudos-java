package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Metros: ");
        double metros = sc.nextDouble();

        double conversaoCentimetros = metros * 100;

        System.out.println("Metros: " + metros);
        System.out.print("Centímetros: " + conversaoCentimetros);

        sc.close();
    }
}
