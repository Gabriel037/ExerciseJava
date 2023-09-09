package com.br.gabriel.exercisesJava;

import java.util.Scanner;
/*
 *  Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.
 *
 */
public class Exercise19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int entre0e100 = 0;
            for(int i = 0; i < 20; i++) {
                System.out.println((i + 1) + " - " + "Digite um número: ");
                double numero = sc.nextDouble();
                if(numero >= 0 && numero <= 100) entre0e100++;
            }
            System.out.printf("%d números estão entre 0 e 100%n", entre0e100);

        } catch (Exception err) {
            System.err.printf("Dado inválido!!!%n" + err.getMessage());
        }
    }
}
