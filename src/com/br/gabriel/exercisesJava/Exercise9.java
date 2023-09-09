package com.br.gabriel.exercisesJava;

import java.util.Scanner;
/*
 *  Leia o nome do usuário e escreva o nome dele na tela 10 vezes.
 */
public class Exercise9 {
    public static void main(String[] args) {
        try( Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite seu nome");
            String nome = sc.nextLine();
            for(int i = 1; i <= 10; i++) {
                System.out.println("[" + i + "] " + nome);
            }
        } catch (Exception err) {
            System.err.printf("Dado inválido!!!%n" + err.getMessage());
        }

    }
}
