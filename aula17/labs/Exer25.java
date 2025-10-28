package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Lojas Tabajara");

            double totalCompra = 0;
            double precoProduto;
            int contProduto = 1;

            do {
                System.out.print("Produto " + contProduto + ": R$ ");
                precoProduto = sc.nextDouble();

                totalCompra += precoProduto;
                contProduto++;

            } while (precoProduto != 0);


            System.out.println("\nTotal: R$ " + totalCompra);

            System.out.print("Dinheiro: R$");
            double dinheiro = sc.nextDouble();

            double troco = dinheiro - totalCompra;

            System.out.println("Troco: R$" + troco);

            System.out.println("...");
        }
    }
}
