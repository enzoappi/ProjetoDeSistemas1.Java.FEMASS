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
    
    private ArrayList<Integer> total = new ArrayList<>();
    private ArrayList<Integer> even = new ArrayList<>();
    private ArrayList<Integer> odd = new ArrayList<>();

    public Lists() {
    }

    public ArrayList<Integer> getTotal() {
        return total;
    }

    public void setTotal(int number) {
        this.total.add(number);
    }

    public ArrayList<Integer> getEven() {
        return even;
    }

    public void setEven(int number) {
        this.even.add(number);
    }

    public ArrayList<Integer> getOdd() {
        return odd;
    }

    public void setOdd(int number) {
        this.odd.add(number);
    }
    
    public void sortList(){
        Collections.sort(this.total);
        Collections.sort(this.even);
        Collections.sort(this.odd);
    }
}
