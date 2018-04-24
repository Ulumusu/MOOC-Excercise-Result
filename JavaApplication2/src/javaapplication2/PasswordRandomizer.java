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
public class PasswordRandomizer {
    private Random random;
    private  int length;
    
    public PasswordRandomizer(int length){
        this.length=length;
        this.random=new Random();
    }
    public String createPassword(){
        String symbol="abcdefghijklmnopqrstuvwxyz";
        String password="";
        int i=0;
        while (i<=this.length){
            password+=symbol.charAt(this.random.nextInt(26));
            i++;
        }
        return password;
    }
}
