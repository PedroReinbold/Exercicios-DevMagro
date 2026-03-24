package estruturasDeControle02;

/*
Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A
e imprima na tela os valores.
 */

import java.util.Scanner;

public class trocaDeValores {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int temp;

        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        temp = a;

        a = b;
        b = temp;

        System.out.println("A = " + a);
        System.out.println("B = " + b);

    }
}
