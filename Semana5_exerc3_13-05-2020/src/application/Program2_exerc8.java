/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.InputMismatchException;
import model.entities.MyList_exerc8;
import java.util.Locale;
import java.util.Scanner;
import model.exceptions.DomainException;

/**
 *
 * @author enzoappi
 */
public class Program2_exerc8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        MyList_exerc8 myList = new MyList_exerc8();
        
        try{
            System.out.print("Number of elements in the List (non negative integer number): ");
            int numOfElem = sc.nextInt();
            if(numOfElem < 0) {
                throw new DomainException("The number must be greater than zero(0)!");
            }
            int elem = 0;

            for(int i = 1; i <= numOfElem; i++){
                System.out.print("Type the " + i + "º a non negative integer number: ");
                elem = sc.nextInt();
                myList.setTotal(elem);
            }

            myList.setHashTotal();

            System.out.println("\nDATA RESULTS:");
            System.out.print("\nList: " + myList.getTotal() + "\n");
            for(int ev : myList.getHashTotal()){
                System.out.print("Element value: " + ev
                        + " -> List frequency: " + myList.valueFrequency(ev));
                System.out.println();
            }
        }
        catch(DomainException de) {
            System.out.println("\nERROR: " + de.getMessage());
        }
        catch(InputMismatchException ime) {
            System.out.println("\nERROR: " + ime.toString() + "\nYou didn't type a integer number!");
        }
    }
}
