package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer11
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o seu salário: ");
        double salario = sc.nextDouble();
        double percentual = 0;
        
        if (salario <= 280) {
            percentual = 20;
        }
        else if (salario > 280 && salario <= 700) {
            percentual = 15;
        }
        else if (salario > 700 && salario <= 1500) {
            percentual = 10;
        }
        else if (salario > 1500) {
            percentual = 5;
        }
        
        System.out.println("Salário antes do reajuste: " + salario);
        System.out.println("Percentual aplicado: " + percentual);
        double reajuste = (salario * percentual) / 100;
        salario += salario * (percentual / 100);
        System.out.println("Valor do aumento: " + reajuste);
        System.out.println("Novo salário: " + salario);
        
        
        
        sc.close();
	}
}