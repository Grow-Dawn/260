/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package meh.murray;

import java.util.Scanner;

/**
 *
 * @author Dawn Grow
 * 
 */

public class Moves { 
     
     public String name;
     public String UserIn;
     public Moves() {   //
    }
    public static void main(String score) {    //
 //private String getScore;
    @SuppressWarnings("empty-statement")
    //public String moveMsg;
        Moves answers = new Moves();
            System.out.println("Let's begin!");
            //String moveMsg = "\n" + "\"Let's begin!\"";
        //answers.answerBoth();
        //answers.answers();
        //answers.answer1();
        //answers.displayHelp();
        int guess, tiles, x = 0; //, y = (int)(10 * Math.random()) ;
		// guess will be the number of clicks the player makes
		// y represents the clicks until the game is over
		tiles = 16;
                //moveLoop;
        //public void answersBoth(){        
	for( ; x <= tiles; x++){
            //public void answers1(){
            System.out.println("What is your first guess?");
            //moveMsg = "\n" + "\"What is your first guess?\"";
            
            Scanner answer1 = new Scanner(System.in);
                //this.name = answer1.next();
                x++;
            //public void answers2(){    
            System.out.println("What is your next guess?");
                 //moveMsg = "\n" + "\"What is your next guess?\"";
		Scanner answer2 = new Scanner(System.in);
                //this.name = answer2.next();
        
        if(answer1 == answer2){
                tiles-- ;
                System.out.println("You got one!  Try again!");
                //moveMsg = "\n" + "\"You got one!  Try again!\"";
                }//freeze tiles if correct
        else{
                System.out.println("Try again!");
                //moveMsg = "\n" + "\"Try again!\"";
                        }//reset 2 tiles
                //return moveLoop;
            }
        //if(tiles == 0){
            System.out.println("You won the game!");
            //moveMsg = "\n" + "\"You won the game!\""; 
            guess = x/2;
		System.out.println("Moves: " + guess);
                //moveMsg = "\n" + "\"Moves: " + guess;
       // return null;
        }

    public boolean getMatch(String Move1, String Move2)
    {
        boolean Match = false;
        
        if (Move1 == Move2)
        {
            Match = true;
        }
        else
        {
            Match = false;
        }
        
        return Match;
    }
    
    public String getTile(String getTileMsg)
    {
        Scanner Move = new Scanner(System.in);
        System.out.println (getTileMsg);
        this.UserIn = Move.next();
        return this.UserIn;
    }
    
}   
