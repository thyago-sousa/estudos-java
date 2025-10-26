package com.loiane.cursojava.aula17.labs;

public class Exer04 {
    public static void main(String[] args) {

        double A = 80000;
        double B = 200000;

        int anos;

        for(anos=0; A < B; anos++ ) {

            double taxaCrescimentoA = A * 0.03;
            double taxaCrescimentoB = B * 0.015;
            A += taxaCrescimentoA;
            B += taxaCrescimentoB;
        }

        System.out.println("Serão necessários " + anos + " anos para a população A passar a B");

    }
}
