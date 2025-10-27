package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primero número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int menor;
        int maior;

        if (num1 < num2) {
            menor = num1;
            maior = num2;
        }
        else {
            menor = num2;
            maior = num1;
        }
        for(int i = menor + 1; i < maior; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
