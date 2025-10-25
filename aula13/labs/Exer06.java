package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio de um círculo: ");
        double raio = sc.nextDouble();

        double calculoArea = Math.PI * Math.pow(raio,2);

        System.out.println("Resultado área do círculo: " + calculoArea);

        sc.close();
    }
}
