/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

/**
 *
 * @author enzoappi
 */
public class MyList {
    
    private ArrayList<Integer> total = new ArrayList<>();
    private ArrayList<Integer> hashTotal = new ArrayList<>();

    public MyList() {
    }

    public ArrayList<Integer> getTotal() {
        return total;
    }

    public void setTotal(int number) {
        this.total.add(number);
    }

    public ArrayList<Integer> getHashTotal() {
        return hashTotal;
    }

    public void setHashTotal() {
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(this.total);
        this.hashTotal = new ArrayList<>(hashSet);
    }
    
    public int valueFrequency(int number){
        return Collections.frequency(this.total, number);
    }
}
