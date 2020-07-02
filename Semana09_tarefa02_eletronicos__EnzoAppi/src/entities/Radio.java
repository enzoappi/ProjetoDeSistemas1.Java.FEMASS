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
public class Radio extends Eletronico{
    
    private boolean tocandoMusica;

    public Radio() {
        this.tocandoMusica = false;
    }

    public boolean isTocandoMusica() {
        return this.tocandoMusica;
    }
    
    public void tocar_musica() {
        if(!this.tocandoMusica) {
            this.tocandoMusica = true;
        }
    }
    
    public void parar_musica() {
        if(this.tocandoMusica) {
            this.tocandoMusica = false;
        }
    }
}
