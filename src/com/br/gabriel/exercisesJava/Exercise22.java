package com.br.gabriel.exercisesJava;

import java.util.Scanner;
/*
 *   Implemente um jogo de adivinhação em que
 *      o computador escolhe um número aleatório e o jogador tenta adivinhá-lo. Use um loop do-while.
 *
 */
public class Exercise22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int numeroAleatorio = (int) Math.floor(Math.random() * 10) + 1;
            boolean control = true;
            while (control) {
                System.out.println("Tente adivinha um número de 1 até 10: ");
                double numero = sc.nextDouble();
                if(numero == numeroAleatorio)  control = false;
                else System.err.println("Tente novamente!!!");
                sc.nextLine();
            }
            System.out.println("Parabéns você acertou o número aleatório => " + numeroAleatorio);
            sc.close();

        } catch (Exception err) {
            System.err.printf("Dado inválido!!!%n" + err.getMessage());
        }
    }
}
