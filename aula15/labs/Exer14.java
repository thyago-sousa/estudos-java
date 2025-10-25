package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a sua segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;
        char conceito;


        System.out.println("\nPrimeira nota: " + nota1);
        System.out.println("Segunda nota: " + nota2);
        System.out.println("Media: " + media);

        if (media <= 10 && media >= 9) {
            conceito = 'A';
        }
        else if (media < 9 && media >= 7.5) {
            conceito = 'B';
        }
        else if (media < 7.5 && media >= 6) {
            conceito = 'C';
        }
        else if (media < 6 && media >= 4) {
            conceito = 'D';
        }
        else {
            conceito = 'E';
        }

        /*if (conceito == 'A' || conceito == 'B' || conceito == 'C'){
            System.out.println("APROVADO");
        }
        else {
            System.out.println("REPROVADO");
        }*/

        String resultado = switch (conceito) {
            case 'A', 'B', 'C' -> "APROVADO";
            case 'D', 'E' -> "REPROVADO";
            default -> "Não é possível avaliar";
        };

        System.out.println("Conceito" + conceito);
        System.out.println(resultado);

        sc.close();
    }
}
