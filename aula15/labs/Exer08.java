package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer08
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço do produto 1: ");        
        double produto1 = sc.nextDouble();
        System.out.print("Digite o preço do produto 2: ");        
        double produto2 = sc.nextDouble();
        System.out.print("Digite o preço do produto 3: ");        
        double produto3 = sc.nextDouble();
        
        if (produto1 <= produto2 && produto1 <= produto3) {
            System.out.println("O produto 1 é mais barato");
        }
        else if (produto2 <= produto3) {
            System.out.println("O produto 2 é mais barato");
        }
        else {
            System.out.println("O produto 3 é mais barato");
        }
        
        sc.close();
	}
}