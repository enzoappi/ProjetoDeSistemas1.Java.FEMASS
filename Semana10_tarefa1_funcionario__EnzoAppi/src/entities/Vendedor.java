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
public class Vendedor extends Funcionario{
    
    private double comissao;

    public Vendedor(double comissao, String nome, double salarioBase) {
        super(nome, salarioBase);
        this.comissao = comissao / 100;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao / 100;
    }
    
    @Override
    public double calcularEncargos() {
        double encargos, inss, fgts;
        inss = this.salarioBase * 0.09;
        fgts = this.salarioBase * 0.08;
        encargos = fgts + inss + (this.salarioBase * this.comissao);
        return encargos;
    }
    
}
