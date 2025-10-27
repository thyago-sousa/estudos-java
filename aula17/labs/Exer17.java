package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Você quer o fatorial de qual número: ");
        int numero = sc.nextInt();

        int resultado = 1;

        for (int i = numero; i > 0; i--) {

            resultado = resultado * i;

        }

        System.out.println("O fatorial de " + numero + " é igual a " + resultado);

        sc.close();
    }
}
