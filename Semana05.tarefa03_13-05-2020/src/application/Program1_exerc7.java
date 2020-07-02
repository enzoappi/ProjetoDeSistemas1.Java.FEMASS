/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import model.entities.Lists_exerc7;
import java.util.InputMismatchException;
//import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import model.exceptions.DomainException;

/**
 *
 * @author enzoappi
 */
public class Program1_exerc7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int num = 0;
        
        Lists_exerc7 lists = new Lists_exerc7();
        
        try {
            for(int i = 1; i <= 20; i++){
                System.out.print("Type the " + i + "º a non negative integer number: ");
                num = sc.nextInt();
                if(num % 2 == 0) {
                    lists.setTotal(num);
                    lists.setEven(num);
                }
                else {
                    lists.setTotal(num);
                    lists.setOdd(num);
                } 
            }
            System.out.println("\nDATA RESULTS (before sorting):"
                    + "\nOriginal List created: " + lists.getTotal()
                    + "\nEven numbers in List: " + lists.getEven()
                    + "\nOdd numbers in List: " + lists.getOdd());

            lists.sortList();

            System.out.println("\nDATA RESULTS (after sorting):"
                    + "\nOriginal List created: " + lists.getTotal()
                    + "\nEven numbers in List: " + lists.getEven()
                    + "\nOdd numbers in List: " + lists.getOdd());

            sc.close();
        }
        catch(DomainException de) {
            System.out.println("\nERROR: " + de.getMessage());
        }
        catch(InputMismatchException ime) {
            System.out.println("\nERROR: " + ime.toString() + "\nYou didn't type a integer number!");
        }
    }
}
