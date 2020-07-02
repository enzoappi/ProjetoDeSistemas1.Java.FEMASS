/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author ut2u
 */
public class ContaSuperEspecial extends ContaGenerica{
    
    private double limiteSuperEspecial;

    public ContaSuperEspecial(double limiteSuperEspecial, int nrConta, double saldo) {
        super(nrConta, saldo);
        this.limiteSuperEspecial = limiteSuperEspecial;
    }

    public double getLimiteSuperEspecial() {
        return limiteSuperEspecial;
    }

    private void setLimiteSuperEspecial(double limiteSuperEspecial) {
        this.limiteSuperEspecial = limiteSuperEspecial;
    }
    
    @Override
    public void sacar(double valor) {
        if(this.saldo >= -this.limiteSuperEspecial && this.saldo - valor >= -this.limiteSuperEspecial) {
            this.saldo -= valor;
            this.transacao.add(valor * (-1));
        }
    }
}
