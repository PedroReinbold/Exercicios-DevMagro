package estruturasDeControle02;

/*
Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago,
conforme a escolha da forma de pagamento pelo comprador e imprima na tela o valor final
do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.

 Tabela de Código de Condições de Pagamento:

 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto

 2 - À Vista no cartão de crédito, recebe 10% de desconto

 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros

 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
 */

import java.util.Scanner;

public class formaDePagamento {
    public static void main() {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valorDoProduto = input.nextDouble();

        System.out.println("Escolha a forma de pagamemento: ");
        System.out.println("[1] A vista em dinheiro ou pix (15% de desconto)");
        System.out.println("[2] A vista no cartão de crédito (10% de desconto)");
        System.out.println("[3] Parcelado no cartão em duas vezes (Sem juros)");
        System.out.println("[4] Parcelado no cartão em três vezes ou mais (Juros 10%)");

        int escolha = input.nextInt();

        if (escolha == 1) {
            valorDoProduto = valorDoProduto * 0.85;
        } else if (escolha == 2) {
            valorDoProduto = valorDoProduto * 0.90;
        } else if (escolha == 3) {
            valorDoProduto = valorDoProduto;
        } else if (escolha == 4) {
            valorDoProduto = valorDoProduto * 1.1;
        }

        System.out.println("Valor do pagamento: " + valorDoProduto);

    }
}
