package com.br.gabriel.poo;
import java.io.IOException;
import java.util.Scanner;

public class SistemaBanco {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        ContaPoupanca contaPoupanca = new ContaPoupanca(0, 0);
        ContaCorrrente contaCorrrente = new ContaCorrrente(0, 0);
        System.out.print("=======> Seja bem vindo ao sistema bancário <=======");
        String menu = """

                ====================================================
                |          [1] - Extrato conta Poupança            |
                |          [2] - Depositar conta Poupança          |
                |          [3] - Sacar conta Poupança              |
                |          [4] - Extrato conta corrente            |
                |          [5] - Depositar conta corrente          |
                |          [6] - Sacar conta corrente              |
                |          [7] - Utilizar cheque especial          |
                |          [0] - Finalizar Operação                |
                ====================================================
                """;


        while (true) {
            limparTela();
            System.out.println(menu);
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println();
                    System.out.printf("Seu extrato conta poupança R$ %.2f\n", contaPoupanca.getSaldoJuros());
                    break;
                case 2:
                    System.out.println("Informe a taxa de juros: ");
                    contaPoupanca.setJuros(sc.nextFloat());
                    System.out.println("Depositar conta poupança: ");
                    contaPoupanca.setSaldoJuros(sc.nextFloat());
                    System.out.printf("Seu saldo com %.2f, de juros é R$%.2f",contaPoupanca.getJuros(), contaPoupanca.getSaldoJuros() );
                    break;
                case 3:
                    System.out.print("Informe o valor que deseja sacar: ");
                    contaPoupanca.sacar(sc.nextFloat());
                    break;
                case 4:
                    System.out.printf("Seu extrato conta corrente R$ %.2f\n", contaCorrrente.getSaldoContaCorrente());
                    break;
                case 5:
                    System.out.println("Informe a taxa de manutenção: ");
                    contaCorrrente.valorTaxa(sc.nextFloat());
                    System.out.println("Depositar conta poupança: ");
                    contaCorrrente.setSaldoTaxaManutencao(sc.nextFloat());
                    break;
                case 6:
                    System.out.print("Informe o valor que deseja sacar: ");
                    contaCorrrente.sacar(sc.nextFloat());
                    break;
                case 7:
                    System.out.println("Informe o valor do cheque especial");
                    contaCorrrente.usarChequeEspecial(sc.nextFloat());
                    System.out.println("Informe o valor da taxa");
                    contaCorrrente.valorTaxa(sc.nextFloat());
                    System.out.printf("Valor total a pagar do chege especial R$ %.2f\n", contaCorrrente.getValorChequeEspecial());
                    break;
                case 0:
                    System.out.println("Saindo....");
                    System.exit(0);

            }

        }

    }

    private static void limparTela() {
        String nomeSistema = System.getProperty("os.name").toLowerCase();
        if (nomeSistema.contains("windows")) {
            try {
                ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", "cls");
                processBuilder.inheritIO();
                Process process = processBuilder.start();
                process.waitFor();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
