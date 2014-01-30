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
 */
public class Moves {
 //private String getScore;
    @SuppressWarnings("empty-statement")
    public String getMoves(){
        int guess, tiles, x = 0; //, y = (int)(10 * Math.random()) ;
		// guess will be the number of clicks the player makes
		// y represents the clicks until the game is over
		tiles = 8;
            String scoreMsg = "\n" + "\"Let's begin!\"";
            //moveLoop;
	for( ; x <= tiles; x++){
            //System.out.println("What is your first guess?");
            scoreMsg = "\n" + "\"What is your first guess?\"";
		Scanner answer1 = new Scanner(System.in);
                x++;
        //System.out.println("What is your next guess?");
        scoreMsg = "\n" + "\"What is your next guess?\"";
		Scanner answer2 = new Scanner(System.in);
        
        if(answer1 == answer2){
                tiles-- ;
                //System.out.println("You got one!  Try again!");
                scoreMsg = "\n" + "\"You got one!  Try again!\"";
                }//freeze tiles if correct
        else{
                //System.out.println("Try again!");
                scoreMsg = "\n" + "\"Try again!\"";
                        }//reset 2 tiles
                //return moveLoop;
            }
        //if(tiles == 0){
            scoreMsg = "\n" + "\"You won the game!\""; 
            guess = x/2;
		//System.out.println("Moves: " + guess);
                scoreMsg = "\n" + "\"Moves: " + guess;
        return null;
        }
		
		}   


