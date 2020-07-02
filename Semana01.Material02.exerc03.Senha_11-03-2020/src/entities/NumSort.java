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
public class NumSort {
    
    protected Integer numSortLen;
    protected String numSort = "";

    public NumSort() {
    }

    public Integer getNumSortLen() {
        return numSortLen;
    }

    public void setNumSortLen() {
        this.numSortLen = (int) ((Math.random() * 10) + 1);
    }

    public String getNumSort() {
        return numSort;
    }
  
    public void numSort(){
        for(int i = 0; i < this.numSortLen; i++){
            this.numSort +=  String.valueOf(5 + (int)(Math.random() * 6)) + "  ";
        }
    }
    
    
}