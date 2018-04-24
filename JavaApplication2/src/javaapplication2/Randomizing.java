/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Random;

/**
 *
 * @author Mrek
 */
public class Randomizing {
    public static void main(String[] args){
        Random randomizer=new Random();
        int i=0;
        
        while (i<10){
            System.out.println(randomizer.nextInt(10));
            i++;
        }
    }
}
