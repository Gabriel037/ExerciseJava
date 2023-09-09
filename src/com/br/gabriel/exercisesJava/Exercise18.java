package com.br.gabriel.exercisesJava;

import java.util.Scanner;
/*
 *  Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares
 */
public class Exercise18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int numerosPares = 0;
            for(int i = 0; i < 20; i++) {
                System.out.println((i + 1) + " - " + "Digite um número: ");
                double numero = sc.nextDouble();
                if(numero % 2 == 0 ) numerosPares++;
            }
            System.out.printf("%d números são pares%n", numerosPares);
        } catch (Exception err) {
            System.err.printf("Dado inválido!!!%n" + err.getMessage());
        }
    }
}
