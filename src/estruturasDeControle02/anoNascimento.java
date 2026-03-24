package estruturasDeControle02;

/*

Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos ano essa pessoa ja viveu.

 */

import java.util.Scanner;

public class anoNascimento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano de seu nascimento: ");
        int anoNascimento = sc.nextInt();

        sc.close();

        int anos = 2026 - anoNascimento;

        System.out.println("Você já viveu " + anos + " anos.");

    }
}
