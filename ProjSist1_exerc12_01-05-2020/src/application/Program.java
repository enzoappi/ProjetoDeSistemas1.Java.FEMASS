/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.DoubleArrayList;
import java.util.Scanner;

/**
 *
 * @author enzoappi
 */
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        DoubleArrayList doubleArrayList = new DoubleArrayList();
        
        doubleArrayList.setDoubleArrayList();
        
        doubleArrayList.getDoubleArrayListFormated();
        
        System.out.print("\n\nType a non negative integer number: ");
        int number = sc.nextInt();
        
        doubleArrayList.indexOfElement(number);
        
    }
}
