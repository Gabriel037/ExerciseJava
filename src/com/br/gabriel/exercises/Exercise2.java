package com.br.gabriel.exercises;

import java.util.Scanner;

/*
 *  Criar uma aplicação que leia os nomes
 *  de 20 produtos e armazene em um vetor
 *  em outro vetor armaze o valor unitário
 *  de cada produto.
 *  -> Crie um menu onde o usuário poderá encerrar na hora que ele quiser informando o número 0;
 *  1 - Vender (solicitar código do produto) e quantidade, mostrar, valor total;
 *  2 - Fechar caixa - valor toatal dsa vendas (Qtd + produtos);
 *
 *  3 - Produto X   10 vendidos
 *      Produto Y   50 vendidos
 *
 *  4 - Produto X   10 vendidos  1000,00
 *      Produto Y   50 vendidos  5000,00
 */
public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomeProduto = new String[3];
        double[] precoProduto = new double[3];
        int[] qtPrduto = new int[3];

        for (int i = 0; i < nomeProduto.length; i++) {
            System.out.println("Digite o nome do produto: ");
            nomeProduto[i] = sc.nextLine();
            System.out.println("Informe o preço do produto");
            precoProduto[i] = sc.nextDouble();
            sc.nextLine();
        }

        double totalCaixa = 0;
        while (true) {
            System.out.println("\n=-=-=-= Menu =-=-=-=\n");
            System.out.println("[1] - Vender");
            System.out.println("[2] - Fechar Caixa");
            System.out.println("[3] - Mostrar em ordem crescente os produtos mais vendidos");
            System.out.println("[4] - Listar todos produtos - Qtd vendida - Valor total por produto");
            System.out.println("[0] - Encerrar programa");
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Informe o código do produto:");
                    int cod = sc.nextInt();
                    System.out.println("Informe a quantidade de produtos");
                    int qt = sc.nextInt();
                    qtPrduto[cod] = qt;
                    double venda = precoProduto[cod] * qt;
                    totalCaixa += venda;
                    System.out.printf("\nO valor do produto é R$ %.2f", venda);
                    break;
                case 2:
                    System.out.printf("\nO valor total de vendas é R$ %.2f", totalCaixa);
                    break;
                case 3:
                    System.out.println("====> Produtos mais vendidos <====");
                    int aux = 0;
                    String auxNome = " ";
                    double auxPc = 0;
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                           if(qtPrduto[i] > qtPrduto[j]) {
                               aux = qtPrduto[i];
                               qtPrduto[i] = qtPrduto[j];
                               qtPrduto[j] = aux;
                               auxNome = nomeProduto[i];
                               nomeProduto[i] = nomeProduto[j];
                               nomeProduto[j] = auxNome;
                               auxPc = precoProduto[i];
                               precoProduto[i] = precoProduto[j];
                               precoProduto[j] = auxPc;
                           }
                        }
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Produto: " + nomeProduto[i] + " - Quantidade: " + qtPrduto[i] + "\n");
                    }
                    break;
                case 4:
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Produto: " + nomeProduto[i] + " - Quantidade: " + qtPrduto[i] + " - Valor Total R$ " +  qtPrduto[i] * precoProduto[i] + "\n");
                    }
                    break;
                default:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
            }
        }
    }
}
