/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;

/**
 *
 * @author Mrek
 */
public class Team {
    public String name;
    public ArrayList<Player> group=new ArrayList<Player>();
    public int maxSize;
    public int numberOfPlayers;
    
    public Team(String name){
        this.name=name;
        this.maxSize=16;
        this.numberOfPlayers=0;
    }
    public String getName(){
        return this.name;
    }
    public void addPlayer(String name, int goals){
        if(this.numberOfPlayers<=this.maxSize){
            group.add(new Player(name,goals));
            this.numberOfPlayers++;
        }
        
    }
    public void addPlayer(Player name){
        if(this.numberOfPlayers<this.maxSize){
            group.add(name);
            this.numberOfPlayers++;
        }
    }
    public void printPlayers(){
        for(Player player:group){
            System.out.println(player);
        }
    }
    public void setMaxSize(int maxSize){
        this.maxSize=maxSize;
    }
    public int size(){
        return this.numberOfPlayers;
    }
    public int goals(){
        int sumOfGoals=0;
        for (Player player: group){
            sumOfGoals+=player.goals();
        }
        return sumOfGoals;
    }
    
    
}
