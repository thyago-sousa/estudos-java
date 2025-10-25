package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = sc.nextLine().toUpperCase().charAt(0);
        
        String resultado = switch(letra){
            case 'A', 'E', 'I', 'O', 'U' -> "É uma vogal";
            default -> "É uma consoante";
        };

        System.out.println(resultado);

    }
}
