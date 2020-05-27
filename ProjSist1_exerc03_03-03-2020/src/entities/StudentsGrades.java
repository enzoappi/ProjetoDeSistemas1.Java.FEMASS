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
public class StudentsGrades {
    
    protected Float g1;
    protected Float g2;
    protected Float g3;
    protected Float average;

    public StudentsGrades() {
    }

    public StudentsGrades(Float g1, Float g2, Float g3) {
        this.g1 = g1;
        this.g2 = g2;
        this.g3 = g3;
    }

    public Float getG1() {
        return g1;
    }

    public void setG1(Float g1) {
        this.g1 = g1;
    }

    public Float getG2() {
        return g2;
    }

    public void setG2(Float g2) {
        this.g2 = g2;
    }

    public Float getG3() {
        return g3;
    }

    public void setG3(Float g3) {
        this.g3 = g3;
    }

    public Float getAverage() {
        return average;
    }
    
    public void averageCalculator(){
        this.average = ((this.g1 + this.g2 + this.g3) / 3);
    }
    
    
    
}
