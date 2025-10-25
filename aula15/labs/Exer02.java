package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite algum valor: ");
        double numero = sc.nextDouble();

        if(numero >= 0) {
            System.out.println("O seu número é positivo");
        }
        else{
            System.out.println("O seu número é negativo");
        }

        sc.close();
    }
}
