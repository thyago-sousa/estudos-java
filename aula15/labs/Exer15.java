package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os três lados do triângulo");
        System.out.print("Primeiro: ");
        double primeiroLado = sc.nextDouble();
        System.out.print("Segundo: ");
        double segundoLado = sc.nextDouble();
        System.out.print("Terceiro: ");
        double terceiroLado = sc.nextDouble();

        if (primeiroLado + segundoLado > terceiroLado || primeiroLado + terceiroLado > segundoLado || segundoLado + terceiroLado > primeiroLado) {
            if (primeiroLado == segundoLado && segundoLado == terceiroLado){
                System.out.println("Triângulo Equilátero: ");
            }
            else if (primeiroLado == segundoLado || primeiroLado == terceiroLado || segundoLado == terceiroLado) {
                System.out.println("Triângulo Isóceles");
            }

            else if (primeiroLado != segundoLado && segundoLado != terceiroLado) {
                System.out.println("Triângulo Escaleno");
            }
        }

        else {
            System.out.println("Valor inválido");
        }

        sc.close();

    }
}
