/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Lamp;
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
        
        Lamp lamp1 = new Lamp(123, "GeneralEletric", 20);
        System.out.print("\n\nThe " + lamp1.getBrand() + " "
                + lamp1.getVoltage() + "V lamp, "
                + "code " + lamp1.getIdCode() + " is "
                + lamp1.getState());
        lamp1.setState();
        System.out.print("\nHey, wait a sec... Now it's " + lamp1.getState());
        
        
        Lamp lamp2 = new Lamp(123, "Philips", 30);
        System.out.print("\n\nThe " + lamp2.getBrand() + " "
                + lamp2.getVoltage() + "V lamp "
                + " code " + lamp2.getIdCode() + " is "
                + lamp2.getState());
        lamp2.setState();
        System.out.print("\nJeezz!\nJust a sec, again... Now it's also " + lamp2.getState());
    }
}
