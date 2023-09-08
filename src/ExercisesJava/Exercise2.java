package ExercisesJava;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double media1 = (double) ((8 + 9 + 7) / 3);
        Double media2 = (double) ((4 + 5 + 6) / 3);
        Double somaMedias = (media1 + media2);
        Double mediaTotal = (media1 + media2) / 2;
        System.out.printf("Média 1 => %.2f : Média 2 => %.2f : soma das médias => %.2f : média total %.2f%n" , media1, media2, somaMedias, mediaTotal);
        sc.close();
    }
}
