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
public class IMC_Index {
    
    protected Double height;
    protected Double weight;
    protected Double imc;

    public IMC_Index() {
    }

    public IMC_Index(Double height, Double weight) {
        this.height = height;
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getImc() {
        return imc;
    }
    
    public void imcCalc() {
        this.imc = this.weight / Math.pow(this.height, 2);
    }
    
    
}
