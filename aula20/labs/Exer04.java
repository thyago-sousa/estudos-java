package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] compromissos = new String[31][24];

        boolean sair = false;
        byte opcao;

        while (!sair) {

            System.out.println("\n========= AGENDA =========");
            System.out.println("Digite 1 para adicionar compromisso");
            System.out.println("Digite 2 para verificar compromisso");
            System.out.println("Digite 0 para sair");
            System.out.print("Opção: ");
            opcao = sc.nextByte();
            sc.nextLine();

            if (opcao == 1) {

                int dia = 0;
                boolean diaValido = false;

                while (!diaValido) {
                    System.out.print("Entre com o dia do mês (1-31): ");
                    dia = sc.nextInt();
                    sc.nextLine();

                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, tente novamente.");
                    }
                }

                int hora = 0;
                boolean horaValida = false;

                while (!horaValida) {
                    System.out.print("Entre com a hora (0-23): ");
                    hora = sc.nextInt();
                    sc.nextLine();

                    if (hora >= 0 && hora <= 23) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, tente novamente.");
                    }
                }

                System.out.print("Digite o compromisso: ");
                String compromisso = sc.nextLine();

                compromissos[dia - 1][hora] = compromisso;

                System.out.println("Compromisso adicionado!");

            } else if (opcao == 2) {

                int dia = 0;
                boolean diaValido = false;

                while (!diaValido) {
                    System.out.print("Entre com o dia do mês (1-31): ");
                    dia = sc.nextInt();
                    sc.nextLine();

                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, tente novamente.");
                    }
                }

                int hora = 0;
                boolean horaValida = false;

                while (!horaValida) {
                    System.out.print("Entre com a hora (0-23): ");
                    hora = sc.nextInt();
                    sc.nextLine();

                    if (hora >= 0 && hora <= 23) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválido, tente novamente.");
                    }
                }

                String compromisso = compromissos[dia - 1][hora];

                if (compromisso == null) {
                    System.out.println("Não há compromisso agendado.");
                } else {
                    System.out.println("Compromisso agendado: " + compromisso);
                }

            } else if (opcao == 0) {
                sair = true;
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }

        sc.close();
    }
}
