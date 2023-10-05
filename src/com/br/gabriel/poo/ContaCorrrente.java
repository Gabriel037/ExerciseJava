package com.br.gabriel.poo;
public class ContaCorrrente extends ContaBancaria{
    private float taxaManutencao;

    ContaCorrrente(float saldo, float taxaManutencao) {
        super(saldo);
        this.taxaManutencao = taxaManutencao;
    }
    void valorTaxa(float taxa) {
        this.taxaManutencao = (taxa / 100);
    }

    void setSaldoTaxaManutencao(float valor) {
        this.depositar(valor - (valor * (this.taxaManutencao / 100)));
    }

    void usarChequeEspecial(float valor) {
        this.depositar(valor);
    }

    float getValorChequeEspecial() {
        return (this.getSaldo() + (this.getSaldo() * taxaManutencao));
    }

    float getSaldoContaCorrente() {
        return this.getSaldo();
    }
}
