package com.br.gabriel.exercisesJava;

import java.util.Scanner;
/*
 *   Leia o nome um número do usuário
 *   um número N e escreva o nome dele na tela N vezes.
 */

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite seu nome:");
            String nome = sc.nextLine();
            System.out.println("Informe a quantidade de repetições:");
            int count = sc.nextInt();
            for(int i = 1; i <= count; i++) {
                System.out.println("[" + i + "] " + nome);
            }
            sc.close();
        } catch (Exception err) {
            System.err.printf("Dado inválido!!!%n" + err.getMessage());
        }
    }
}
