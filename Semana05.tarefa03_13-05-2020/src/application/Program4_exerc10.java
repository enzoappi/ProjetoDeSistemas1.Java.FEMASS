/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import model.entities.DoubleArrayList_exerc10;
import java.util.ArrayList;
import java.util.Scanner;
import model.exceptions.DomainException;
import model.util.ArrayListTypeConverter_exerc10;

/**
 *
 * @author enzoappi
 */
public class Program4_exerc10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        DoubleArrayList_exerc10 doubleArrayList = new DoubleArrayList_exerc10();
        String numericPhrase = "";
        int l = 0;
        int zeroElement;
        try{
            do {
                ArrayList<Integer> convertedIntegerNumbers = new ArrayList<>();
                System.out.print("Type a non negative integer number sequence for line " + (l+1) + " [or type 0 to stop]: ");
                numericPhrase = sc.next();
                ArrayListTypeConverter_exerc10.ConvtStrNmbsToIntNmbs(numericPhrase, convertedIntegerNumbers); //Integer Parsed ArrayList
                if(l == 0) {
                    doubleArrayList.setListDimension(convertedIntegerNumbers);
                }
                doubleArrayList.setDoubleArrayList(convertedIntegerNumbers);
                doubleArrayList.setMainDiagonal(convertedIntegerNumbers, l);
                zeroElement = convertedIntegerNumbers.get(0);
                l++;
            }while(zeroElement != 0);
            System.out.println("\n\nLIST DATA:\n" + doubleArrayList.getDoubleArrayList() + "\n");
            System.out.println("List's main diagonal: " + doubleArrayList.getMainDiagonal() + "\n");
        }
        catch(NumberFormatException nfe){
            System.out.println("\n\nERROR: " + nfe.toString() + "\nThe character typed must be a integer number!");
        }
        catch(DomainException de) {
            System.out.println("\n\nProgram ERROR: " + de.getMessage());
        }
        catch(NullPointerException ne) {
            System.out.println("\n\nProgram ERROR: " + ne.getMessage());
        }
        sc.close();
    }
}