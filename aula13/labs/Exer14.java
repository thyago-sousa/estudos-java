package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do arquivo para download (em MB): ");
        double tamanhoArquivoMb = sc.nextDouble();
        System.out.print("Agora digite a velocidade da internet (em Mbps): ");
        double velocidadeNet = sc.nextDouble();

        double calculoDownload = tamanhoArquivoMb / velocidadeNet;

        System.out.print("Tempo de download: aproximandamente " + calculoDownload + " minutos");

        sc.close();
    }
}
