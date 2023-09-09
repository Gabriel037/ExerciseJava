package com.br.gabriel.exercisesJava;

import java.util.*;
/*
 *  Crie um programa que imprima a sequência
 * 'de Fibonacci até um número específico de termos inserido pelo usuário.
 *
 */
public class Exercise23 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o número de termos pretendidos na sequência de Fibonacci:");
            int n = sc.nextInt();

            int[] fibonacci = new int[n];
            int primeiroTermoFibonacci = 0;

            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    fibonacci[i] = primeiroTermoFibonacci;
                } else if(i == 1) {
                    fibonacci[i] = primeiroTermoFibonacci + 1;
                } else {
                    int proximoTermo = fibonacci[i - 1] + fibonacci[i - 2];
                    fibonacci[i] = proximoTermo;
                }
            }
            for(int l = 0; l < fibonacci.length; l++) {
                System.out.printf("%d ", fibonacci[l]);
            }
            sc.close();

        } catch (Exception err) {
            System.err.printf("Dado inválido!!!%n" + err.getMessage());
        }
    }
}
