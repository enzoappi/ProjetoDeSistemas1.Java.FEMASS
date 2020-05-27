/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.NumSort;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author ut2u
 */
public class Program {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        NumSort ns = new NumSort();
        ns.setNumSortLen();
        ns.numSort();
        
        JOptionPane.showMessageDialog(null, "Data created:\n" 
                + "\nPassword length: " + ns.getNumSortLen() 
                + "\nPassword created: " + ns.getNumSort());
    }
}