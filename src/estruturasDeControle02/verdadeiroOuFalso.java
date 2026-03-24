package estruturasDeControle02;

// Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

import java.util.Scanner;

public class verdadeiroOuFalso {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean a = input.nextBoolean();
        boolean b = input.nextBoolean();

        if (a && b == false) {
            System.out.println("Ambos valores são falsos.");
        } else if (a && b == true) {
            System.out.println("Ambos valores são verdadeiros.");
        } else {
            System.out.println("Verdadeiro e falso.");
        }

    }
}
