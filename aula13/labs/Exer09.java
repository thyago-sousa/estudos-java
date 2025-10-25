package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Farenheit: ");
        double farenheit = sc.nextDouble();

        double conversaoTemperatura = (5.0 * (farenheit - 32.0) / 9.0);

        System.out.println("A temperatura de " + farenheit + " graus farenheit é de " + conversaoTemperatura + " celsius");

        sc.close();
    }
}
