package com.br.gabriel.exercisesJava;

import java.util.Scanner;
/*
 *  Faça um algoritmo que leia 20 números e, ao final,
 *  escreva quantos estão entre 0 e 100,
 *  quantos estão entre 101 e 200 e
 *  quantos são maiores de 200.
 *
 */
public class Exercise20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int entre0e100 = 0;
            int entre101e200 = 0;
            int maiores200 = 0;
            for(int i = 0; i < 20; i++) {
                System.out.println((i + 1) + " - " + "Digite um número: ");
                double numero = sc.nextDouble();
                if(numero >= 0 && numero <= 100) entre0e100++;
                else if (numero >= 101 && numero <= 200) entre101e200++;
                else maiores200++;
            }
            System.out.printf("%d números estão entre 0 e 100, %d números estão entre 101 e 200, e %d são maiores que 200%n", entre0e100, entre101e200, maiores200);

        } catch (Exception err) {
            System.err.printf("Dado inválido!!!%n" + err.getMessage());
        }
    }
}
