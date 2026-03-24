package estruturasDeControle02;

/*

Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Sara
seja maior que Francisco.

 */

public class anosNecessarios {
    public static void main(String[] args) {

        int tempo = 0;
        int alturaFrancisco = 150;
        int alturaSara = 110;

        while (alturaSara < alturaFrancisco) {
            alturaSara += 3;
            alturaFrancisco += 2;
            tempo++;
        }

        System.out.println("Serão necessários "+ tempo + " anos para que Sara seja maior que Francisco.");

    }
}
