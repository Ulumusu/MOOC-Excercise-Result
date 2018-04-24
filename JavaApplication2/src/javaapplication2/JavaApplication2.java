/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author Mrek
 */
public class JavaApplication2 {

    
    public static void main(String[] args){
        Team barcelona = new Team("FC Barcelona");

        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

        System.out.println("Total goals: " + barcelona.goals());
    
    }
}

