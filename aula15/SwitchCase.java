package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um dia da semana (1-7):");
        int diaSemana = sc.nextInt();

        // A "Switch Expression" pode retornar um valor, que armazenamos na variável 'tipoDia'
        String tipoDia = switch (diaSemana) {
            case 2, 3, 4, 5, 6 -> "Dia útil"; // Agrupa múltiplos casos com vírgula
            case 1, 7 -> "Fim de semana";
            default -> "Não é um dia da semana válido";
        }; // Note o ponto e vírgula no final, pois é uma expressão

        System.out.println(tipoDia);
    }
}