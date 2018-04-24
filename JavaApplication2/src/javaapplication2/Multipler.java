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

public class Multipler {
    private int number;
    
    public Multipler(int num){
        this.number=num;
    }
    public int multiply(int multi){
       return this.number=this.number*multi;   
    }
    public void print(){
        System.out.println(this.number);
    }
} 

