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
public class Casa extends Residencial{

    public Casa(int qtdVagasGaragem, int qdtQuartos, int qtdSuites, String titulo, double valor, String bairro, double metragem) {
        super(qtdVagasGaragem, qdtQuartos, qtdSuites, titulo, valor, bairro, metragem);
    }
}
