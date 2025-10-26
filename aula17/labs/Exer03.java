package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer03 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;

        do {
            System.out.print("Digite o seu nome: ");
            nome = sc.nextLine();

            if (nome.length() < 3) {
                System.out.println("\nO seu nome deve ter pelo menos 3 caracteres");
            }
        }
        while(nome.length() < 3);

        int idade;
        do{
            System.out.print("Digite a sua idade: ");
            idade = sc.nextInt();

            if (idade <= 0 || idade >= 150) {
                System.out.println("\nA sua idade está inválida");
            }
        }
        while(idade <= 0 || idade >= 150);

        double salario;

        do {
            System.out.print("Informe o seu salário: ");
            salario = sc.nextDouble();

            if(salario <= 0) {
                System.out.println("\nSalário deve ser maior que 0");
            }
        }
        while(salario <= 0);

        sc.nextLine();
        String sexo;

        do {
            System.out.print("Sexo: (F - Feminino, M - Masculino): ");
            sexo = sc.nextLine().toUpperCase();

            if (!sexo.equals("F") && !sexo.equals("M")) {
                System.out.println("\nVocê pode digitar apenas F ou M");
            }
        }
        while(!sexo.equals("F") && !sexo.equals("M"));

        String estadoCivil;

        do {
            System.out.print("Estado civil: (S - Solteiro(a), C - Casado(a), V - Viúvo(a), D - Divorciado(a): ");
            estadoCivil = sc.nextLine().toUpperCase();

            if (!estadoCivil.equals("S") &&
                    !estadoCivil.equals("C") &&
                    !estadoCivil.equals("V") &&
                    !estadoCivil.equals("D")) {
                System.out.println("\nVocê pode digitar apenas as letras S, C, V ou D");
            }
        }
        while (!estadoCivil.equals("S") &&
                !estadoCivil.equals("C") &&
                !estadoCivil.equals("V") &&
                !estadoCivil.equals("D"));

        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        sc.close();
    }
}
