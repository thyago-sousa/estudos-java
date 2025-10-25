package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Posto de Gasolina");
        System.out.println("Quantos litros você pediu? ");
        double litros = sc.nextDouble();
        System.out.println("Qual foi o tipo de combusível? ");
        System.out.println("A - Álcool ou G - Gasolina: ");
        sc.nextLine();
        String tipoCombustivel = sc.nextLine().toUpperCase();

        double calculo = 0;
        double precoAlcool = 1.90;
        double precoGasolina = 2.50;

        if (tipoCombustivel.equals("A")) {
            if (litros <= 20) {
                // Desconto de 3% (paga 97%)
                calculo = (litros * precoAlcool) * 0.97;
            }
            else {
                // Desconto de 5% (paga 95%)
                calculo = (litros * precoAlcool) * 0.95;
            }
        }
        else if (tipoCombustivel.equals("G")) { // É bom usar "else if" para garantir que foi 'G'
            if (litros <= 20) {
                // Desconto de 4% (paga 96%)
                calculo = (litros * precoGasolina) * 0.96;
            }
            else {
                // Desconto de 6% (paga 94%)
                calculo = (litros * precoGasolina) * 0.94;
            }
        } else {
            System.out.println("Tipo de combustível inválido.");
        }

        // É uma boa prática formatar a saída para 2 casas decimais
        System.out.printf("O valor total ficou de: R$ %.2f\n", calculo);

        sc.close();

    }
}
