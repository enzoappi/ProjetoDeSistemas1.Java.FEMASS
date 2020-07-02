/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import entities.Funcionario;

/**
 *
 * @author ut2u
 */
public class GastoTotal {
    
    public double gastoTotal(Funcionario fun) {
        double totalgasto = fun.getSalarioBase() + fun.calcularEncargos();
        return totalgasto;
    }
}
