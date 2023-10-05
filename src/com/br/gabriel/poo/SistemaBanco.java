package com.br.gabriel.poo;
import java.util.Scanner;

public class SistemaBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria(0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(0, 0);
        ContaCorrrente contaCorrrente = new ContaCorrrente(0, 0);
        System.out.print("=======> Seja bem vindo ao sistema bancário <=======");
        String menu = "\n====================================================\n" +
                    "|          [1] - Extrato                           |\n"   +
                    "|          [2] - Depositar                         |\n" +
                    "|          [3] - Sacar                             |\n" +
                    "|          [4] - Extrato conta Poupança            |\n" +
                    "|          [5] - Depositar conta Poupança          |\n" +
                    "|          [6] - Sacar conta Poupança              |\n" +
                    "|          [7] - Extrato conta corrente            |\n" +
                    "|          [8] - Depositar conta corrente          |\n" +
                    "|          [9] - Sacar conta corrente              |\n" +
                    "|          [10] - Utilizar cheque especial         |\n" +
                    "|          [11] - Finalizar                        |\n" +
                     "====================================================\n";


        while (true) {
            System.out.println(menu);
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.printf("Seu extrato R$ %.2f\n", conta.getSaldo());
                    break;
                case 2:
                    System.out.print("Digite o valor para depositar: ");
                    conta.depositar(sc.nextFloat());
                    break;
                case 3:
                    System.out.print("Informe o valor que deseja sacar: ");
                    conta.sacar(sc.nextFloat());
                    break;
                case 4:
                    System.out.println();
                    System.out.printf("Seu extrato conta poupança R$ %.2f\n", contaPoupanca.getSaldoJuros());
                    break;
                case 5:
                    System.out.println("Informe a taxa de juros: ");
                    contaPoupanca.setJuros(sc.nextFloat());
                    System.out.println("Depositar conta poupança: ");
                    contaPoupanca.setSaldoJuros(sc.nextFloat());
                    System.out.printf("Seu saldo com %.2f, de juros é R$%.2f",contaPoupanca.getJuros(), contaPoupanca.getSaldoJuros() );
                    break;
                case 6:
                    System.out.print("Informe o valor que deseja sacar: ");
                    contaPoupanca.sacar(sc.nextFloat());
                    break;
                case 7:
                    System.out.printf("Seu extrato conta corrente R$ %.2f\n", contaCorrrente.getSaldoContaCorrente());
                    break;
                case 8:
                    System.out.println("Informe a taxa de manutenção: ");
                    contaCorrrente.valorTaxa(sc.nextFloat());
                    System.out.println("Depositar conta poupança: ");
                    contaCorrrente.setSaldoTaxaManutencao(sc.nextFloat());
                    break;
                case 9:
                    System.out.print("Informe o valor que deseja sacar: ");
                    contaCorrrente.sacar(sc.nextFloat());
                    break;
                case 10:
                    System.out.println("Informe o valor do cheque especial");
                    contaCorrrente.usarChequeEspecial(sc.nextFloat());
                    System.out.println("Informe o valor da taxa");
                    contaCorrrente.valorTaxa(sc.nextFloat());
                    System.out.printf("Valor total a pagar do chege especial R$ %.2f\n", contaCorrrente.getValorChequeEspecial());
                    break;
                case 11:
                    System.out.println("Saindo....");
                    System.exit(0);

            }
        }

    }
}