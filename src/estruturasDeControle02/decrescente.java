package estruturasDeControle02;

// Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

import java.util.Arrays;
import java.util.Scanner;

public class decrescente {
    public static void main(String[] args) {

        int[] numeros = new int[3];

        Scanner sc = new Scanner(System.in);
        numeros[0] = sc.nextInt();
        numeros[1] = sc.nextInt();
        numeros[2] = sc.nextInt();

        Arrays.sort(numeros);

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

    }
}
