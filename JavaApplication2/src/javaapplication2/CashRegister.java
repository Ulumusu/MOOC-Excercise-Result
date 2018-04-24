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
public class CashRegister {
    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    
    public CashRegister(){
        this.cashInRegister=1000;
        this.economicalSold=0;
        this.gourmetSold=0;
                
       
    }
    public double payEconomical(double cashGiven){
        double price=2.50;
        if (cashGiven>=price){
            this.cashInRegister+=price;
            this.economicalSold++;
            return cashGiven-=price;
        }else{
            return 0;
        }
    }
    public double payGourmet(double cashGiven){
        double price=4;
        if (cashGiven>=price){
            this.cashInRegister+=price;
            this.gourmetSold++;
            return cashGiven-=price;
        }else{
            return 0;
        }
    }
    public boolean payEconomical(LyyraCard card){
        double price=2.50;
        if (card.balance() >= price){
            //this.cashInRegister+=price;
            this.economicalSold++;
            card.pay(price);
            return true;
        }else{
            return false;
        }
    }
    public boolean payGourmet(LyyraCard card){
        double price=4;
        if (card.balance() >= price){
            //this.cashInRegister+=price;
            this.gourmetSold++;
            card.pay(price);
            return true;
        }else{
            return false;
        }
    }
    public void loadMoneyToCard(LyyraCard card, double sum){
        if (sum>0){
            card.loadMoney(sum);
            this.cashInRegister+=sum;
        }
    }
    public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }
}
