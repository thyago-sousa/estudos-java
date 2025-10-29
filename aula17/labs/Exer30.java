package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int numInicio;
        int numFinal;

        do {
            System.out.print("Monte a tabuada de: ");
            num = sc.nextInt();

            if (num < 1 || num > 10) {
                System.out.println("Você só pode digitar números de 1 à 10\n");
            }
        }
        while (num < 1 || num > 10);

        do {
            System.out.print("Começar por: ");
            numInicio = sc.nextInt();

            if (numInicio < 1 || numInicio > 10) {
                System.out.println("Você só pode digitar números de 1 à 10\n");
            }
        }
        while (numInicio < 1 || numInicio > 10);

        do {
            System.out.print("Terminar por: ");
            numFinal = sc.nextInt();

            if (numFinal < 1 || numFinal > 10) {
                System.out.println("Você só pode digitar números de 1 à 10\n");
            }
        }
        while (numFinal < 1 || numFinal > 10);

        if(numInicio > numFinal) {
            System.out.println("O primeiro numero não pode ser maior que o segundo");
        }
        else {
            System.out.println("\nVou montar a tabuada de " + num + " começando em " + numInicio + " e terminando em " + numFinal);

            for (int i = numInicio; i <= numFinal; i++) {
                int calculo;
                calculo = num * i;
                System.out.println(num + " X " + i + " = " + calculo);
            }
        }

        sc.close();
    }
}
