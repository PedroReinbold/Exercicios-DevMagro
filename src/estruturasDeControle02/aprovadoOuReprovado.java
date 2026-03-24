package estruturasDeControle02;

/*
Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas,
imprima na tela o nome do aluno e se o aluno foi aprovado ou reprovado.
Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.
 */

import java.util.Scanner;

public class aprovadoOuReprovado {
    public static void main(String[] args) {

        String nomeAluno = "Pedro";
        double media;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        double nota1 = input.nextDouble();

        System.out.println("Digite a nota 2: ");
        double nota2 = input.nextDouble();

        System.out.println("Digite a nota 3: ");
        double nota3 = input.nextDouble();

        System.out.println("Digite a nota 4: ");
        double nota4 = input.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 70){
            System.out.println("O aluno " + nomeAluno + " foi aprovado com media " + media);
        }else{
            System.out.println("O aluno " + nomeAluno + " foi reprovado com media " + media);
        }

    }
}
