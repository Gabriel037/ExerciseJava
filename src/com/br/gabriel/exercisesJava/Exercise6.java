package com.br.gabriel.exercisesJava;

import java.util.Scanner;
/*
 *  Desenvolva um algoritmo em Java que leia
 *  um número inteiro e imprima o seu antecessor e seu sucessor.
 *
 */
public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite um número inteiro: ");
            int num = sc.nextInt();
            System.out.println("Antecessor " + (num - 1) + " <= [" + num + "] => " + (num + 1) + " Sucessor ");
            sc.close();
        } catch (Exception err) {
            System.err.printf("Dado inválido!!!%n" + err.getMessage());
        }
    }
}
