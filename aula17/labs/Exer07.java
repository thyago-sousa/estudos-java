package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        double numero = 0;
        double maior = 0;

        while (contador < 5) {
            contador++;
            System.out.print("Digite o " + contador + "° numero: ");
            numero = sc.nextDouble();

            if (contador == 1) {
                maior = numero;
            }

            else if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número digitado foi: " + maior);

        sc.close();
    }
}