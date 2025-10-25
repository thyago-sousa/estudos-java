package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua altura: ");
        double altura = sc.nextDouble();

        double pesoIdeal = 72.7 * altura - 58.0;

        System.out.println("O seu peso ideal é de " + pesoIdeal + " kgs");

        sc.close();
    }
}
