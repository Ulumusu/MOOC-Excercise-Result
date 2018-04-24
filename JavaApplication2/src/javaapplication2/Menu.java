/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;

/**
 *
 * @author Mrek
 */
public class Menu {
    
    private ArrayList<String> meals;
    
    public  Menu(){
        this.meals=new ArrayList<String>();  
    }
    public void add(String proposition){
        this.meals.add(proposition);
    }
    public void print(){
        for (int i=0; i<=this.meals.size()-1;i++){
            System.out.println(this.meals.get(i));
        }
    }
    public void clearMenu(){
        this.meals.clear();
    }
}
