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
public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    
    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
    
        this.rooms=rooms;
        this.pricePerSquareMeter=pricePerSquareMeter;
        this.squareMeters=squareMeters;
    
    }
    public boolean larger(Apartment other){
         if(this.squareMeters>other.squareMeters){
             return true;
         }else{
             return false;
         }
         
    }
    public int priceDifference(Apartment other){
        int one=this.squareMeters*this.pricePerSquareMeter;
        int two=other.squareMeters*other.pricePerSquareMeter;
        
        if(one>two){
            return one-=two;
        }else{
            return two-=one;
        }
    }
    public boolean moreExpensive(Apartment other){
        int one=this.squareMeters*this.pricePerSquareMeter;
        int two=other.squareMeters*other.pricePerSquareMeter;
        
        if(one>two){
            return true;
        }else{
            return false;
        }
    }
}
