/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import entities.ContaGenerica;

/**
 *
 * @author ut2u
 */
public class RelatorioMovimento {
    public double emitir(ContaGenerica conGen) {
        return conGen.movimentoTotal();
    }
    public String emitirDetalhamentoMovimentacoes(ContaGenerica conGen) {
        String DetMovs = "";
        for(Double dM: conGen.getTransacao()) {
            if(dM < 0) {
                DetMovs += "Saque: R$" + dM;
            }
            else {
                DetMovs += "Deposito: R$" + dM;
            }
            DetMovs += "\n";
        }
        return DetMovs;
    }
}
