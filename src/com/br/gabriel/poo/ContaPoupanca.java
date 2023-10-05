package com.br.gabriel.poo;
public class ContaPoupanca extends ContaBancaria {
    private float juros;
    ContaPoupanca(float saldo, float juros) {
        super(saldo);
        this.juros = juros;
    }
    void setJuros(float tax) {
        this.juros = tax;
    }
    void setSaldoJuros(float valor) {
        this.depositar(valor + (valor * (juros/ 100)));
    }
    float getJuros() {
        return this.juros;
    }
    float getSaldoJuros() {
        return this.getSaldo();
    }
}
