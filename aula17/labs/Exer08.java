package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        double numero = 0;
        double media = 0;

        while (contador < 5) {
            contador++;
            System.out.print("Digite o " + contador + "° numero: ");
            numero = sc.nextDouble();

            media += numero;
        }

        double calculoMedia = media / 5;

        System.out.println("Resultado da media: " + calculoMedia);

        sc.close();
    }
}
