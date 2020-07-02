/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.ContaEspecial;
import entities.ContaGenerica;
import entities.ContaSuperEspecial;
import java.util.Locale;
import util.RelatorioMovimento;

/**
 *
 * @author ut2u
 */
public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        RelatorioMovimento rM = new RelatorioMovimento();
        
        ContaGenerica cg = new ContaGenerica(1234, 500.0);
        System.out.println("\nConta Generica criada...."
                + "\nNumero da conta: " + cg.getNrConta()
                + "\nSaldo da Conta: R$" + rM.emitirDetalhamentoMovimentacoes(cg)
                + "\nTransacoes realizadas: " + rM.emitir(cg));
        cg.depositar(10.00);
        cg.sacar(1500.00);
        System.out.println("\nApos operacoes...."
                + "\nNumero da conta: " + cg.getNrConta()
                + "\nSaldo da Conta: R$" + cg.getSaldo()
                + "\nTransacoes realizadas: " + rM.emitirDetalhamentoMovimentacoes(cg)
                + "\nMovimentacao total: R$" + rM.emitir(cg));
        
        ContaEspecial ce = new ContaEspecial(1500.0, 5678, 1000.0);
        System.out.println("\n\nConta Especial criada...."
                + "\nNumero da conta: " + ce.getNrConta()
                + "\nSaldo da Conta: R$" + rM.emitirDetalhamentoMovimentacoes(ce)
                + "\nTransacoes realizadas: " + rM.emitir(ce));
        ce.depositar(10.00);
        ce.sacar(1500.00);
        ce.sacar(200.00);
        ce.depositar(390.25);
        ce.sacar(1000.00);
        System.out.println("\nApos operacoes...."
                + "\nNumero da conta: " + ce.getNrConta()
                + "\nSaldo da Conta: R$" + ce.getSaldo()
                + "\nTransacoes realizadas: \n" + rM.emitirDetalhamentoMovimentacoes(ce)
                + "\nMovimentacao total: R$" + rM.emitir(ce));
        
        ContaSuperEspecial cse = new ContaSuperEspecial(10000.0, 9123, 5000.0);
        System.out.println("\n\nConta Super Especial criada...."
                + "\nNumero da conta: " + cse.getNrConta()
                + "\nSaldo da Conta: R$" + rM.emitirDetalhamentoMovimentacoes(cse)
                + "\nTransacoes realizadas: " + rM.emitir(cse));
        cse.depositar(5000.00);
        cse.sacar(10000.00);
        cse.sacar(9500.00);
        cse.depositar(9500.00);
        cse.sacar(12000.00);
        System.out.println("\nApos operacoes...."
                + "\nNumero da conta: " + cse.getNrConta()
                + "\nSaldo da Conta: R$" + cse.getSaldo()
                + "\nTransacoes realizadas: \n" + rM.emitirDetalhamentoMovimentacoes(cse)
                + "\nMovimentacao total: R$" + rM.emitir(cse));
    }
}
