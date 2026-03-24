package estruturasDeControle02;

/*
Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e \
se ela é maior ou menor de idade.
 */

import java.util.Scanner;

public class maiorDeIdade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        System.out.println("Nome: " + nome);

        if (idade >= 18) {
            System.out.println("Maior de idade.");
        }else{
            System.out.println("Menor de idade.");
        }

    }
}
