/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.util.ArrayList;
import java.util.Collections;
import model.exceptions.DomainException;

/**
 *
 * @author enzoappi
 */
public class Lists_exerc7 {
    
    private ArrayList<Integer> total = new ArrayList<>();
    private ArrayList<Integer> even = new ArrayList<>();
    private ArrayList<Integer> odd = new ArrayList<>();

    public Lists_exerc7() {
    }

    public ArrayList<Integer> getTotal() {
        return total;
    }

    public void setTotal(int number) throws DomainException{
        if(number < 0) {
            throw new DomainException("The number must be greater than zero (0)!");
        }
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
