package com.br.gabriel.exercisesJava;

import java.text.NumberFormat;
import java.util.Scanner;

/*
 *  Crie um algoritmo que leia o valor do salário mínimo
 *  e o valor do salário de um usuário, calcule a quantidade
 *  de salários mínimos que esse usuário ganha e imprima o resultado.
 *  (1SM=R$788,00)
 */
public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberFormat formatSalario = NumberFormat.getCurrencyInstance();
        try {
            double salMin = 788.00;
            String salMinFormat = formatSalario.format(salMin);
            System.out.println("Informe seu salário: ");
            double sal = sc.nextDouble();
            String salFormat = formatSalario.format(sal);
            float qtSalMin = (float) (sal / salMin);
            System.out.println("Seu salário de " + salFormat + " equivale à " + String.format("%.1f", qtSalMin) + " salários mínimos");
            System.out.println("Salário mínimo atual " + salMinFormat);
            sc.close();
        } catch (Exception err) {
            System.err.printf("Dado inválido!!!%n" + err.getMessage());
        }
    }
}