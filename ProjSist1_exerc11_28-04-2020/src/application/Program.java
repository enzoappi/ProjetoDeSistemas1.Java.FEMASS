/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.MyList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author enzoappi
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        MyList myList = new MyList();
        
        System.out.print("Number of elements in the List (non negative integer number): ");
        int numOfElem = sc.nextInt();
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
}
