package com.br.gabriel.exercisesJava;
/*
 *Escreva um algoritmo que calcule a soma dos números de 1 a 15.
 */
public class Exercise8 {
    public static void main(String[] args) {
        int somaTotal = 0;
        for (int i = 1; i <= 15; i++) {
            somaTotal += i;
        }
        System.out.println("A soma total de 1 até 15 é " + somaTotal);
    }
}
