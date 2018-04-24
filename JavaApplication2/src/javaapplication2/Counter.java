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
public class Counter {
    
    private int startingValue;
    private boolean check;
    
    public Counter (int startingValue, boolean check){
        this.startingValue=startingValue;
        this.check=check;
    }
    public Counter(int startingValue){
        this (startingValue, false);
    }
    public Counter(boolean check){
        this (0, check);
    }
    public Counter(){
        this.startingValue=0;
        this.check=false;
    }
    public int value(){
        return this.startingValue;
    }
    public void inrease(){
        this.startingValue++;
    }
    public void decrease(){
        if (this.check){
            if (this.startingValue>=1){
                this.startingValue--;
            }
            
        }else{
            this.startingValue--;
        }
    }
    public void increase(int increaseAmount){
        if (increaseAmount>0){
            this.startingValue+=increaseAmount;
        }
    }
    public void decrease(int decreaseAmount){
        if (this.check){
            if (this.startingValue>=1){
                if (this.startingValue>decreaseAmount){
                    if(0<decreaseAmount){
                        this.startingValue-=decreaseAmount;
                    }
                }
            }
            
        }else{
            this.startingValue--;
        }
    }
}
