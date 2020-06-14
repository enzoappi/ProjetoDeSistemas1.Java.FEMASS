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
public class Lamp {
    
    private Integer idCode;
    private String brand;
    private Float voltage;
    private Boolean state = false;

    public Lamp(int idCode, String brand, float voltage) {
        this.idCode = idCode;
        this.brand = brand;
        this.voltage = voltage;
    }

    public Integer getIdCode() {
        return idCode;
    }

    public void setIdCode(int idCode) {
        this.idCode = idCode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Float getVoltage() {
        return voltage;
    }

    public void setVoltage(float voltage) {
        this.voltage = voltage;
    }

    public String getState() {
        if(this.state) {
            return "(power) ON.";
        }
        else {
            return "(power) OFF.";
        }
    }

    public void setState() {
        if(this.state) {
            this.state = false;
        }
        else {
            this.state = true;
        }
    }
    
    
    
}
