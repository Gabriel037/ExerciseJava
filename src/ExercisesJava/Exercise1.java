package ExercisesJava;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite sua idade em anos: ");
            int idadeAno = sc.nextInt();
            System.out.println("Digite agora os meses: ");
            int idadeMes = sc.nextInt();
            System.out.println("Digite agora os dias");
            int idadeDia = sc.nextInt();
            // Somando todos os dados informados pelo usuário
            int totalDia = ((idadeAno * 365) + (idadeMes * 30) + idadeDia);
            System.out.printf("%d Anos, %d Meses, %d Dias é igual à %d dias de vida", idadeAno, idadeMes, idadeMes, totalDia);

        } catch (Exception err) {
            System.err.println("Dado inválido!!!");
        }
    }
}
