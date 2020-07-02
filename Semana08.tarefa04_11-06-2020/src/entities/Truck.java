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
public class Truck {
    
    private String fuel = "GASOLINE";
    private Double speed = 0.0;

    public Truck() {
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        String fuelUpperCase = fuel.toUpperCase();
        if(fuelUpperCase.contains("DIESEL") || fuelUpperCase.contains("GAS") || fuelUpperCase.contains("GASOLINE")) {
            System.out.print("Fuel type changed successfully!\n");
            this.fuel = fuel;
        }
        else {
            System.out.print("Cannot change from the actual type to the type of fuel inserted!");
        }
    }

    public Double getSpeed() {
        return speed;
    }

    public void increaseSpeed(double acceleration) {
        if(this.speed < 150.0) {
            double temp = this.speed + acceleration;
            if(temp <= 150.0) {
                this.speed = temp;
            }
            else {
                System.out.println("\nImpossible to go faster than 150.0 Km/h");
                this.speed = 150.0;
            }
        }
    }
    
    public void decreaseSpeed(double deacceleration) {
        if(this.speed > 0.0) {
            double temp = this.speed - deacceleration;
            if(temp >= 0.0) {
                this.speed = temp;
            }
            else {
                this.speed = 0.0;
            }
        }
    }
    
    
    
}
