package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double taxa = 0.015;

        System.out.print("Digite o salário inicial: ");
        double salarioInicial = sc.nextDouble();

        salarioInicial = salarioInicial + (salarioInicial * taxa);

        for(int i = 1997; i <=2025;i++) {

            taxa = taxa * 2;
            salarioInicial = salarioInicial + (salarioInicial * taxa);

            System.out.println(salarioInicial);
        }

        System.out.println("O salário final é: " + salarioInicial);

    }
}
