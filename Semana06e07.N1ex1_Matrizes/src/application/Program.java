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
        matrix.setMatriz1();
        matrix.setMatriz2();
        matrix.setMatriz3();
        matrix.mathMatrix();
        
        JOptionPane.showMessageDialog(null, "Matrix Data:\n[ " + matrix.getResultado()+ " ]");
        
        
    }
}
