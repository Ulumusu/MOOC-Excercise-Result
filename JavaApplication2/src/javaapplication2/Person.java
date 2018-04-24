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
public class Person {
    
    private String name;
    private int age;
    private int weight;
    private int height;
    private MyDate birthMyDate;
    
//    public Person(String initialName, int age, int height, int weight){
//        this.name=initialName;
//        this.age=age;
        
//        this.height=height;
//        this.weight=weight;
        
//    }
    public Person(String name, int day, int month, int year){
        this.name=name;
        this.age=0;
        this.height=0;
        this.weight=0;
        this.birthMyDate=new MyDate(day,month, year);
    }
    
     public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex(){
        double heightDividedByHundred = this.height / 100.0;
        return this.weight / ( heightDividedByHundred * heightDividedByHundred );
    }
    
    public void printPerson(){
        System.out.println(this.name+", age "+this.age+" years");
    }
    public void becomeOlder(){
        this.age++;
    }
    public void becomeOlder(int years){
        this.age+=years;
    }
    public int getAge(){
        return this.age;
    }
    public boolean isAdult(){
        if (this.age<18){
            return false;
        }
        return true;  
       
    }
    
    public String toString(){
        return this.name+", born "+this.birthMyDate;
    }
    public String getName(){
        return this.name;
    }
    public double weightIndex(){
        return (double)this.weight/(double)Math.pow(this.height,2)*10000;
        
    }
    public int getWeight(){
        return this.weight;
    }
    boolean olderThan(Person compared){
        if (this.age>=compared.getAge()){
            return true;
        }else{
            return false;
        }
    }
    
}
