package estruturasDeControle02;/* Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B e mostre
se a soma é menor que C.
 */

import java.util.Scanner;

public class menorQue {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a + b);

        if (a + b < c) {
            System.out.println(a + b + " é menor que " + c);
         }
            else {
            System.out.println(a + b + " é maior que " + c);
        }
        }
    }

