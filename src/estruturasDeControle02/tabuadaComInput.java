package estruturasDeControle02;

//Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.

import java.util.Scanner;

public class tabuadaComInput {
    public static void main() {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero para ter a tabuada: ");
        int numero = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }


    }
}
