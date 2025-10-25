package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora? R$");
        double horaSalario = sc.nextDouble();
        System.out.print("Quantas horas você trabalha por mês? ");
        double horasTrabalhadas = sc.nextDouble();

        double salarioTotal = horaSalario * horasTrabalhadas;

        System.out.println("O seu sálario mensal é de: R$" + salarioTotal);

        sc.close();
    }
}
