package com.br.gabriel.poo;
public class ContaBancaria {
    private float saldo;

    ContaBancaria(float saldo) {
        this.saldo = saldo;
    }
    float getSaldo() {
        return this.saldo;
    }
    void depositar(float valor) {
        this.saldo += valor;
    }
    void sacar(float valor) {
        if(valor <= this.saldo) {
            this.saldo -= valor;
        }
        else {
            System.err.println("Saldo insuficiente!!!");
        }
    }


}
