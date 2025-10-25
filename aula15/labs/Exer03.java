package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*System.out.println("Digite o seu sexo - (Masculino: M / Feminino: F");
        String sexo = sc.nextLine();

        if(sexo.equals("F")){
            System.out.println("Sexo Feminino");
        }
        else if(sexo.equals("M")){
            System.out.println("Sexo Masculino");
        }
        else{
            System.out.println("Sexo Inválido");
        }*/

        System.out.println("Qual é o seu sexo:");
        System.out.println("Digite M para Masculino:");
        System.out.println("Digite F para Feminino:");

        char sexo = sc.nextLine().toUpperCase().charAt(0);

        String resultado = switch(sexo) {
            case 'F' -> "F - Feminino";
            case 'M' -> "M - Masculino";
            default -> "Sexo Inválido";
        };

        System.out.println(resultado);
        sc.close();
    }
}
