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
public class Eletronico {
    
    private boolean ligado;

    public Eletronico() {
        this.ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }
    
    public void ligar() {
        if(!this.ligado){
            this.ligado = true;
        }
    }
    
    public void desligar() {
        if(this.ligado){
            this.ligado = false;
        }
    }
}
