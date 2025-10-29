package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========= Cardápio da Lanchonete =========");
        System.out.printf("%-18s %-8s %s\n", "Especificação", "Código", "Preço");
        System.out.println("------------------------------------------");
        System.out.printf("%-18s %-8d R$ %.2f\n", "Cachorro Quente", 100, 1.20);
        System.out.printf("%-18s %-8d R$ %.2f\n", "Bauru Simples", 101, 1.30);
        System.out.printf("%-18s %-8d R$ %.2f\n", "Bauru com ovo", 102, 1.50);
        System.out.printf("%-18s %-8d R$ %.2f\n", "Hambúrguer", 103, 1.20);
        System.out.printf("%-18s %-8d R$ %.2f\n", "Cheeseburguer", 104, 1.30);
        System.out.printf("%-18s %-8d R$ %.2f\n", "Refrigerante", 105, 1.00);
        System.out.println("------------------------------------------");
        System.out.println("Digite o código 0 para encerrar o pedido.");

        int codProduto;
        int quantidade;
        double totalCompra = 0.0;

        do {
            System.out.print("\nDigite o código do item: ");
            codProduto = sc.nextInt();

            if (codProduto == 0) {
                System.out.println("Encerrando pedido...");
                continue;
            }

            System.out.print("Digite a quantidade: ");
            quantidade = sc.nextInt();

            double precoItem = 0;
            String nomeItem = "";
            boolean codigoValido = true;


            switch (codProduto) {
                case 100 -> {
                    nomeItem = "Cachorro Quente";
                    precoItem = 1.20;
                }
                case 101 -> {
                    nomeItem = "Bauru Simples";
                    precoItem = 1.30;
                }
                case 102 -> {
                    nomeItem = "Bauru com ovo";
                    precoItem = 1.50;
                }
                case 103 -> {
                    nomeItem = "Hambúrguer";
                    precoItem = 1.20;
                }
                case 104 -> {
                    nomeItem = "Cheeseburguer";
                    precoItem = 1.30;
                }
                case 105 -> {
                    nomeItem = "Refrigerante";
                    precoItem = 1.00;
                }
                default -> {
                    System.out.println("ERRO: Código de produto inválido. Tente novamente.");
                    codigoValido = false;
                }
            }

            if (!codigoValido) {
                continue;
            }

            double subtotalItem = precoItem * quantidade;
            System.out.printf(" -> Item: %s | Qtd: %d | Subtotal: R$ %.2f\n", nomeItem, quantidade, subtotalItem);

            totalCompra += subtotalItem;

        } while (codProduto != 0);

        System.out.println("------------------------------------------");
        System.out.printf("VALOR TOTAL DO PEDIDO: R$ %.2f\n", totalCompra);

        sc.close();
    }
}