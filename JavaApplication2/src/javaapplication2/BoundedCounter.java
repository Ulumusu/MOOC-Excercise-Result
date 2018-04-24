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
public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int value) {
        this.upperLimit=59;
        this.value=value;
        
    }

    public void next() {
        this.value++;
        if (this.value>this.upperLimit){
            this.value=0;
            
        }
    }
    public int getValue(){
        return this.value;
    }
    public int setValue(int value){
        return this.value=value;
    }

    public String toString() {
     if(this.value<10){
         return "0"+this.value;
     }else{
         return ""+this.value;
     }
    }
}
