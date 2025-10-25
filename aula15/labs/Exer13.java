package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer13
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o número correspondente ao dia da semana (1 - 7): ");
        int numeroDia = sc.nextInt();
        
        String diaSemana = switch (numeroDia) {
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sábado";
            default -> "Você não digitou um núero válido";
        };
        
        System.out.print(diaSemana);
        
        sc.close();
	}
}