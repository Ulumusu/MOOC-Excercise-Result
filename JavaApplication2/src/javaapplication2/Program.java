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
public class Program {
    public static void main(String[] args) {
       HangmanLogic l = new HangmanLogic("kissa");
       System.out.println("word is: "+l.hiddenWord());

       System.out.println("guessing: A, D, S, F, D");
       l.guessLetter("A");
       l.guessLetter("K");
       l.guessLetter("S");
       l.guessLetter("I");
       l.guessLetter("D");
       System.out.println("guessed letters: "+l.guessedLetters());
       System.out.println("number of faults: "+l.numberOfFaults());
       System.out.println("word now: "+l.hiddenWord());
    }
}
