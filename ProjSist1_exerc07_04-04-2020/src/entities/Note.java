/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author enzoappi
 */
public class Note {
    
    protected String text;
    
    public Note(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
    
    public String reverseText() {
        String reverseText = "";
        for(int i = this.text.length() - 1; i >= 0; i--) {
            reverseText += this.text.charAt(i);
        }
        return reverseText.trim();
    }
    
}
