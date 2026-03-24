package fundamentosLogica01;

// Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

import java.util.Scanner;

public class reajuste {
    public static void main(String[] args) {
        double reajustado;

        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();

        reajustado = a + (a * 5 / 100);

        System.out.println("Valor com acrescimo de 5%: " + reajustado);



    }
}
