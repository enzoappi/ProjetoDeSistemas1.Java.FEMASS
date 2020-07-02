/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Dice;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author enzoappi
 */
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        
        Dice dice = new Dice();
        dice.setPlay1();
        dice.setPlay2();
        dice.setPlay3();
        int sumValues = dice.sumValuesPlays();
        
        JOptionPane.showMessageDialog(null, "Data results:" 
                + "\nPlay 1: " + dice.getPlay1()
                + "\nPlay 2: " + dice.getPlay2()
                + "\nPlay 3: " + dice.getPlay3()
                + "\nSum of plays: " + sumValues);
        
    }
    
}
