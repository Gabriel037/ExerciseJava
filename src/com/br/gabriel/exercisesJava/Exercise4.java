package com.br.gabriel.exercisesJava;

import java.util.Scanner;
import java.text.NumberFormat;
/*
 *  Escrever um algoritmo que lê: - a porcentagem do IPI a ser acrescido no valor das peças
 *  - o código da peça 1, valor unitário da peça 1, quantidade de peças 1
 *  - o código da peça 2, valor unitário da peça 2, quantidade de peças 2
 *  O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
 *  Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
 */
public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberFormat formatacao = NumberFormat.getCurrencyInstance();
        try {
            System.out.println("Informe a taxa IPI(Imposto sobre produtos Industrializado)!!!");
            double ipi = sc.nextDouble();
            int count = 0;
            double total = 0;
            while(count < 2) {
                System.out.println("Digite o código: ");
                int cod = sc.nextInt();
                System.out.println("Informe o valor da peça: ");
                double valor = sc.nextDouble();
                System.out.println("Quantidade de peças: ");
                int qtd = sc.nextInt();
                total += (valor * qtd);
                count++;
            }
            String formt = formatacao.format((total) * (ipi / 100 + 1));
            System.out.println("O valor total a ser pago é " + formt);
            sc.close();
        } catch (Exception err) {
            System.err.printf("Dado inválido!!!%n" + err.getMessage());
        }

    }
}

