/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Note;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author enzoappi
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        String text = JOptionPane.showInputDialog(null, "Type a aleatory text: ");
        
        Note note = new Note(text);
        
        JOptionPane.showMessageDialog(null, "Original text was: " + note.getText()
                + "\nEdited text is: " + note.reverseText());
        
    }
}
