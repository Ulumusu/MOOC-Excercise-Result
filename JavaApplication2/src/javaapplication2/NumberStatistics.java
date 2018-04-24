/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Mrek
 */
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers=0;
        this.sum=0;
    }

    

    public void addNumber(int number) {
        
            this.sum+=number;
            this.amountOfNumbers++;
        
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }
    public int sum(){
        return this.sum;
    }
    public double average(){
        return (double)this.sum / (double)this.amountOfNumbers;
    }
}
