package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();

        double conversaoTemperatura = (celsius * 9.0/5.0) + 32.0;

        System.out.println("A temperatura de " + celsius + " graus celsius é de " + conversaoTemperatura + " fahrenheit");

        sc.close();


    }
}
