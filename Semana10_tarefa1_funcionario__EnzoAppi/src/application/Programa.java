/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Freelancer;
import entities.Funcionario;
import entities.Vendedor;
import java.util.Locale;
import util.GastoTotal;

/**
 *
 * @author ut2u
 */
public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Funcionario funcionario = new Funcionario("Jose", 2500.00);
        Vendedor vendedor = new Vendedor(3, "Ademir", 1500.00);
        Freelancer freelancer = new Freelancer(20, 80.10, "Francisco", 350.00);
        GastoTotal gT = new GastoTotal();
        
        
        System.out.println("Demonstracao de gastos:"
                + "\n\nFuncionario: " + funcionario.getNome()
                + "\nSalario base: R$" + funcionario.getSalarioBase()
                + "\nEncargos: R$" + funcionario.calcularEncargos()
                + "\nGasto total: R$" + gT.gastoTotal(funcionario)
                + "\n\nVendedor: " + vendedor.getNome()
                + "\nSalario base: R$" + vendedor.getSalarioBase()
                + "\nComissao: " + ((vendedor.getComissao()) * 100) + "%"
                + "\nEncargos: R$" + vendedor.calcularEncargos()
                + "\nGasto total: R$" + gT.gastoTotal(vendedor)
                + "\n\nFreelancer: " + freelancer.getNome()
                + "\nSalario base: R$" + freelancer.getSalarioBase()
                + "\nValor dia: R$" + freelancer.getValorDia()
                + "\nDias trabalhados: " + freelancer.getDiasTrabalhados()
                + "\nEncargos: R$" + freelancer.calcularEncargos()
                + "\nGasto total: R$" + gT.gastoTotal(freelancer));
    }
}
