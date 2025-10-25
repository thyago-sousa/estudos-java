package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int numero2 = sc.nextInt();

        int somaNumeros = numero1 + numero2;

        System.out.print("A soma dos dois números é igual a: " + somaNumeros);

        sc.close();
    }
}
