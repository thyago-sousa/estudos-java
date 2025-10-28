package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de temperaturas: ");
        int qtdTemp = sc.nextInt();

        double somaTemp = 0;
        double media;

        double maiorTemp = Double.MIN_VALUE;
        double menorTemp = Double.MAX_VALUE;


        for (int i = 1; i <= qtdTemp; i++) {

            System.out.print(i + "º temperatura: ");
            double tempAtual = sc.nextDouble();

            somaTemp += tempAtual;

            if(tempAtual > maiorTemp) {
                maiorTemp = tempAtual;
            }

            if (tempAtual < menorTemp) {
                menorTemp = tempAtual;
            }
        }

        media = somaTemp / qtdTemp;

        // 5. CORRIGIDO: Saídas corretas do exercício
        System.out.println("A média das temperaturas é igual a: " + media);
        System.out.println("A MAIOR temperatura informada foi: " + maiorTemp + " graus");
        System.out.println("A MENOR temperatura informada foi: " + menorTemp + " graus");


        sc.close();
    }
}