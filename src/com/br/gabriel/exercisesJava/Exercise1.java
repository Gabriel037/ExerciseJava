package com.br.gabriel.exercisesJava;

import java.util.Scanner;
/*
 *  Faça um algoritmo que leia a idade de uma pessoa expressa em anos,
 *  meses e dias e mostre-a expressa em dias. Leve em consideração
 *  o ano com 365 dias e o mês com 30.
 *  (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
 */
public class Exercise1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite sua idade em anos: ");
            int idadeAno = sc.nextInt();
            System.out.println("Digite agora os meses: ");
            int idadeMes = sc.nextInt();
            System.out.println("Digite agora os dias");
            int idadeDia = sc.nextInt();
            // Somando todos os dados informados pelo usuário
            int totalDia = ((idadeAno * 365) + (idadeMes * 30) + idadeDia);
            System.out.printf("%d Anos, %d Meses, %d Dias é igual à %d dias de vida", idadeAno, idadeMes, idadeMes, totalDia);
            sc.close();

        } catch (Exception err) {
            System.err.println("Dado inválido!!!");
        }
    }
}
