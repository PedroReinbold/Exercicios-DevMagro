package estruturasDeControle02;

/*

Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e
percentual de desconto do INSS. Imprima na tela o salário líquido final.

 */

import java.util.Scanner;

public class salario {
    static void main() {

        double salarioBruto;
        double salarioLiquido;
        double desconto;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor da hora aula: ");
        double horaAula = sc.nextDouble();

        System.out.println("Digite o numero de aulas lecionadas: ");
        int aulasLecionadas = sc.nextInt();

        System.out.println("Digite o percentual de desconto do INSS: ");
        double percentualDesconto = sc.nextDouble();

        salarioBruto = horaAula * aulasLecionadas;
        desconto = salarioBruto * (percentualDesconto / 100);
        salarioLiquido = salarioBruto - desconto;

        System.out.println("Salario bruto: R$" + salarioBruto);
        System.out.println("Desconto INSS: " + percentualDesconto + "% R$" + desconto);
        System.out.println("Salario liquido: R$" + salarioLiquido);

    }
}
