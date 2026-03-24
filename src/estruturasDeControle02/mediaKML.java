package estruturasDeControle02;

/*

Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que o carro
faz 12km com um litro. Deve-se fornecer ao usuário a quantidade de litros utilizados para fazer a viagem
e o tempo gasto.

 */

import java.util.Scanner;

public class mediaKML {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a velocidade média: ");
        double vm = sc.nextDouble();

        System.out.println("Digite a distancia percorrida: ");
        double dist = sc.nextDouble();

        double litrosUsados = dist / 12;

        double tempoGasto = dist / vm;

        System.out.println("Tempo gasto: " + tempoGasto + " horas.");
        System.out.println("Litros usados: " + litrosUsados + " litros.");
    }
}
