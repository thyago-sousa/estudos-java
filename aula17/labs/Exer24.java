package com.loiane.cursojava.aula17.labs;

public class Exer24 {
    public static void main(String[] args) {

        int cont = 50;
        int inicio = 1;
        double preco = 0.18;

        System.out.println("Preço do pão: " + preco);
        System.out.println("Panificadora Pão de Ontem - Tabela de preços");

        while(cont >= inicio) {

            double resultado = preco * inicio;

            System.out.println(inicio + " - " + "R$ " + resultado);
            inicio++;
        }
    }
}
