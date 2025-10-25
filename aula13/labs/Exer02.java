package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        System.out.print("O número informado foi " + numero);

        sc.close();
    }
}
