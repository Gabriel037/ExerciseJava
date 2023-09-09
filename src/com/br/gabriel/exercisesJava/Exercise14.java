package com.br.gabriel.exercisesJava;

import java.util.Scanner;
/*
 *  Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade
 *
 */
public class Exercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int totalMaiorIdade = 0;
            for(int i = 0; i < 20; i++) {
                System.out.println((i + 1) + " - " + "Digite uma idade: ");
                int idade = sc.nextInt();
                if(idade >= 18 ) totalMaiorIdade++;
            }
            System.out.printf("Na lista de idades informada, %d são maiores de idade", totalMaiorIdade);
            sc.close();
        } catch (Exception err) {
            System.err.printf("Dado inválido!!!%n" + err.getMessage());
        }
    }
}
