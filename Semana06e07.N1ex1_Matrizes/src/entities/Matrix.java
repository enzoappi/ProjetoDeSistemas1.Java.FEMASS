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
    
    protected Integer[][] matriz1;
    protected Integer[][] matriz2;
    protected Integer[][] matriz3;
    protected Integer[][] resultado;

    public Matrix() {
        this.matriz1 = new Integer[6][6];
        this.matriz2 = new Integer[6][6];
        this.matriz3 = new Integer[6][6];
        this.resultado = new Integer[6][6];
    }

    public String getResultado() {
        String temp = "";
        for(int l = 0; l < 6; l++) {
            for(int c = 0; c < 6; c++) {
                if(c != 6) {
                    temp += this.resultado[l][c] + ", ";
                }
                else{
                    temp += this.resultado[l][c];
                }
            }
            if(l != 6) {
                temp += "\n";
            }
        }
        return temp;
    }

    public void setMatriz1() {
        for(int line = 0; line < 6; line++) {
            int number;
            for(int column = 0; column < 6; column++) {
                number = 100 + (int)(Math.random() * 201);
                this.matriz1[line][column] = number;
            }
        }
    }
    
    public void setMatriz2() {
        for(int line = 0; line < 6; line++) {
            int number;
            for(int column = 0; column < 6; column++) {
                number = 100 + (int)(Math.random() * 201);
                this.matriz2[line][column] = number;
            }
        }
    }
    
    public void setMatriz3() {
        for(int line = 0; line < 6; line++) {
            int number;
            for(int column = 0; column < 6; column++) {
                number = 100 + (int)(Math.random() * 201);
                this.matriz3[line][column] = number;
            }
        }
    }
    
    public void mathMatrix(){
        for(int l = 0; l < 6; l++) {
            for(int c = 0; c < 6; c++) {
                this.resultado[l][c] = (this.matriz1[l][c] / this.matriz2[l][c]) - this.matriz3[l][c];
            }
        }
    }
}
