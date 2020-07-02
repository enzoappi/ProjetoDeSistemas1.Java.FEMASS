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
public class Freelancer extends Funcionario{
    
    private int diasTrabalhados;
    private double valorDia;

    public Freelancer(int diasTrabalhados, double valorDia, String nome, double salarioBase) {
        super(nome, salarioBase);
        this.diasTrabalhados = diasTrabalhados;
        this.valorDia = valorDia;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public double getValorDia() {
        return valorDia;
    }

    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }
    
    @Override
    public double calcularEncargos() {
        double encargos;
        encargos = this.valorDia * this.diasTrabalhados;
        return encargos;
    }
    
}
