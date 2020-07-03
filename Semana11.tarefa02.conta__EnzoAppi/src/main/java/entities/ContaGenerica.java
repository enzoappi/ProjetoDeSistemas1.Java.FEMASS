/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;

/**
 *
 * @author ut2u
 */
public class ContaGenerica {
    
    protected int nrConta;
    protected double saldo;
    protected ArrayList<Double> transacao;

    public ContaGenerica(int nrConta, double saldo) {
        this.nrConta = nrConta;
        this.saldo = saldo;
        this.transacao = new ArrayList<>();
    }

    public int getNrConta() {
        return nrConta;
    }

    public void setNrConta(int nrConta) {
        this.nrConta = nrConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Double> getTransacao() {
        return transacao;
    }
    
    public void depositar(double valor) {
        this.saldo += valor;
        this.transacao.add(valor);
    }
    
    public void sacar(double valor) {
        if(this.saldo > 0.0 && this.saldo - valor > 0.0) {
            this.saldo -= valor;
            this.transacao.add(valor * (-1));
        }
    }
    
    public double movimentoTotal() {
        double movimentoTotal = 0.0;
        for(Double v: this.transacao) {
            movimentoTotal += v;
        }
        return movimentoTotal;
    }
}
