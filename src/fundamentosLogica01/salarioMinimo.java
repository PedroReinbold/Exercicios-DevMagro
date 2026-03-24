package fundamentosLogica01;

/*  Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
 calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado.
 (Base para o Salário mínimo R$ 1.293,20).
 */


import java.util.Scanner;

public class salarioMinimo {
    public static void main(String[] args) {
        double salarioMinimo = 1293.20;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu salario: ");
        double salario = sc.nextDouble();
        double mediaSalario = (salario / salarioMinimo);
        System.out.println("Voce ganha "+ mediaSalario + " vezes o salário minimo.");


    }
}
