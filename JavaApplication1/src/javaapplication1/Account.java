/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Mrek
 */
public class Account {

    private  double balance;
    private  String client;
    
    
    public Account(String client, double balance){
        this.balance=balance;
        this.client=client;
    }
    public void deposit(double ammount){
        balance+=ammount;
    }
    public void withdrawal(double ammount){
        balance-=ammount;
    }
    public double balance(){
        return balance;
    }
    public String toText(){
        return client+" and "+balance;
    }
}
