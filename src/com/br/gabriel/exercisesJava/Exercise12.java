package com.br.gabriel.exercisesJava;

import java.util.Scanner;
/*
 *  Leia a idade de 20 pessoas e exiba a soma das idades.
 */
public class Exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int totalIdade = 0;
            for(int i = 0; i < 20; i++) {
                System.out.println((i + 1) + " - " + "Digite uma idade: ");
                int idade = sc.nextInt();
                totalIdade += idade;
            }
            System.out.printf("A soma total das idades informadas é %d", totalIdade);
            sc.close();
        } catch (Exception err) {
            System.err.printf("Dado inválido!!!%n" + err.getMessage());
        }
    }
}
