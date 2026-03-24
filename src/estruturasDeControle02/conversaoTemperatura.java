package estruturasDeControle02;

/*

Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius.
Imprima na tela as duas temperaturas.
Fórmula: C = (5 * ( F-32) / 9)

 */

import java.util.Scanner;

public class conversaoTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temperaturaConvertida;

        System.out.println("Digite o temperatura em Fahrenheit: ");
        double temperatura = input.nextDouble();

        temperaturaConvertida = (5 * (temperatura - 32) / 9);

        System.out.println("Temperatura em Fahrenheit: : " + temperatura);
        System.out.println("Temperatura em Celsius: " + temperaturaConvertida);


    }
}
