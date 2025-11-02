package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];

        int totalMenorQuinze = 0;
        int qtdIgualQuinze = 0;
        int totalMaiorQuinze = 0;
        int qtdMaiorQuinze = 0;

        for(int i=0; i<A.length; i++) {
            System.out.println("Entre com o valor da posição: " + i);
            A[i] = sc.nextInt();

            if(A[i] < 15) {
                totalMenorQuinze += A[i];
            }
            else if (A[i] == 15){
                qtdIgualQuinze++;
            }
            else {
                qtdMaiorQuinze += A[i];
                totalMaiorQuinze++;
            }
        }

        System.out.println("Vetor A");
        for(int i=0; i<A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        int media = qtdMaiorQuinze / totalMaiorQuinze;

        System.out.println("Soma dos elementos inferiores a 15: " + totalMenorQuinze);
        System.out.println("Quantidade dos elementos iguais a 15: " + qtdIgualQuinze);
        System.out.println("Média dos elementos superiores a 15: " + media);

        sc.close();
    }
}