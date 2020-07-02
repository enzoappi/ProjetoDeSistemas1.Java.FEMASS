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
public class Tablet extends Eletronico{
    
    private int volume;

    public Tablet() {
        this.volume = 0;
    }

    public int getVolume() {
        return this.volume;
    }

    public void aumentarVolume() {
        if(this.volume < 100){
            this.volume += 1;
        }
    }
    
    public void diminuirVolume() {
        if(this.volume > 0){
            this.volume -= 1;
        }
    }
}
