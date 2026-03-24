package estruturasDeControle02;

/*

Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente
e o resto da divisão inteira entre eles.

 */

import java.util.Scanner;

public class quociente {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int a = input.nextInt();

        System.out.println("Digite outro numero: ");
        int b = input.nextInt();

        System.out.println("\nQuociente: " + a / b);
        System.out.println("\nResto da divisao: " + a % b);

    }
}
