package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroInt1 = sc.nextInt();
        System.out.print("Digite outro inteiro: ");
        int numeroInt2 = sc.nextInt();
        System.out.print("Agora digite um número real: ");
        double numeroReal = sc.nextDouble();

        int calculo1 = numeroInt1 * 2 * numeroInt2 / 2;
        double calculo2 = numeroInt1 * 3 + numeroReal;
        double calculo3 = Math.pow(numeroReal, 3);

        System.out.println("O produto do dobro do primeiro com metade do segundo: " + calculo1);
        System.out.println("A soma do triplo do primeiro com o terceiro: " + calculo2);
        System.out.println("O terceiro elevado ao cubo: " + calculo3);

        sc.close();

    }
}
