/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author enzoappi
 */
public class Lists {
    
    private ArrayList<Integer> basico = new ArrayList<>();
    private ArrayList<Integer> multiploDeTres = new ArrayList<>();
    private ArrayList<Integer> multiploDeQuatro = new ArrayList<>();
    private ArrayList<Integer> restante = new ArrayList<>();

    public Lists() {
    }

    public ArrayList<Integer> getBasico() {
        return basico;
    }

    public void setBasico(int number) {
        this.basico.add(number);
    }

    public ArrayList<Integer> getMultiploDeTres() {
        return multiploDeTres;
    }

    public void setMultiploDeTres(int number) {
        this.multiploDeTres.add(number);
    }

    public ArrayList<Integer> getMultiploDeQuatro() {
        return multiploDeQuatro;
    }

    public void setMultiploDeQuatro(int number) {
        this.multiploDeQuatro.add(number);
    }

    public ArrayList<Integer> getRestante() {
        return restante;
    }

    public void setRestante(int number) {
        this.restante.add(number);
    }
    
    public void sortList(){
        Collections.sort(this.basico);
        Collections.sort(this.multiploDeTres);
        Collections.sort(this.multiploDeQuatro);
        Collections.sort(this.restante);
    }
}
