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
public class DecreasingCounter {
    private int value;   // object variable that remembers the value of the counter
    private int initial;
    
    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initial=valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }
    public void decrease() {
        if (this.value==0){
            this.value=0;
        }else{
          this.value--;  
        }
        System.out.println("value: " + this.value);
    }
    public void reset(){
        this.value=0;
    }
    public void initial(){
        this.value=this.initial;
    }
}
