package ExercisesJava;

import java.util.Scanner;
import java.text.NumberFormat;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberFormat formatacao = NumberFormat.getCurrencyInstance();
        try {
            System.out.println("Informe a taxa IPI(Imposto sobre produtos Industrializado)!!!");
            double ipi = sc.nextDouble();
            int count = 0;
            double total = 0;
            while(count < 2) {
                System.out.println("Digite o código: ");
                int cod = sc.nextInt();
                System.out.println("Informe o valor da peça: ");
                double valor = sc.nextDouble();
                System.out.println("Quantidade de peças: ");
                int qtd = sc.nextInt();
                total += (valor * qtd);
                count++;
            }
            String formt = formatacao.format((total) * (ipi / 100 + 1));
            System.out.println("O valor total a ser pago é " + formt);
            sc.close();
        } catch (Exception err) {
            System.err.printf("Dado inválido!!!%n" + err.getMessage());
        }

    }
}

