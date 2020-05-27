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
public class Calculator {
    
    protected Integer number;
    protected Integer sumDigits;

    public Calculator() {
    }

    public Calculator(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getSumDigits() {
        return sumDigits;
    }
    
    public void sumDigitsNumber() {
        int x = this.number / 10;
        int y = this.number % 10;
        this.sumDigits = x + y;
    } 
}
