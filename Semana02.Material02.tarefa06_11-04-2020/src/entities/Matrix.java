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
public class Matrix {
    
    protected Integer[][] numbers;

    public Matrix() {
        this.numbers = new Integer[50][20];
    }

    public String getNumbers() {
        String temp = "";
        for(int l = 0; l <= 49; l++) {
            for(int c = 0; c <= 19; c++) {
                if(c != 19) {
                    temp += this.numbers[l][c] + ", ";
                }
                else{
                    temp += this.numbers[l][c];
                }
            }
            if(l != 49) {
                temp += "\n";
            }
        }
        return temp;
    }

    public void setNumber() {
        for(int line = 0; line < 50; line++) {
            int number;
            for(int column = 0; column < 20; column++) {
                number = 50 + (int)(Math.random() * 1001);
                this.numbers[line][column] = number;
            }
        }
    }
    
    public String searchNumber(int number) {
        String temp = "";
        int cont = 0;
        for(int l = 0; l < 50; l++) {
            for(int c = 0; c < 20; c++) {
                if(number == this.numbers[l][c]) {
                    temp += "\nmatrix[" + l + "][" + c + "] ";
                    cont++;
                }
            }
        }
        if(cont != 0) {
            return "Number found in: " + temp;
        }
        else {
            return "Unable to find the specified Number in the matrix!";
        }
    }
}
