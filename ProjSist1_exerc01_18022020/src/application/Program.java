/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Rectangle;
import entities.Calculator;
import entities.IMC_Index;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author enzoappi
 */
public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        //1.1 - Rectangle perimeter and area calculation
        double height, width;
        
        height = Float.parseFloat(JOptionPane.showInputDialog("Insert the rectangle height value: "));
        width = Float.parseFloat(JOptionPane.showInputDialog("Insert the rectangle width value: "));
        
        Rectangle rectangle = new Rectangle(height, width);
        rectangle.calcPerimeter();
        rectangle.calcArea();
        
        JOptionPane.showMessageDialog(null, "Rectangle perimeter: "
                + String.format("%.2f%n", rectangle.getPerimeter()) 
                + "meters");
        JOptionPane.showMessageDialog(null, "Rectangle area: "
                + String.format("%.2f%n", rectangle.getArea()) 
                + "meters");
        
        //1.2 Sum Digit Calculator
        int number;
        
        number = Integer.parseInt(JOptionPane.showInputDialog("Insert a TWO DIGITS INTEGER number: "));
        
        Calculator numberCalculator = new Calculator(number);
        numberCalculator.sumDigitsNumber();
        
        JOptionPane.showMessageDialog(null, "Digits sum: "
                + numberCalculator.getSumDigits());
        
        
        //1.3 IMC Index
        double personHeight, personWeight;
        
        personHeight = Float.parseFloat(JOptionPane.showInputDialog("Height: "));
        personWeight = Float.parseFloat(JOptionPane.showInputDialog("Weight: "));
        
        IMC_Index imcIndex = new IMC_Index(personHeight, personWeight);
        imcIndex.imcCalc();
        
        if(imcIndex.getImc() < 18.5) {
            JOptionPane.showMessageDialog(null, "IMC value: " 
                    + String.format("%.1f%n", imcIndex.getImc()) 
                    + " BELOW NORMAL");
        }
        else if(imcIndex.getImc() < 24.4) {
            JOptionPane.showMessageDialog(null, "IMC value: " 
                    + String.format("%.1f%n", imcIndex.getImc()) 
                    + " IDEAL");
        }
        else if(imcIndex.getImc() < 29.9) {
            JOptionPane.showMessageDialog(null, "IMC value: " 
                    + String.format("%.1f%n", imcIndex.getImc()) 
                    + " PRE OBESE");
        }
        else if(imcIndex.getImc() < 34.9) {
            JOptionPane.showMessageDialog(null, "IMC value: " 
                    + String.format("%.1f%n", imcIndex.getImc()) 
                    + " OBESE CLASS I");
        }
        else if(imcIndex.getImc() < 39.9) {
            JOptionPane.showMessageDialog(null, "IMC value: " 
                    + String.format("%.1f%n", imcIndex.getImc()) 
                    + " OBESE CLASS II");
        }
        else{
            JOptionPane.showMessageDialog(null, "IMC value: " 
                    + String.format("%.1f%n", imcIndex.getImc()) 
                    + " OBESE CLASS III");
        }
        
    }
    
}
