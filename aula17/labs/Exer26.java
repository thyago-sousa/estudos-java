package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Você quer o fatorial de qual número: ");
        int numero = sc.nextInt();

        int resultado = 1;
        String saida = "";

        for (int i = numero; i > 0; i--) {

            resultado = resultado * i;
            saida = saida + i;

            if (i > 1) {
                saida = saida + " . ";
            }
        }

        System.out.println(numero + "! = " + saida + " = " + resultado);
        sc.close();
    }
}
