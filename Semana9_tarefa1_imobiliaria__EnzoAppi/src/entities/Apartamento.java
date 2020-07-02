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
public class Apartamento extends Residencial{
    
    private int andar;
    private boolean solNascente;
    private String torre;

    public Apartamento(int andar, boolean solNascente, String torre, int qtdVagasGaragem, int qdtQuartos, int qtdSuites, String titulo, double valor, String bairro, double metragem) {
        super(qtdVagasGaragem, qdtQuartos, qtdSuites, titulo, valor, bairro, metragem);
        this.andar = andar;
        this.solNascente = solNascente;
        this.torre = torre;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public boolean isSolNascente() {
        return solNascente;
    }

    public void setSolNascente(boolean solNascente) {
        this.solNascente = solNascente;
    }

    public String getTorre() {
        return torre;
    }

    public void setTorre(String torre) {
        this.torre = torre;
    }
}
