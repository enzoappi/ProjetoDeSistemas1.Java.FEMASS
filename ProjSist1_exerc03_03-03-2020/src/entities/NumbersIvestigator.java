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
public class NumbersIvestigator {
    
    protected Integer infLimit;
    protected Integer supLimit;
    protected Integer totSumEvenValues = 0;

    public NumbersIvestigator() {
    }

    public NumbersIvestigator(Integer infLimit, Integer supLimit) {
        this.infLimit = infLimit;
        this.supLimit = supLimit;
    }

    public Integer getInfLimit() {
        return this.infLimit;
    }

    public void setInfLimit(int[] numbers) {
        int minNumber = 0;
        for(int i = 0; i < numbers.length; i++){
            if(i == 0){
                minNumber = numbers[i];
            }
            else{
                if(numbers[i] < minNumber){
                    minNumber = numbers[i];
                }
            }
        }
        this.infLimit = minNumber;
    }
    
    public Integer getSupLimit() {
        return this.supLimit;
    }

    public void setSupLimit(int[] numbers) {
        int maxNumber = 0;
        for(int i = 0; i < numbers.length; i++){
            if(i == 0){
                maxNumber = numbers[i];
            }
            else{
                if(numbers[i] > maxNumber){
                    maxNumber = numbers[i];
                }
            }
        }
        this.supLimit = maxNumber;
    }

    public Integer getTotSumEvenValues() {
        return totSumEvenValues;
    }
    
    public void sumEvenNumbers(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                this.totSumEvenValues += numbers[i];
            }
        }
    }
    
}
