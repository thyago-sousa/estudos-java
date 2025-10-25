package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora? R$");
        double horaSalario = sc.nextDouble();
        System.out.print("Quantas horas você trabalha por mês? ");
        double horasTrabalhadas = sc.nextDouble();

        double salarioTotal = horaSalario * horasTrabalhadas;
        double descontoInss = salarioTotal * 0.08;
        double descontoSindicato = salarioTotal * 0.05;
        double ir = salarioTotal * 0.11;
        double totalDescontos = descontoInss + descontoSindicato + ir;
        double salarioLiquido = salarioTotal - totalDescontos;

        System.out.println("Salario bruto: " + salarioTotal);
        System.out.println("Desconto INSS: " + descontoInss);
        System.out.println("Desconto Sindicato: " + descontoSindicato);
        System.out.println("IR: " + ir);
        System.out.println("Total Descontos: " + totalDescontos);
        System.out.println("Salario líquido: " + salarioLiquido);

        sc.close();
    }
}
