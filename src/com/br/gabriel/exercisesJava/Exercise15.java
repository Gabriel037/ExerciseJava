package com.br.gabriel.exercisesJava;

import java.util.Scanner;
/*
 *   Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.
 */
public class Exercise15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int menorIdade = 0;
            StringBuilder nomeMenorIdade = new StringBuilder();
            int i = 0;
            while ( i < 3 ) {
                System.out.println("Digite seu nome:");
                String nome = sc.nextLine();
                System.out.println("Digite sua idade:");
                int idade = sc.nextInt();
                sc.nextLine();
                if (i == 0 || idade <= menorIdade) {
                    menorIdade = idade;
                    nomeMenorIdade.append(" ").append(nome);
                }
                i++;
            }
            System.out.printf("O nome da menor idade informada é%s com a idade de %d Anos", nomeMenorIdade.toString(), menorIdade);
            sc.close();
        } catch (Exception err) {
            System.err.printf("Dado inválido!!!%n" + err.getMessage());
        }
    }
}
