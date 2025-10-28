package com.loiane.cursojava.aula17.labs;

public class Exer23 {
    public static void main(String[] args) {

        int cont = 50;
        int inicio = 1;
        double preco = 1.99;

        System.out.println("Lojas Quase Dois - Tabela de preços");

        while(cont >= inicio) {

            double resultado = preco * inicio;

            System.out.println(inicio + " - " + "R$ " + resultado);
            inicio++;
        }
    }
}
