package estruturasDeControle02;

import java.util.Random;

//Faça um algoritmo que mostre um valor aleatório entre 0 e 100.

public class valorAleatorio {
    static void main() {
        int min = 0;
        int max = 100;

        Random random = new Random();

        int intervalo = random.nextInt((max - min) + 1) + min;

        System.out.println(intervalo);


    }
}
