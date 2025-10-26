package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite a sua senha: ");
        String senha = sc.nextLine();

        while(nome.equals(senha)) {
            System.out.println("\nO nome e a senha não podem ser iguais");

            System.out.print("Digite o seu nome: ");
            nome = sc.nextLine();
            System.out.print("Digite a sua senha: ");
            senha = sc.nextLine();

        }

        System.out.println("\nUsuário e senha verificados com sucesso");

        sc.close();
    }
}
