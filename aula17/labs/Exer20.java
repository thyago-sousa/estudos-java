package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Informe o número de pessoas: ");
        int qtdPessoas = sc.nextInt();

        if (qtdPessoas > 0) {
            double somaIdades = 0;
            double media;

            for(int i = 1; i <= qtdPessoas; i++) {
                System.out.print("Digite a idade da " + i + "° pessoa: ");
                double idadeAtual = sc.nextDouble();

                somaIdades += idadeAtual;
            }

            media = somaIdades / qtdPessoas;

            System.out.println("A media da idade das pessoas é: " + media);

            if (media <= 25) {
                System.out.println("Classificação: Turma Jovem");
            }
            else if (media <= 60) {
                System.out.println("Classificação: Turma Adulta");
            }
            else {
                System.out.println("Classificação: Turma Idosa");
            }

        } else {

            System.out.println("Nenhuma pessoa foi informada.");
        }

        sc.close();
    }
}
