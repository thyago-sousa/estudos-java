package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número limite: ");
        int limite = sc.nextInt();

        System.out.println("Números primos entre 1 e " + limite + ":");

        for (int numeroParaTestar = 2; numeroParaTestar <= limite; numeroParaTestar++) {

            boolean primo = true;

            for (int i = 2; i * i <= numeroParaTestar; i++) {

                if (numeroParaTestar % i == 0) {
                    primo = false;
                    break;
                }
            }

            if(primo) {
                System.out.print(numeroParaTestar + " ");
            }
        }

        System.out.println();
        sc.close();
    }
}