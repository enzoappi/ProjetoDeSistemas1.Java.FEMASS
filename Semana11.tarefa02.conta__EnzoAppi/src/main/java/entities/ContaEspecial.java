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
public class ContaEspecial extends ContaGenerica{
    
    private double limiteEspecial;

    public ContaEspecial(double limiteEspecial, int nrConta, double saldo) {
        super(nrConta, saldo);
        this.limiteEspecial = limiteEspecial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    private void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }
    
    @Override
    public void sacar(double valor) {
        if(this.saldo >= -this.limiteEspecial && this.saldo - valor >= -this.limiteEspecial) {
            this.saldo -= valor;
            this.transacao.add(valor * (-1));
        }
    }
}
