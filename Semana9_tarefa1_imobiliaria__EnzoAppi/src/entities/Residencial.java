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
public class Residencial extends Imovel {
    
    private int qtdVagasGaragem;
    private int qdtQuartos;
    private int qtdSuites;

    public Residencial(int qtdVagasGaragem, int qdtQuartos, int qtdSuites, String titulo, double valor, String bairro, double metragem) {
        super(titulo, valor, bairro, metragem);
        this.qtdVagasGaragem = qtdVagasGaragem;
        this.qdtQuartos = qdtQuartos;
        this.qtdSuites = qtdSuites;
    }

    public int getQtdVagasGaragem() {
        return qtdVagasGaragem;
    }

    public void setQtdVagasGaragem(int qtdVagasGaragem) {
        this.qtdVagasGaragem = qtdVagasGaragem;
    }

    public int getQdtQuartos() {
        return qdtQuartos;
    }

    public void setQdtQuartos(int qdtQuartos) {
        this.qdtQuartos = qdtQuartos;
    }

    public int getQtdSuites() {
        return qtdSuites;
    }

    public void setQtdSuites(int qtdSuites) {
        this.qtdSuites = qtdSuites;
    }
}
