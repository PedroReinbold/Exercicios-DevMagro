package estruturasDeControle02;

/*

Faça um algoritmo que leia três valores que representam os três lados de um triângulo
e verifique se são válidos, determine se o triângulo é equilátero, isósceles ou escaleno.

 */

import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double anguloA = input.nextDouble();
        double anguloB = input.nextDouble();
        double anguloC = input.nextDouble();

        if (anguloA == anguloB && anguloB == anguloC) {
            System.out.println("Trianguilo equilátero.");
        } else if (anguloA == anguloB || anguloB == anguloC || anguloA == anguloC) {
            System.out.println("Trianguilo isóceles.");
        } else {
            System.out.println("Triângulo escaleno.");
        }


    }
}
