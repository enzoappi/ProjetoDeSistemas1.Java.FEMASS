/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javax.swing.JOptionPane;

/**
 *
 * @author enzoappi
 */
public class Program {
    public static void main(String[] args) {
        int number1, number2 = 0, cont = 0;
        do {
            try {
                cont++;
                number1 = Integer.parseInt(JOptionPane.showInputDialog("First number: "));
                number2 = Integer.parseInt(JOptionPane.showInputDialog("Second number: "));

                float result = number1 / number2;
                JOptionPane.showMessageDialog(null, "RESULT = " + result);
            }
            catch (ArithmeticException ae) {
                JOptionPane.showMessageDialog(null, cont + "º try...\n"+ ae.toString()
                        + "\nTHE SECOND number MUST BE DIFERENT than ZERO!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }while(number2 == 0);
    }
}
