package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer09
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");        
        double num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");        
        double num2 = sc.nextDouble();
        System.out.print("Digite o terceiro número: ");        
        double num3 = sc.nextDouble();
        System.out.print(""); 
        
        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.println("Ordem decrescente: \nPrimeiro número: " + num1 +
                "\nSegundo número: " + num2 + "\nTerceiro número: " + num3);
            }
            else {
                System.out.println("Ordem decrescente: \nPrimeiro número: " + num1 +
                "\nSegundo número: " + num3 + "\nTerceiro número: " + num2);
            }
        }
        else if (num2 >= num3) {
            if (num3 >= num1) {
                System.out.println("Ordem decrescente: \nPrimeiro número: " + num2 +
                "\nSegundo número: " + num3 + "\nTerceiro número: " + num1);
            }
            else {
                System.out.println("Ordem decrescente: \nPrimeiro número: " + num2 +
                "\nSegundo número: " + num1 + "\nTerceiro número: " + num3);
            }
        }
        else {
            if (num2 >= num1) {
                System.out.println("Ordem decrescente: \nPrimeiro número: " + num3 +
                "\nSegundo número: " + num2 + "\nTerceiro número: " + num1);
            }
            else {
                System.out.println("Ordem decrescente: \nPrimeiro número: " + num3 +
                "\nSegundo número: " + num1 + "\nTerceiro número: " + num2);
            }
        }
        sc.close();
	}
}