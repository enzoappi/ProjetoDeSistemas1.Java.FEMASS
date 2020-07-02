/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author enzoappi
 */
public class Program {
    public static void main(String[] args) {
        try{
            //x = 10; //RuntimeException
            //int n = 5 + “5”; //RuntimeException
            //int [] nr = new int[2];
            //nr[2] = 10; //ArrayIndexOutOfBoundsException
            float r = 10 / 0; //ArithmeticException
        }
        /*catch(RuntimeException re) {
            System.out.println("ERROR: " + re.toString());
        }*/
        /*catch(ArrayIndexOutOfBoundsException aobe) {
            System.out.println("ERROR: " + aobe.toString());
        }*/
        catch(ArithmeticException ae) {
            System.out.println("ERROR: " + ae.toString());
        }
    }
}
