/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Eletronico;
import entities.Radio;
import entities.Tablet;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ut2u
 */
public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Eletronico eletronico = new Eletronico();
        System.out.print(">>>>>> Objeto: eletronico, criado com sucesso! <<<<<<"
                + "\nInformacoes do objeto: "
                + "\nEsta ligado?  ->  " + eletronico.isLigado());
        System.out.println("\n\nVamos liga-lo, entao...");
        eletronico.ligar();
        System.out.print("Informacoes do objeto: "
                + "\nEsta ligado?  ->  " + eletronico.isLigado());
        System.out.println("\n\nDesligando...");
        eletronico.desligar();
        System.out.print("Informacoes do objeto: "
                + "\nEsta ligado?  ->  " + eletronico.isLigado());
        System.out.println("\n");
        
        Tablet tablet = new Tablet();
        System.out.print(">>>>>> Objeto: tablet, criado com sucesso! <<<<<<"
                + "\nInformacoes do objeto: "
                + "\nEsta ligado?  ->  " + tablet.isLigado());
        System.out.println("\n\nVamos liga-lo, entao...");
        tablet.ligar();
        System.out.print("Informacoes do objeto: "
                + "\nEsta ligado?  ->  " + tablet.isLigado()
                + "\nVolume atual: " + tablet.getVolume());
        System.out.println("\n\nVamos aumentar o volume, entao...");
        tablet.aumentarVolume();
        System.out.print("Informacoes do objeto: "
                + "\nVolume atual: " + tablet.getVolume());
        System.out.println("\n\nVamos diminuir o volume, entao...");
        tablet.diminuirVolume();
        System.out.print("Informacoes do objeto: "
                + "\nVolume atual: " + tablet.getVolume());
        System.out.println("\n\nDesligando...");
        tablet.desligar();
        System.out.print("Informacoes do objeto: "
                + "\nEsta ligado?  ->  " + tablet.isLigado());
        System.out.println("\n");
        
        Radio radio = new Radio();
        System.out.print(">>>>>> Objeto: radio, criado com sucesso! <<<<<<"
                + "\nInformacoes do objeto: "
                + "\nEsta ligado?  ->  " + radio.isLigado());
        System.out.println("\n\nVamos liga-lo, entao...");
        radio.ligar();
        System.out.print("Informacoes do objeto: "
                + "\nEsta ligado?  ->  " + radio.isLigado()
                + "\nTocando musica?  ->  " + radio.isTocandoMusica());
        System.out.println("\n\nVamos ouvir uma musica, entao...");
        radio.tocar_musica();
        System.out.print("Informacoes do objeto: "
                + "\nTocando musica?  ->  " + radio.isTocandoMusica());
        System.out.println("\n\nOK, chega de musica, por hoje...");
        radio.parar_musica();
        System.out.print("Informacoes do objeto: "
                + "\nTocando musica?  ->  " + radio.isTocandoMusica());
        System.out.println("\n\nDesligando...");
        radio.desligar();
        System.out.print("Informacoes do objeto: "
                + "\nEsta ligado?  ->  " + radio.isLigado());
        System.out.println("\n");
    }
}
