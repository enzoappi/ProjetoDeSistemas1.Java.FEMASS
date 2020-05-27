/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.util.ArrayList;
import model.exceptions.DomainException;

/**
 *
 * @author enzoappi
 */
public class DoubleArrayList_exerc9 {
    
    private ArrayList<ArrayList<Integer>> doubleArrayList = new ArrayList<>();

    public DoubleArrayList_exerc9() {
    }

    public ArrayList<ArrayList<Integer>> getDoubleArrayList() {
        return doubleArrayList;
    }

    public void setDoubleArrayList() {
        for(int l = 0; l < 50; l++) {
            ArrayList<Integer> numbers = new ArrayList<>();
            for(int c = 0; c < 20; c++) {
                numbers.add(50 + (int)(Math.random() * 1001));
            }
            this.doubleArrayList.add(numbers);
        }
    }
    
    public void indexOfElement(int value) throws DomainException{
        if(value < 0){
            throw new DomainException("The number must be greater than zero (0)!");
        }
        int cont = 0;
        for(int l = 0; l < 50; l++) {
            for(int c = 0; c < 20; c++) {
                if(doubleArrayList.get(l).get(c) == value) {
                    cont++;
                    System.out.println(value + " founded for the " + cont 
                            + "º time in element[" + c + "][" + l + "]");
                }
            }
        }
        if(cont == 0) {
            System.out.println("\n\nSorry!\nI couldn't find the given number in the Matrix!");
        }
    }

    public void getDoubleArrayListFormated() {
        System.out.print("Matrix Data:\n");
        for(ArrayList<Integer> line : this.doubleArrayList) {
            System.out.println("");
            for(int column : line) {
                System.out.print(column + "\t");
            }
        }
    }
}
