package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer19 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora");
        System.out.println("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        // Correção de texto simples
        System.out.println("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        // --- CORREÇÃO 1: ERRO FATAL DO SCANNER ---
        sc.nextLine(); // Consome o "\n" pendente

        System.out.println("Digite qual operação você quer (+, -, /, *): ");
        // Pegar a string primeiro é mais seguro, para evitar erro se o usuário só der Enter
        String input = sc.nextLine();

        // Checamos se o usuário digitou algo antes de pegar o char
        if (input.isEmpty()) {
            System.out.println("Nenhuma operação foi digitada.");
            sc.close();
            return; // Encerra o programa
        }

        char operacao = input.charAt(0);

        double resultado = 0;
        boolean operacaoValida = true;

        switch (operacao) {
            case '+' -> resultado = num1 + num2;
            case '-' -> resultado = num1 - num2;
            case '/' -> resultado = num1 / num2;
            case '*' -> resultado = num1 * num2;
            default -> {
                System.out.println("Você não escolheu uma operação válida.");
                operacaoValida = false;
            }
        };

        if (operacaoValida) {
            System.out.println("Resultado = " + resultado);

            // --- CORREÇÃO 2: LÓGICA PAR/ÍMPAR ---
            if (resultado % 1 == 0) { // Verifica se é um número inteiro
                if (resultado % 2 == 0){
                    System.out.println("O número é inteiro e par");
                } else {
                    System.out.println("O número é inteiro e ímpar");
                }
            } else {
                System.out.println("O número é decimal");
            }

            // --- CORREÇÃO 3: LÓGICA POSITIVO/NEGATIVO/ZERO ---
            if (resultado < 0) {
                System.out.println("O número é negativo");
            } else if (resultado == 0) {
                System.out.println("O número é zero (neutro)");
            } else {
                System.out.println("O número é positivo");
            }
        }

        sc.close();
    }
}