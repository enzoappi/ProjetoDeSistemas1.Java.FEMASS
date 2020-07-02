/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.AverageGrade;
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
        
        System.out.print("How many grades will be entered (from 2 to 4): ");
        int n = sc.nextInt();
        while(n < 2 || n > 4) {
            System.out.print("\nERROR!\nYou must enter from 2 to 4 grades total number\nHow many grades will be entered: ");
            n = sc.nextInt();
        }        
        if(n == 2) {
            System.out.print("\nGrade 1: ");
            float grade1 = sc.nextFloat();
            System.out.print("Grade 2: ");
            float grade2 = sc.nextFloat();
            AverageGrade averageGrade = new AverageGrade(grade1, grade2);
            System.out.print("\n\n\nDATA RESULT:\n\n");
            System.out.print("The average grade for the " + n
                    + " input(s) entered is: "
                    + averageGrade.getAverageGrades()
                    + "\n\n");
        }
        if(n == 3) {
            System.out.print("\nGrade 1: ");
            float grade1 = sc.nextFloat();
            System.out.print("Grade 2: ");
            float grade2 = sc.nextFloat();
            System.out.print("Grade 3: ");
            float grade3 = sc.nextFloat();
            AverageGrade averageGrade = new AverageGrade(grade1, grade2, grade3);
            System.out.print("\n\n\nDATA RESULT:\n\n");
            System.out.print("The average grade for the " + n
                    + " input(s) entered is: "
                    + averageGrade.getAverageGrades()
                    + "\n\n");
        }
        if(n == 4) {
            System.out.print("\nGrade 1: ");
            float grade1 = sc.nextFloat();
            System.out.print("Grade 2: ");
            float grade2 = sc.nextFloat();
            System.out.print("Grade 3: ");
            float grade3 = sc.nextFloat();
            System.out.print("Grade 4: ");
            float grade4 = sc.nextFloat();
            AverageGrade averageGrade = new AverageGrade(grade1, grade2, grade3, grade4);
            System.out.print("\n\n\nDATA RESULT:\n\n");
            System.out.print("The average grade for the " + n
                    + " input(s) entered is: "
                    + averageGrade.getAverageGrades()
                    + "\n\n");
        }
    }
}
