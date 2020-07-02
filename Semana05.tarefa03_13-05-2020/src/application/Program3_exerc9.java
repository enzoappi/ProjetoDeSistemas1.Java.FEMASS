/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.InputMismatchException;
import model.entities.DoubleArrayList_exerc9;
import java.util.Scanner;
import model.exceptions.DomainException;

/**
 *
 * @author enzoappi
 */
public class Program3_exerc9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        DoubleArrayList_exerc9 doubleArrayList = new DoubleArrayList_exerc9();
        
        doubleArrayList.setDoubleArrayList();
        
        doubleArrayList.getDoubleArrayListFormated();
        
        try{
            System.out.print("\n\nType a non negative integer number: ");
            int number = sc.nextInt();

            doubleArrayList.indexOfElement(number);
        }
        catch(DomainException de){
            System.out.println("\n\nERROR: " + de.getMessage());
        }
        catch(InputMismatchException ime){
            System.out.println("\n\nERROR: " + ime.toString() + "\nThe character typed must be a integer number!");
        }
    }
}
