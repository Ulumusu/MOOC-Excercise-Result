/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Mrek
 */
public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;
    
    public LotteryNumbers(){
        this.numbers=new ArrayList<Integer>();
        this.drawNumbers();
    }
    public ArrayList<Integer> numbers(){
        return this.numbers;
    }
    public void drawNumbers(){
      int i=0;
      while(i<=7){
          this.numbers.add(random.nextInt(39));
          i++;
      }
   
    }
    public boolean containsNumber(int number){
        if (this.numbers.contains(number)){
            return true;
        }else{
            return false;
        }
    }
    
}
