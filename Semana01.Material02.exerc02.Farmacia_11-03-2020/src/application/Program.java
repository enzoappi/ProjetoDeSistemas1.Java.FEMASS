/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Pharmacy;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author enzoappi
 */
public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        //creating a ArrayList for insert all medications 
        List<Pharmacy> list = new ArrayList<>();
        
        //initiating all variables that will be use in the program
        String resposta;
        String medicationId, name;
        float price;
        String data = "";
        
        do{
            medicationId = JOptionPane.showInputDialog(null, "Medication's ID: ");
            name = JOptionPane.showInputDialog(null, "Type the metication's name: ");
            price = Float.parseFloat(JOptionPane.showInputDialog(null, "Insert the medication's price: U$"));
            Pharmacy pharmacy = new Pharmacy(medicationId, name, price);
            pharmacy.setReajustPrice(12);
            list.add(pharmacy);
            resposta = JOptionPane.showInputDialog(null, "Type anything but 0 to stop: ");
        }while(!resposta.equals("0"));
        
        for(Pharmacy ph : list){
            data += "\nID: " + ph.getMedicationId() 
                    + " | Name: " + ph.getName() 
                    + " | Price: U$" + String.format("%.2f%n", ph.getPrice());
        }
        
        JOptionPane.showMessageDialog(null, "Pharmacy Data:\n" + data);
        
    }
}
