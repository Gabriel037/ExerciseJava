package com.br.gabriel.exercisesJava;

import java.util.Scanner;
/*
 *  Informar um saldo e imprimir o saldo com reajuste de 1%.
 *
 */

public class Exercise3 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Informe um valor: ");
            double valor = sc.nextDouble();
            double aumento =  ((valor * 0.01) + valor);
            System.out.printf("%.2f com 1%% de aumento => %.2f", valor, aumento);
            sc.close();
        } catch (Exception err) {
            System.err.printf("Dado inválido!!!%n" + err.getMessage());
        }

    }
}
