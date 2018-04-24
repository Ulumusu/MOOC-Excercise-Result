/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


import java.util.ArrayList;




/**
 *
 * @author Mrek
 */
public class JavaApplication1 {

    public static void main(String[] args) {
        Account MattAccount=new Account("Matt's account", 1000);
        Account MyAccount=new Account("My account", 0);
        
        transfer(MattAccount, MyAccount, 500);
        
    }
    public static void transfer(Account from, Account to, double money){
        from.withdrawal(money);
        to.deposit(money);
        
        System.out.println(from.toText()+" money go to "+to.toText());
    }
    
}
        
    
    
    
    

    
    

    
    
       
    
    


