package fundamentosLogica01;

// Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

import java.util.Scanner;

public class antecessorSucessor {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println("Antecessor: " + (a - 1));
        System.out.println("Sucessor: " + (a + 1));



    }
}
