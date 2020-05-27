/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Matrix;
import java.util.Locale;
import javax.swing.JOptionPane;


/**
 *
 * @author enzoappi
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Matrix matrix = new Matrix();
        matrix.setNumber();
        JOptionPane.showMessageDialog(null, "Matrix Data:\n[ " + matrix.getNumbers() + " ]");
        
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Type an aleatory integer number between 50 and 1050: "));
        
        JOptionPane.showMessageDialog(null, matrix.searchNumber(number));
    }
}
