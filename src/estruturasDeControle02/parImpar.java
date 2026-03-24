package estruturasDeControle02;
/* 2 - Faça um algoritmo para receber um
 número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
 */

import java.util.Scanner;

public class parImpar {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }


}
