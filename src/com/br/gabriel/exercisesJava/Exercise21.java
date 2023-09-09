package com.br.gabriel.exercisesJava;

import java.util.Scanner;
/*
 * Escreva um algoritmo que leia uma sequência de números do usuário
 * e realize a soma desses números. Encerre a execução quando um número negativo for digitado.
 *
 */
public class Exercise21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            double totalSoma = 0;
            boolean control = true;
            while (control) {
                System.out.println("Digite um número: ");
                double numero = sc.nextDouble();
                if(numero >= 0)  totalSoma += numero;
                if(numero < 0) control = false;
            }
            System.out.printf("A soma total de números positivos é %.2f", totalSoma);

        } catch (Exception err) {
            System.err.printf("Dado inválido!!!%n" + err.getMessage());
        }
    }
}
