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
public class AverageGrade {
    
    private Float averageGrades;

    public AverageGrade(float grade1, float grade2) {
        this.averageGrades = (grade1 + grade2) / 2;
    }
    
    public AverageGrade(float grade1, float grade2, float grade3) {
        this.averageGrades = (grade1 + grade2 + grade3) / 3;
    }
    
    public AverageGrade(float grade1, float grade2, float grade3, float grade4) {
        this.averageGrades = (grade1 + grade2 + grade3 + grade4) / 4;
    }

    public Float getAverageGrades() {
        return averageGrades;
    }

    public void setAverageGrades(Float averageGrades) {
        this.averageGrades = averageGrades;
    }
}
