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
    
    public String improperTextTester() {
        Boolean test1 = this.text.contains("sexo");
        Boolean test2 = this.text.contains("sexo ");
        Boolean test3 = this.text.contains("sexo.");
        Boolean test4 = this.text.contains("sexo!");
        Boolean test5 = this.text.contains("sexo?");
        Boolean test6 = this.text.contains("sexo,");
        Boolean test7 = this.text.contains("sexual");
        Boolean test8 = this.text.contains("sexual ");
        Boolean test9 = this.text.contains("sexual.");
        Boolean test10 = this.text.contains("sexual!");
        Boolean test11 = this.text.contains("sexual?");
        Boolean test12 = this.text.contains("sexual,");
        if(test1 || test7) {
            return "Improper Content!";
        }
        else if(test2 || test8) {
            return "Improper Content!";
        }
        else if(test3 || test9) {
            return "Improper Content!";
        }
        else if(test4 || test10) {
            return "Improper Content!";
        }
        else if(test5 || test11) {
            return "Improper Content!";
        }
        else if(test6 || test12) {
            return "Improper Content!";
        }
        else {
            return "Aproved Content!";
        }
    }
}
