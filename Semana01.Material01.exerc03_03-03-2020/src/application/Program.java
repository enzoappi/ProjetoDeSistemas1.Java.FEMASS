/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Locale;
import javax.swing.JOptionPane;
import entities.NumbersIvestigator;
import entities.StudentsGrades;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author enzoappi
 */
public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        //3.1 - NUMBERS INVESTIGATION
        int n = Integer.parseInt(JOptionPane.showInputDialog("How many numbers "
                + "will you insert? "));
        int[] numbers = new int[n];
                
        for(int i = 0; i < n; i++){
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "Please insert the #" + (i + 1) 
                    + "# INTEGER NUMBER for the array: "));
        }
        
        //Calculationg results
        NumbersIvestigator numInvestr = new NumbersIvestigator();
        numInvestr.setInfLimit(numbers);
        numInvestr.setSupLimit(numbers);
        numInvestr.sumEvenNumbers(numbers);
        
        //Printing results
        JOptionPane.showMessageDialog(null, "Vector Data:\n"
                + "Inferior number: " + numInvestr.getInfLimit()
                + "\nSuperior number: " + numInvestr.getSupLimit() 
                + "\nEven numbers sum value: " + numInvestr.getTotSumEvenValues());
        
        //3.2 STUDENTS AVERAGE GRADE
        float sumTotGrades = 0, totAvgGrade = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Number of student: "));
        List<StudentsGrades> list = new ArrayList<>(n);
        
        for(int i = 0; i < n; i++){
            float g1 = Float.parseFloat(JOptionPane.showInputDialog("Insert "
                    + "the first grade of the #"+ (i + 1) + " student: " ));
            float g2 = Float.parseFloat(JOptionPane.showInputDialog("Insert "
                    + "the first grade of the #"+ (i + 1) + " student: " ));
            float g3 = Float.parseFloat(JOptionPane.showInputDialog("Insert "
                    + "the first grade of the #"+ (i + 1) + " student: " ));
            sumTotGrades += (g1 + g2 + g3);
            StudentsGrades student = new StudentsGrades(g1, g2, g3);
            student.averageCalculator();
            list.add(student);
        }
        totAvgGrade = sumTotGrades / (n * 3);
        
        //Formating to text for printing everithing in the same pane...
        int j = 0;
        String finalData = "Average Grades: ";
        for(StudentsGrades sg : list){
            j++;
            finalData += "\nStudent #" + (j + 1) + " :" + sg.getAverage();
        }
        
        //Printing results
        JOptionPane.showMessageDialog(null, finalData + "\nClass Average: " 
                    + totAvgGrade);
    }
}
