package estruturasDeControle02;

// Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

import java.util.Scanner;

public class mediaNotas {
    public static void main(String[] args) {

        double media;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        double nota1 = input.nextDouble();

        System.out.println("Digite a nota 2: ");
        double nota2 = input.nextDouble();

        System.out.println("Digite a nota 3: ");
        double nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Sua média é: " + media);

    }
}
