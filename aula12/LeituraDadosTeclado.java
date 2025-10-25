package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

/*        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = sc.nextLine();
        System.out.print("Seu nome completo é: " + nomeCompleto);

        System.out.print("\nDigite seu primeiro nome: ");
        String primeiroNome = sc.next();
        System.out.print("Seu primeiro nome é: " + primeiroNome);

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Sua idade é: " + idade);

        System.out.print("\nDigite a sua altura: ");
        double altura = sc.nextDouble();
        System.out.print("A sua altura é: " + altura);*/

        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, " +
                "alura e se tem bichinhos de estimação: ");
        String primeiroNome = sc.next();
        int idade = sc.nextInt();
        byte qtdFilhos = sc.nextByte();
        float altura = sc.nextFloat();
        boolean temPet = sc.nextBoolean();

        System.out.println("Você digitou os seguintes valores: ");
        System.out.println("Primeiro nome " + primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("Altura " + altura);
        System.out.println("Tem bichinho de estimação? " + temPet);







    }
}
