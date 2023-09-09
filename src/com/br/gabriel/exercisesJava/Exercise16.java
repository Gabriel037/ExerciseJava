package com.br.gabriel.exercisesJava;

import java.util.Scanner;
/*
 *  Crie um algoritmo leia um número do usuário e exiba a sua tabuada de multiplicação.
 *
 */
public class Exercise16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Informe um número inteiro: ");
            int value = sc.nextInt();
            int resultado;
            for(int i = 1; i <= 9; i++) {
                resultado = value * i;
                System.out.printf("%d x %d = %d%n", value, i, resultado);
            }
        } catch (Exception err) {
            System.err.println("Dado inválido!!!%n" + err.getMessage());
        }
    }
}
