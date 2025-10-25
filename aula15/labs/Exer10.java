package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer10
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma dessas letras: ");        
        System.out.print("\nM - Matutino");
        System.out.print("\nV - Vespertino");
        System.out.print("\nN - Noturno\n");
        char turnos = sc.nextLine().toUpperCase().charAt(0);
        
        String periodoDia = switch (turnos) {
            case 'M' -> "Matutino";
            case 'V' -> "Vespertino";
            case 'N' -> "Noturno";
            default -> "Período não identificado";
        };
        
        System.out.println(periodoDia);
        
        sc.close();
	}
}