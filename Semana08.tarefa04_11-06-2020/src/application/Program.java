/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Truck;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author enzoappi
 */
public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nCreating a new truck...");
        Truck truck = new Truck();
        System.out.print("\nTruck created!");
        System.out.print("\nFuel type: " + truck.getFuel()
                + "\nActual Speed: " + truck.getSpeed() + "Km/h\n");
        System.out.print("\nLet's accelerate...");
        truck.increaseSpeed(50.7);
        System.out.print("\nTruck's actual Speed: " + truck.getSpeed() + "Km/h\n");
        System.out.print("\nLet's accelerate a little bit more...");
        truck.increaseSpeed(100.3);
        System.out.print("Truck's actual Speed: " + truck.getSpeed() + "Km/h\n");
        System.out.print("\nWe're to fast!\nLet's deaccelerate a little bit...");
        truck.decreaseSpeed(70.5);
        System.out.print("\nTruck's actual Speed: " + truck.getSpeed() + "Km/h\n");
        System.out.println("\n\nOk!\nLet's change the fuel!...");
        truck.setFuel("DIESEL");
        System.out.print("(Actual) Fuel type: " + truck.getFuel() + "\n");
        System.out.println("\nLet's change the fuel type again!...");
        truck.setFuel("Water");
        System.out.print("\n(Actual) Fuel type: " + truck.getFuel() + "\n");
    }
    
}
