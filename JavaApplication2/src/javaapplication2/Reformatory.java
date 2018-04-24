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
public class Reformatory {
    
    private int totalNumber;
    
    public int weight(Person person){
        this.totalNumber++;
        return person.getWeight();
        
    }
    public void feed(Person person){
      person.setWeight(person.getWeight()+1);
           
    }
    public int totalWeightsMeasured(){
        return this.totalNumber;
    }
}
