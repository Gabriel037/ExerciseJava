package com.br.gabriel.exercisesJava;

import java.util.Scanner;

/*
 *  Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números.
 */
public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            double total = 0;
            System.out.println("Digite 10 números");
            for(int i = 0; i < 10; i++) {
                double value = sc.nextDouble();
                total += value;
            }
            System.out.printf("A soma total dos 10 números é %.2f%n", total);
        } catch (Exception err) {
            System.err.printf("Dado inválido!!!%n" + err.getMessage());
        }
    }
}
