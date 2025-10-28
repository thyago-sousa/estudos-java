package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de CDs: ");
        int qtdCDs = sc.nextInt();

        double somaCDs = 0;
        double media;

        if (qtdCDs > 0) {

            for(int i = 1; i <= qtdCDs; i++) {

                double cdsAtual;

                System.out.print("Digite o preço do " + i + "° CD: ");
                cdsAtual = sc.nextDouble();

                somaCDs += cdsAtual;

            }
            media = somaCDs / qtdCDs;

            System.out.println("Valor total investido na coleção é de: " + somaCDs + "R$");
            System.out.println("O valor médio da sua coleção é igual a: " + media + "R$");

        } else {
            System.out.println("Número de CDs inválido.");
        }

        sc.close();
    }
}
