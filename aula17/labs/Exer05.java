package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tentativa;

        do {
            System.out.print("Digite a população do país A: ");
            double A = sc.nextDouble();

            System.out.print("Digite a população do país B: ");
            double B = sc.nextDouble();

            System.out.print("Digite a taxa de crescimento do país A: (em %) ");
            double taxaCrescimentoA = sc.nextDouble();

            System.out.print("Digite a taxa de crescimento do país B: (em %) ");
            double taxaCrescimentoB = sc.nextDouble();

            int anos;

            if (A > B) {
                if (taxaCrescimentoB <= taxaCrescimentoA) {
                    System.out.println("A população B nunca alcançará a A com essa taxa.");
                }

                else {
                    for (anos = 0; A > B; anos++) {
                        double calculoTaxaA = A * (taxaCrescimentoA / 100);
                        double calculoTaxaB = B * (taxaCrescimentoB / 100);

                        A += calculoTaxaA;
                        B += calculoTaxaB;
                    }
                    System.out.println("Serão necessários " + anos + " anos para a população B passar ou igualar a A.");
                }

            }

            else {
                if (taxaCrescimentoA <= taxaCrescimentoB) {
                    System.out.println("A população A nunca alcançará a B com essa taxa.");
                } else {
                    for (anos = 0; A < B; anos++) {
                        double calculoTaxaA = A * (taxaCrescimentoA / 100);
                        double calculoTaxaB = B * (taxaCrescimentoB / 100);

                        A += calculoTaxaA;
                        B += calculoTaxaB;
                    }
                    System.out.println("Serão necessários " + anos + " anos para a população A passar ou igualar a B.");
                }
            }

            System.out.print("\nVocê quer tentar mais uma vez? (s/n) ");
            sc.nextLine();
            tentativa = sc.nextLine();


        } while (tentativa.equalsIgnoreCase("s"));

        System.out.println("Programa finalizado!");
        sc.close();
    }
}