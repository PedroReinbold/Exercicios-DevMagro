package estruturasDeControle02;

/* Faça um algoritmo que leia dois valores inteiros A e B,
se os valores de A e B forem iguais, deverá somar os dois valores,
 */

import java.util.Scanner;

public class iguais {
    public static void main() {
        int c;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            c = a + b;
            System.out.println("A soma: " + c);
        } else {
            c = a * b;
            System.out.println("A multiplicação: " + c);
        }

    }
}
