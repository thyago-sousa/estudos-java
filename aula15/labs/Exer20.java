package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Responda as seguindtes perguntas: ");
        System.out.print("Você telefonou para a vítima?: ");
        String resp1 = sc.nextLine().toLowerCase();
        System.out.print("Esteve no local do crime?: ");
        String resp2 = sc.nextLine().toLowerCase();
        System.out.print("Mora perto da vítima?: ");
        String resp3 = sc.nextLine().toLowerCase();
        System.out.print("Devia para a vítima? ");
        String resp4 = sc.nextLine().toLowerCase();
        System.out.print("Já trabalhou com a vítima? ");
        String resp5 = sc.nextLine().toLowerCase();

        int cont = 0;

        if (resp1.equals("sim")) {
            cont++;
        }
        if (resp2.equals("sim")) {
            cont++;
        }
        if (resp3.equals("sim")) {
            cont++;
        }
        if (resp4.equals("sim")) {
            cont++;
        }
        if (resp5.equals("sim")) {
            cont++;
        }


        switch (cont) {
            case 1 -> System.out.println("Inocente");
            case 2 -> System.out.println("Suspeito");
            case 3,4 -> System.out.println("Cúmplice");
            case 5 -> System.out.println("Assassino");
            default -> System.out.println("Você não respondeu corretamente");
        }
        System.out.println(cont);

        sc.close();
    }
}
