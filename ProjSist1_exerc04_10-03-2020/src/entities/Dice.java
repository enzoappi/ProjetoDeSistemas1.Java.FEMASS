/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author enzoappi
 */
public class Dice {
    
    protected Integer play1;
    protected Integer play2;
    protected Integer play3;

    public Dice() {
    }

    public Dice(Integer play1, Integer play2, Integer play3) {
        this.play1 = play1;
        this.play2 = play2;
        this.play3 = play3;
    }

    public Integer getPlay1() {
        return play1;
    }

    public void setPlay1() {
        int temp = (int) ((Math.random() * 6) + 1);
        this.play1 = temp;
    }

    public Integer getPlay2() {
        return play2;
    }

    public void setPlay2() {
        int temp = (int) ((Math.random() * 6) + 1);
        this.play2 = temp;
    }

    public Integer getPlay3() {
        return play3;
    }

    public void setPlay3() {
        int temp = (int) ((Math.random() * 6) + 1);
        this.play3 = temp;
    }
    
    public Integer sumValuesPlays(){
        return this.play1 + this.play2 + this.play3;
    }
    
}
