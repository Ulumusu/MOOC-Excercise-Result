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
public class LyyraCard {
    private double balance;

    public LyyraCard(double balance) {
        this.balance=balance;
    }
    public double balance(){
        return this.balance;
    }
    public void loadMoney(double amount){
        this.balance+=amount;
    }
    
    public boolean pay(double amount){
        if (this.balance>=amount){
            this.balance-=amount;
            return true;
        }else{
            return false;
        }
    }

    
}


 //public String toString() {
   //     return "The card has "+this.balance+" euros.";
   // }
  //  public void payEconomical(){
   //     double money=2.5;
   //     if (this.balance>money){
   //         this.balance-=money;
  //      }
 //   }
  //  public void payGourmet(){
   //    double money=4;
   //     if (this.balance>money){
   //         this.balance-=money;
   //     }
 //   }
 //   public void loadMoney(double amount){
  //      if (amount<150){
 //       this.balance+=amount;  
 //       }else{
  //      this.balance=150;
 //       }