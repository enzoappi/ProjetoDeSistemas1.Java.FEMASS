/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;

/**
 *
 * @author ut2u
 */
public class Pais {
    
    private String nome;
    private String capital;
    private double dimensao;
    private ArrayList<Pais> paisesFronteiricos;

    public Pais(String nome, String capital, double dimensao) {
        this.nome = nome;
        this.capital = capital;
        this.dimensao = dimensao;
        this.paisesFronteiricos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public ArrayList<Pais> getPaisesFronteiricos() {
        return this.paisesFronteiricos;
    }

    public void setPaisesFronteiricos(Pais pais) {
        this.paisesFronteiricos.add(pais);
    }
    
    public boolean isPaisIgual(Pais pais) {
        if(this.getNome().equals(pais.getNome()) && this.getCapital().equals(pais.getCapital())) {
            return true;
        }
        return false;
    }
    
    public String toStringPaisesFronteiricos() {
        String pF = "";
        for(Pais p : this.paisesFronteiricos) {
            pF += "[ " + p.getNome() + ", " + p.getCapital()
                    + ", " + Double.toString(p.getDimensao()) + " ] ";
        }
        return pF;
    }
    
    public String toStringPaisesVizinhosComuns(Pais pais) {
    //public ArrayList<Pais> paisesFronteiraEntrePaises(Pais pais) {
        //ArrayList<Pais> paisesVizinhos = new ArrayList<>();
        String pV = "";
        for(Pais po : this.paisesFronteiricos) {
            for(Pais p2 : pais.getPaisesFronteiricos()) {
                if(po.getNome().equals(p2.getNome())) {
                    //paisesVizinhos.add(po);
                    pV += "[ " + po.getNome() + ", " + po.getCapital()
                    + ", " + Double.toString(po.getDimensao()) + " ] ";
                }
            }
        }
        return pV;
    }
    
}
