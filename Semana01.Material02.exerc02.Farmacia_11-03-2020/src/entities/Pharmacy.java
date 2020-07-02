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
public class Pharmacy {
    
    protected String medicationId;
    protected String name;
    protected Float price;

    public Pharmacy() {
    }

    public Pharmacy(String medicationId, String name, float price) {
        this.medicationId = medicationId;
        this.name = name;
        this.price = price;
    }

    public String getMedicationId() {
        return medicationId;
    }

    public void setMedicationId(String medicationId) {
        this.medicationId = medicationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    public void setReajustPrice(float percentage){
        if((int) percentage > 1.0){
            float temp = percentage / 100;
            this.price = (float) (Math.round(this.price + (this.price * temp)));
        }
        else{
            this.price = (float) (Math.round(this.price * (this.price * percentage)));
        }
    } 
}
