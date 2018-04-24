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
public class HangmanLogic {
    private String word;
    private String guessedLetters;
    private int numberOfFaults;
    

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
        
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
       
        if(!this.guessedLetters.contains(letter)){
                if(this.word.contains(letter)){
                    this.guessedLetters += letter;
                    
                } else {
                    this.numberOfFaults++;
                    this.guessedLetters += letter;
                }
        }
  
    }
    

    public String hiddenWord() {
        String result="";
        int i=0;
        while (i<this.word.length()){
            String w=Character.toString(this.word.charAt(i)); //change char to string
            
            if (this.guessedLetters.contains(w)){
                result+=w;
            }else{
                result+="_";
            }
            i++;
            if (this.word.equals(result)){
                break;
            }
        }
        

        return result;
    }
}
