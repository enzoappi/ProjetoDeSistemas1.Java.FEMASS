/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Pais;
import java.util.Locale;

/**
 *
 * @author ut2u
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        //Instanciando os paises
        Pais pais1 = new Pais("Italia", "Roma", 301338);
        Pais pais2 = new Pais("Franca", "Paris", 543965);
        Pais pais3 = new Pais("Alemanha", "Berlim", 357051);
        Pais pais4 = new Pais("Inglaterra", "Londres", 130395);
        Pais pais5 = new Pais("Espanha", "Madrid", 504030);
        Pais pais6 = new Pais("Portugal", "Lisboa", 92256);
        
        //Settando as fronteiras
        pais1.setPaisesFronteiricos(pais2);
        pais2.setPaisesFronteiricos(pais1);
        pais2.setPaisesFronteiricos(pais3);
        pais2.setPaisesFronteiricos(pais5);
        pais3.setPaisesFronteiricos(pais2);
        pais5.setPaisesFronteiricos(pais2);
        pais5.setPaisesFronteiricos(pais6);
        pais6.setPaisesFronteiricos(pais5);
        
        //teste dos metodos
        System.out.println("\nPais: " + pais2.getNome()
                + "\nCapital: " + pais2.getCapital()
                + "\nDimensao: " + pais2.getDimensao() + "Km2"
                + "\nPaises fronteiricos: " + pais2.toStringPaisesFronteiricos());
        
        System.out.println("\nLista de pais(es) vizinho(s) comum(ns) a " + pais3.getNome() + " e " 
                + pais5.getNome() + ": " + pais3.toStringPaisesVizinhosComuns(pais5));
        
        System.out.println("\n" + pais1.getNome() + " e " + pais6.getNome()
                + " sao paises iguais???? " + "\nResposta: " + pais1.isPaisIgual(pais6));
        
        System.out.println("\n" + pais4.getNome() + " e " + pais4.getNome()
                + " sao paises iguais???? " + "\nResposta: " + pais4.isPaisIgual(pais4));
    }
}
