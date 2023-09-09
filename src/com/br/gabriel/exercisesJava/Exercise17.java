package com.br.gabriel.exercisesJava;

import java.util.Scanner;
/*
 *  Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são maiores do que 8.
 *
 */
public class Exercise17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int maiorQueOito = 0;
            for(int i = 0; i < 20; i++) {
                System.out.println((i + 1) + " - " + "Digite um número: ");
                double numero = sc.nextDouble();
                if(numero > 8 ) maiorQueOito++;
            }
            System.out.printf("%d números são maiores que 8%n", maiorQueOito);
        } catch (Exception err) {
            System.err.printf("Dado inválido!!!%n" + err.getMessage());
        }
    }
}
