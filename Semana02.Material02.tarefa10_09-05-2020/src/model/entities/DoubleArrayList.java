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
public class DoubleArrayList {
    
    private ArrayList<ArrayList<Integer>> doubleArrayList = new ArrayList<>();
    private Integer listDimension;
    private ArrayList<Integer> mainDiagonal = new ArrayList<>();

    public DoubleArrayList() {
    }

    public ArrayList<ArrayList<Integer>> getDoubleArrayList() {
        return doubleArrayList;
    }
    
    public void setDoubleArrayList(ArrayList<Integer> convertedIntegerNumbers) throws DomainException{
        if(convertedIntegerNumbers.size() != this.listDimension && convertedIntegerNumbers.size() != 1) {
            throw new DomainException("The given Line size must be equal than the first one!");
        }
        if(convertedIntegerNumbers.size() == 1 && convertedIntegerNumbers.get(0) != 0) {
            throw new DomainException("The given line size must be equal than the first one!");
        }
        if(convertedIntegerNumbers.size() == this.listDimension){
            this.doubleArrayList.add(convertedIntegerNumbers);
        }
    }

    public Integer getListDimension() {
        return listDimension;
    }

    public void setListDimension(ArrayList<Integer> numbersList) {
        this.listDimension = numbersList.size();
    }

    public ArrayList<Integer> getMainDiagonal() {
        if(this.mainDiagonal.size() != this.listDimension) {
            throw new NullPointerException("The given list is not a square dimension list (NOT A SQUARE MATRIX)!\n");
        }
        return mainDiagonal;
    }

    public void setMainDiagonal(ArrayList<Integer> list, int value) throws DomainException{
        if(list.size() != this.listDimension && list.size() != 1) {
            throw new DomainException("The given Line size must be equal than the first one!");
        }
        if(list.size() == 1 && list.get(0) != 0) {
            throw new DomainException("The given line size must be equal than the first one!");
        }
        if(list.size() == this.listDimension){
            this.mainDiagonal.add(list.get(value));
        }
    }
}
